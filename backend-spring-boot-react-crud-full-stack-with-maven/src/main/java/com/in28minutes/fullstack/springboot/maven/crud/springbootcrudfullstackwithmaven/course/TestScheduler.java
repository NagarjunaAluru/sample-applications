package com.in28minutes.fullstack.springboot.maven.crud.springbootcrudfullstackwithmaven.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = { "http://localhost:3000", "http://localhost:4200" })
@RestController
public class TestScheduler {
	
	@Autowired
	private SampleScheduler sampleScheduler;

	@GetMapping("/scheduler")
	public void executeScheduler() {
		sampleScheduler.executePeriodically("*/10 * * * * MON-FRI");
	}

	@RequestMapping("/test")
	public String test() {
		return "Executed Successfully";
	}
}