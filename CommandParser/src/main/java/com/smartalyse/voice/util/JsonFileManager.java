package com.smartalyse.voice.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.smartalyse.voice.model.GrammerModel;

public class JsonFileManager {
	
	public void writeJsonToFile(Map<String, List<GrammerModel>> combined) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
    	
        String json = gson.toJson(combined);
        
        //System.out.println(json);
		
		try {
			FileWriter file = new FileWriter("file1.txt",false);
			file.write(json);
			file.flush();
			file.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public Map<String, List<GrammerModel>> readJsonFile() {
		
		Map<String, List<GrammerModel>> combined= null;
		
		Type listType = new TypeToken<Map<String, List<GrammerModel>>>() {
		}.getType();
		
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		try  {

		
			Reader reader = new FileReader("file1.txt");
						
			combined = gson.fromJson(reader, listType);
			
			//System.out.println(combined);
			
			reader.close();
			
			
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		return combined;
	}
	
	
	

}
