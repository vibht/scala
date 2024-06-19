package com.server.application.scala.backgroundProcess;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.server.application.scala.threads.findMSKThread;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;

@Service
public class findMSKProcess {
    private static final Logger logger = LogManager.getLogger(findMSKProcess.class);

    private static final Integer MAX_THREADS = 1;

    private final ExecutorService threadPool = Executors.newFixedThreadPool(MAX_THREADS);
    private final ThreadPoolExecutor executor = (ThreadPoolExecutor) threadPool;

    @Scheduled(fixedRate = 5000)
    public void getMSKFilter()throws InterruptedException{
        logger.info("Maximum Threads : {}, Active Thread {} ", MAX_THREADS,null);
        int threadStarted =0;

        while(executor.getActiveCount() <MAX_THREADS){
            threadStarted ++;
            threadPool.execute(new findMSKThread());
            logger.info("Process is start your Thread monitor");

        }
        logger.info("{} Threads started", threadStarted);

        


    }
    
}
