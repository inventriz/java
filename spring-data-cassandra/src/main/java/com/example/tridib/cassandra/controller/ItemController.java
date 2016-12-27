package com.example.tridib.cassandra.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tridib.cassandra.dao.IItemDao;
import com.example.tridib.cassandra.model.Item;

@RestController
public class ItemController {
	
	@Autowired
	IItemDao itemDao;
	
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ItemController.class);

	@RequestMapping(value = "/saveItem")
	public String saveItem(){
		
		Item item = new Item();
		item.setItemId(1);
		item.setItemName("Lenovo Vibe P1m");
		item.setItemCost(6999);
		item.setCreateDate(new Date());
		LOGGER.info("Saving the item : {} ", item.toString());
		
		itemDao.saveItem(item);
		
		return "success";
	}
}
