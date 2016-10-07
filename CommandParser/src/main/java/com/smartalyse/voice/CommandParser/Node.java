package com.smartalyse.voice.CommandParser;

import java.util.ArrayList;
import java.util.List;
 
public class Node {
 private String name;
 private String type;
 private final List<Node> children = new ArrayList<Node>();
 private final Node parent;
 
 public Node(Node parent) {
  this.parent = parent;
 }
 
 
 
 public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getType() {
	return type;
}



public void setType(String type) {
	this.type = type;
}



public List<Node> getChildren() {
  return children;
 }
 
 public Node getParent() {
  return parent;
 }
 
}