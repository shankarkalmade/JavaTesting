package com.smartalyse.voice.CommandParser;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.smartalyse.voice.core.BaseConstants;
import com.smartalyse.voice.model.GrammerModel;
import com.smartalyse.voice.util.CommandParser;
import com.smartalyse.voice.util.FilterManager;
import com.smartalyse.voice.util.JsonFileManager;
import com.smartalyse.voice.util.KeywordsGenerator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	KeywordsGenerator generateKeywords = new KeywordsGenerator();
    	
    	List<GrammerModel> keywords = generateKeywords.createDummyKeywords();
    	List<GrammerModel> groups = generateKeywords.createDummyGroups();
    	List<GrammerModel> items = generateKeywords.createDummyItems();
    	
    	Map<String, List<GrammerModel>> combined = new HashMap<String, List<GrammerModel>>();
    	combined.put(BaseConstants.KEYWORD_NAME, keywords);
    	
    	combined.put(BaseConstants.ITEM_NAME, items);
    	
    	
    	JsonFileManager jsonManager= new JsonFileManager();
    	
    	jsonManager.writeJsonToFile(combined);
    	
    	Map<String, List<GrammerModel>> map = jsonManager.readJsonFile();
        
        //System.out.println(map);
    	    	
        map.put(BaseConstants.GROUP_NAME, groups);
        
        jsonManager.writeJsonToFile(map);
                
        map = jsonManager.readJsonFile();
        
        System.out.println(map);
        FilterManager filters = new FilterManager();
               		
        
        System.out.println(filters.getFilteredData(map, BaseConstants.GROUP_NAME).toString());
        System.out.println(filters.getFilteredData(map, BaseConstants.ITEM_NAME).toString());
        System.out.println(filters.getFilteredData(map, BaseConstants.KEYWORD_NAME).toString());
        
        System.out.println("======================READY========================");
        System.out.println("Enter Command");
        
        
        testCallable();
        
        
        
    	

    	
    }

	private static void testCallable() {
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
        
        List<Callable<String>> lst = new ArrayList<Callable<String>>();
        lst.add(new CommandParser("Test"));
        lst.add(new CommandParser("Test2"));
        lst.add(new CommandParser("Test3"));
        lst.add(new CommandParser("Test4"));
        
         
        // returns a list of Futures holding their status and results when all complete
        List<Future<String>> tasks;
		try {
			tasks = executorService.invokeAll(lst);
			
			System.out.println(tasks.size() +" Responses recieved.\n");
	         
	        for(Future<String> task : tasks)
	        {
	            System.out.println(task.get().toString());
	        }
	        
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
        
		
		
	}
    
    
}
