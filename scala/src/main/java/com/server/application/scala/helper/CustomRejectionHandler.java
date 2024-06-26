package com.server.application.scala.helper;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class CustomRejectionHandler  implements RejectedExecutionHandler {

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        // TODO Auto-generated method stub
        try {
            System.out.println("Task rejected "+r.toString());
            
        } catch (Exception e) {
            // TODO: handle exception
            throw new UnsupportedOperationException("Unimplemented method 'rejectedExecution'");
        }
       
    }
    
}
