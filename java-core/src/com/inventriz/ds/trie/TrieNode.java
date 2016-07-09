package com.inventriz.ds.trie;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
	
	private boolean isLeaf;
	private int index;	
	private Map<Character, TrieNode> trieNodeMap;
	
	
	public boolean isLeaf() {
		return isLeaf;
	}
	public void setLeaf(boolean isLeaf) {
		this.isLeaf = isLeaf;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	public Map<Character, TrieNode> getTrieNodeMap() {
		if(trieNodeMap == null){
			trieNodeMap = new HashMap<Character, TrieNode>();
		}
		return trieNodeMap;
	}
	
	

}
