package com.example.tridib.cassandra.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.stereotype.Component;

import com.example.tridib.cassandra.model.Item;

@Component
public class ItemDaoImpl implements IItemDao {
	
	@Autowired
	CassandraOperations cassandraTemplate;

	@Override
	public void saveItem(Item item) {
		cassandraTemplate.insert(item);		
	}

}
