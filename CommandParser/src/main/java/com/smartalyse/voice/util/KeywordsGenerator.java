package com.smartalyse.voice.util;

import java.util.ArrayList;
import java.util.List;

import com.smartalyse.voice.model.GrammerModel;

public class KeywordsGenerator {
	
	public List<GrammerModel> createDummyKeywords() {
		
		List<GrammerModel> keywords = new ArrayList<GrammerModel>();
		
		keywords.add(new GrammerModel("nav", "open", "","keywords"));
		keywords.add(new GrammerModel("nav", "show", "","keywords"));
		keywords.add(new GrammerModel("nav", "set", "","keywords"));
		keywords.add(new GrammerModel("action", "on", "","keywords"));
		keywords.add(new GrammerModel("action", "off", "","keywords"));
		keywords.add(new GrammerModel("action", "up", "","keywords"));
		keywords.add(new GrammerModel("action", "down", "","keywords"));
		keywords.add(new GrammerModel("action", "stop", "","keywords"));
		keywords.add(new GrammerModel("media", "play", "","keywords"));
		keywords.add(new GrammerModel("media", "pause", "","keywords"));
		keywords.add(new GrammerModel("media", "stop", "","keywords"));
		keywords.add(new GrammerModel("media", "resume", "","keywords"));
		keywords.add(new GrammerModel("security", "arm", "","keywords"));
		keywords.add(new GrammerModel("security", "disarm", "","keywords"));
		keywords.add(new GrammerModel("security", "reset", "","keywords"));
		
				
		
		return keywords;
	}

	public List<GrammerModel> createDummyGroups() {
		
		List<GrammerModel> groups = new ArrayList<GrammerModel>();
		
		groups.add(new GrammerModel("group", "group1", "","group"));
		groups.add(new GrammerModel("group", "group2", "","group"));
				
		
		return groups;
	}

	public List<GrammerModel> createDummyItems() {
		
		List<GrammerModel> groups = new ArrayList<GrammerModel>();
		
		groups.add(new GrammerModel("lighting", "lighth1", "","item"));
		groups.add(new GrammerModel("lighting", "light2", "","item"));
		groups.add(new GrammerModel("fan", "main", "","item"));
		groups.add(new GrammerModel("curtain", "lobby", "","item"));
		
		
		
		return groups;
	}
	
}
