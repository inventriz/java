package com.inventriz.ds.trie;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Tridib Chakraborty
 * This class demostrate a simple use case for implementing
 * english dictionary using TRIE algorithm
 *
 */
public class InsertSearchInDictionary {
	
	// instantiate a map of Trie node
	private Map<Character, TrieNode> rootNodeMap = new HashMap<Character, TrieNode>();
	
	/**
	 * @param str
	 * This method with take a string and add it to the 
	 * dictionary is the proper place
	 */
	void insertWordInDictionary(String str){
		
		if (null != str && !str.isEmpty()) {			
			char[] chars = str.toCharArray();
			
			TrieNode tn = (TrieNode)rootNodeMap.get(chars[0]);
			if(tn == null){
				tn = new TrieNode();
			}
			
			rootNodeMap.put(chars[0], tn);
			
			if (str.length()>1) {				
				// initiate TrieNode for each character				
				for (int i = 1; i < chars.length; i++) {					
					
					TrieNode tn1 = (TrieNode)tn.getTrieNodeMap().get(chars[i]);
					if(tn1 == null){
						tn1 = new TrieNode();
						tn.getTrieNodeMap().put(chars[i], tn1);
					}															
					
					// check leaf node
					if(i == chars.length-1){
						tn1.setLeaf(true);
					} else {
						tn = tn1;
					}
				}
			} else if(str.length() == 1){
				tn.setLeaf(true);
			}
		}
	}
	
	/**
	 * 
	 * @param str
	 * @return
	 * 
	 * This method will search a particular string in the
	 * english dictionary
	 * This search will also support type ahead
	 */
	boolean isWordPresent(String str){		
		if (null != str && !str.isEmpty()) {
			char[] chars = str.toCharArray();
			if(rootNodeMap.containsKey(chars[0])){
				TrieNode tn = rootNodeMap.get(chars[0]);				
				if(tn != null){
					if(chars.length == 1 && tn.isLeaf()){
						return true;
					}
					for(int i=1; i<chars.length; i++){
						if(tn.getTrieNodeMap().containsKey(chars[i])){
							if(tn.getTrieNodeMap().get(chars[i]) != null){
								tn = tn.getTrieNodeMap().get(chars[i]);
								if(i == chars.length-1 && tn.isLeaf()){
									return true;
								}
							} 
						} else {
							return false;
						}
					}
				}
			} else {
				return false;
			}
		}
		return false;
	}
	
	void printOneNode(TrieNode tn){		
		if(tn.getTrieNodeMap() != null){			
			Set<Map.Entry<Character, TrieNode>> nodeSet = tn.getTrieNodeMap().entrySet();
			for(Map.Entry<Character, TrieNode> node : nodeSet){
				Character c = node.getKey(); 
				System.out.print("->"+c);
				printOneNode(node.getValue());
				if(nodeSet.size()>1){
					System.out.println("");
				}				
			}
		}		
	}
	
	void printRootMap(){		
		Set<Map.Entry<Character, TrieNode>> nodeSet = rootNodeMap.entrySet();
		for(Map.Entry<Character, TrieNode> node : nodeSet){
			Character c = node.getKey();
			System.out.print(c);
			printOneNode(node.getValue()); 
			System.out.println("");
		}		
	}
	
	public static void main(String args[]){
		InsertSearchInDictionary isid = new InsertSearchInDictionary();
		isid.insertWordInDictionary("a");
		isid.insertWordInDictionary("act");
		isid.insertWordInDictionary("the");
		isid.insertWordInDictionary("there");
		isid.insertWordInDictionary("she");
		isid.insertWordInDictionary("put");
		isid.insertWordInDictionary("accident");		
		isid.insertWordInDictionary("action");
		isid.insertWordInDictionary("adjective");
		//isid.printRootMap();
		System.out.println("abc is present == "+isid.isWordPresent("accident"));
	}
	
	

}
