package com.tci.product.service;

import static com.google.common.collect.Lists.newArrayList;

import org.apache.camel.CamelContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tci.product.vo.ItemVO;

@Component("productServiceImpl")
public class ProductServiceImpl implements IProductService{
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
    CamelContext camelContext;  
	
	@Override
	public void cleanseItem(ItemVO item) {
		// TODO Auto-generated method stub
		camelContext.createProducerTemplate().sendBody("direct:cleanseRoute", newArrayList(item));
	}

	
}
