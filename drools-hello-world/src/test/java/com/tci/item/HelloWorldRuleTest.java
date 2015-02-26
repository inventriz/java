package com.tci.item;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class HelloWorldRuleTest {

	@Test
	public void test() {
		 
		
		// load up the knowledge base
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("HelloWorldKS");

        // go !
        Message message = new Message();
        message.setMessage("Hello World");
        message.setStatus(Message.HELLO);
        kSession.insert(message);
        kSession.fireAllRules();
        kSession.dispose();
        
//        int expectedNumberOfRulesFired = 1;
//        int actualNumberOfRulesFired = kSession.fireAllRules();

        for (Object o: kSession.getObjects()) {
     	   if(o instanceof Message) {
     	    assertEquals(Message.GOODBYE, ((Message) o).getStatus());
     	   }
     	  } 
        
	}

}
