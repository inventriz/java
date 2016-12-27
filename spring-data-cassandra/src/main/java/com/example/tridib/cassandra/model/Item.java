package com.example.tridib.cassandra.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;

@Table(value = "item")
public class Item implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8172046884098162191L;
	
	@PrimaryKeyColumn(name="item_id", ordinal = 0,type = PrimaryKeyType.PARTITIONED)
	private int itemId;
	@Column(value = "item_name")
	private String itemName;
	@Column(value = "item_cost")
	private int itemCost;
	@Column(value = "cerate_date")
	private Date createDate;
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemCost() {
		return itemCost;
	}
	public void setItemCost(int itemCost) {
		this.itemCost = itemCost;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName
				+ ", itemCost=" + itemCost + ", createDate=" + createDate + "]";
	}
	
	

}
