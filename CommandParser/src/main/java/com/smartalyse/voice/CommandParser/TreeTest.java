package com.smartalyse.voice.CommandParser;

public class TreeTest {
	 
	 public static void main(String[] args) {
		 
		 
	  Node treeRootNode = new Node(null);
	  treeRootNode.setName("");
	  
	  
	  // add child to root node 
	  Node openNode= addChild(treeRootNode, "open","keyword");
	  Node showNode= addChild(treeRootNode, "show","keyword");
	  Node onNode= addChild(treeRootNode, "on","keyword");
	  Node offNode= addChild(treeRootNode, "off","keyword");
	  Node upNode= addChild(treeRootNode, "up","keyword");
	  Node downNode= addChild(treeRootNode, "down","keyword");
	  
	  Node stopNode= addChild(treeRootNode, "stop","keyword");
	  Node setNode= addChild(treeRootNode, "set","keyword");
	  Node armNode= addChild(treeRootNode, "arm","keyword");
	  Node disarmNode= addChild(treeRootNode, "disarm","keyword");
	  Node resetNode= addChild(treeRootNode, "reset","keyword");
	  Node playNode= addChild(treeRootNode, "play","keyword");
	  
	  
	  
	  
	  // add child to the child node for open Node
	  
	  addChild(openNode, "home","keyword");
	  addChild(openNode, "security","keyword");
	  addChild(openNode, "media","keyword");
	  addChild(openNode, "alerts","keyword");
	  addChild(openNode, "settings","keyword");
	  
	  
	  addChild(openNode, "controller settings","keyword");
	  addChild(openNode, "media settings","keyword");
	  addChild(openNode, "app settings","keyword");
	  addChild(openNode, "license settings","keyword");
	  addChild(openNode, "app information","keyword");
	  

	  //On command nodes
	  Node onGroupNode = addChild(onNode, "group","entity");
	  addChild(onGroupNode, "entity", "entity");
	  
	  //off command nodes
	  Node offGroupNode = addChild(offNode, "group","entity");
	  addChild(offGroupNode, "entity", "entity");
	  
	  
	//curtain up command nodes
	  Node upGroupNode = addChild(upNode, "group","entity");
	  addChild(upGroupNode, "entity", "entity");
	  
	  
	//curtain down command nodes
	  Node downGroupNode = addChild(downNode, "group","entity");
	  addChild(downGroupNode, "entity", "entity");
	  
	//curtain stop command nodes
	  Node stopGroupNode = addChild(stopNode, "group","entity");
	  addChild(stopGroupNode, "entity", "entity");
	  
	  
	  // security commands
	  
	  addChild(armNode, "area", "entity");
	  addChild(disarmNode, "area", "entity");
	  addChild(resetNode, "area", "entity");
	  
	  
	  // Set command item action
	  
	//curtain up command nodes
	  Node setFloorGroupNode = addChild(setNode, "floor","keyword");
	  addChild(setFloorGroupNode, "entity", "entity");
	  
	  
	//curtain down command nodes
	  Node setGroupGroupNode = addChild(setNode, "group","keyword");
	  addChild(setGroupGroupNode, "entity", "entity");
	  
	//curtain stop command nodes
	  Node setDimmerGroupNode = addChild(setNode, "group","entity");
	  Node setDimmerNode = addChild(setDimmerGroupNode, "dimmer", "keyword");
	  addChild(setDimmerNode, "dimmer_percentage", "entity");
	  
	  
	  // show commands
	  
	//curtain up command nodes
	  Node showFloorGroupNode = addChild(showNode, "floor","keyword");
	  addChild(showFloorGroupNode, "entity", "entity");
	  
	  
	//curtain down command nodes
	  Node showGroupGroupNode = addChild(showNode, "group","keyword");
	  addChild(showGroupGroupNode, "entity", "entity");
	  
	//curtain stop command nodes
	  addChild(showNode, "alarms","keyword");
	  addChild(showNode, "areas","keyword");
	  
	  
	  Node showAllNode = addChild(showNode, "all", "keyword");
	  addChild(showAllNode, "groups", "keyword");
	  addChild(showAllNode, "floors", "keyword");
	  
	  Node showAllDevicesNode = addChild(showAllNode, "devices", "keyword");
	  Node showAllInDevicesNode = addChild(showAllDevicesNode, "in", "keyword");
	  
	  addChild(showAllInDevicesNode, "group", "entity");
	  addChild(showAllInDevicesNode, "floor", "entity");
	  
	    
	  printTree(treeRootNode, "   ");
	 
	 }
	 
	 private static Node addChild(Node parent, String name, String type ) {
	   Node node = new Node(parent);
	   node.setName(name);
	   node.setType(type);
	   parent.getChildren().add(node);
	   return node;
	 }
	 
	 private static void printTree(Node node, String appender) {
	  System.out.println(appender + "[ "+node.getName()+ " , "+ node.getType()+ " ]");
	  for (Node each : node.getChildren()) {
	   printTree(each, appender + appender);
	  }
	 }
	}
