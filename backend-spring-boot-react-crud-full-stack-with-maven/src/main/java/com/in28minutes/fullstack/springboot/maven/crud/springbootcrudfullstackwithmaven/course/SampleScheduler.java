package com.in28minutes.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

@Component
public class SampleScheduler {
	
	ThreadPoolTaskScheduler scheduler = new ThreadPoolTaskScheduler();

	
	private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	
	
	public void executePeriodically(String cronTime){
		scheduler.setPoolSize(3);
		scheduler.initialize();
		scheduler.schedule(executeTask(), new CronTrigger(cronTime));
	}
	
	private Runnable executeTask(){
		return() -> System.out.println("Fixed Rate Task :: Execution Time - " + dateTimeFormatter.format(LocalDateTime.now()));
	}

}
