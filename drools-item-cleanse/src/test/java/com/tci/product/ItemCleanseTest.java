package com.tci.product;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tci.product.service.IProductService;
import com.tci.product.vo.ItemVO;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ItemCleanseTest {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ItemCleanseTest.class);

    @Autowired
    IProductService productService;

    @Test
    public void testCleanseItem() throws Exception {
        
    	ItemVO item = new ItemVO("1234", "Item ass", "this is a test", "test");
    	
    	System.out.println("Before Cleansing = "+item.toString());
    	productService.cleanseItem(item);
    	System.out.println("After Cleansing = "+item.toString());

        
        //assertTrue(product.getPrice() == initialPrice);
        assertEquals(item.getItemTitle(), "****");
    }
    
    @Test
    public void testCleanseItemDesc() throws Exception {
        
    	ItemVO item = new ItemVO("1235", "Item 1", "this is a bad", "test");
    	
    	System.out.println("Before Cleansing = "+item.toString());
    	productService.cleanseItem(item);
    	System.out.println("After Cleansing = "+item.toString());

        
        //assertTrue(product.getPrice() == initialPrice);
        assertEquals(item.getItemDesc(), "****");
    }
    
    @Test
    public void testCleanseItemCategory() throws Exception {
        
    	ItemVO item = new ItemVO("1236", "Item 2", "this is a test", "ass");
    	
    	System.out.println("Before Cleansing = "+item.toString());
    	productService.cleanseItem(item);
    	System.out.println("After Cleansing = "+item.toString());

        
        //assertTrue(product.getPrice() == initialPrice);
        assertEquals(item.isxCoded(), true);
    }

}
