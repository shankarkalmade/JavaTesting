package com.smartalyse.voice.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.smartalyse.voice.model.GrammerModel;

public class FilterManager {
	
	public List<String> getFilteredData(Map<String, List<GrammerModel>> map, String filter) {
		
		List<String> result= new ArrayList<String>();
		
		List<GrammerModel> entityList = map.get(filter);
		
		if(!(entityList==null)) {
			
			for(GrammerModel model : entityList) {
				
				result.add(model.getEntity());
				
			}
			
			
		}
		
		
		
		
		return result;
	}
	

}
