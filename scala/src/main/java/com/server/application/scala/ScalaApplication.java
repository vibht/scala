package com.server.application.scala;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.server.application.scala.backgroundProcess.MskMonitorProcess;

@SpringBootApplication
@EnableScheduling
public class ScalaApplication {

	public static void main(String[] args) throws InterruptedException {
		threadProperties();
		SpringApplication.run(ScalaApplication.class, args);

	}

	public static void threadProperties() {
		MskMonitorProcess pp = new MskMonitorProcess();
		pp.scheduleTask();
	}

}
