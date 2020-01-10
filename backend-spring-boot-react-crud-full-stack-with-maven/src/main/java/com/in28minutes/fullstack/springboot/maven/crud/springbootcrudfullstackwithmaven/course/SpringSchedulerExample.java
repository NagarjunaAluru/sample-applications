package com.in28minutes.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course;

import java.util.Calendar;
import java.util.TimeZone;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSchedulerExample {
    
	ThreadPoolTaskScheduler scheduler;
	
    @RequestMapping("/startScheduler")
    public String start() {
    	scheduler = new ThreadPoolTaskScheduler();
    	scheduler.setPoolSize(10); // Number of Threads
    	scheduler.initialize();
    	scheduler.schedule(executeTask(), new CronTrigger("0/10 * * * * MON-FRI",TimeZone.getTimeZone("America/New_York")));
        return "Schedulet Started Successfully";
    }
    
    @RequestMapping("/stopScheduler")
    public String stop() {
    	if(scheduler != null)
    		scheduler.getScheduledThreadPoolExecutor().shutdownNow();
        return "Scheduler Stopped Successfully";
    }

	private Runnable executeTask() {
		return () -> System.out.println("Task executed:"+Calendar.getInstance().getTime());
	}
    
}