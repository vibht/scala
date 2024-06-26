package com.server.application.scala.threads;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MskMonitorThread implements Runnable {
   private static final Logger logger = LogManager.getLogger(MskMonitorThread.class);

   @Override
   public void run() {
      Integer count = 0;

      while (count <=3) {
         
         try {
            logger.info("Hello------------");
            count++;
         } catch (Exception e) {
            logger.error("Exception in thread", e);
            throw new UnsupportedOperationException("Unimplemented method 'run'", e);
         }
      }
   }
}
