package com.smartalyse.voice.util;

import java.util.concurrent.Callable;

public class CommandParser implements Callable<String>{
 
    private String command;
     
    public CommandParser(String command) {
        this.command = command;
    }
     
    public String call() throws Exception {
         
        /* this is where your business logic goes */
    	Thread.sleep(2000);
        return this.command;
    }
} 