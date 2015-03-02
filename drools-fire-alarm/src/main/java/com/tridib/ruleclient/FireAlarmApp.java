package com.tridib.ruleclient;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.FactHandle;

import com.tridib.firealarm.Fire;
import com.tridib.firealarm.Room;
import com.tridib.firealarm.Sprinkler;

public class FireAlarmApp {
	
	public static void main(String args[]){
		
		KieServices kieServices = KieServices.Factory.get();
		KieContainer kContainer = kieServices.getKieClasspathContainer();
		KieSession ksession = kContainer.newKieSession("fireAlarmKS");
		
		//ksession = setEverythingIsOk(ksession);
		//ksession.fireAllRules();
		
		ksession = setFire(ksession);
		ksession.fireAllRules();		
		ksession.dispose();
		
		
		
	}
	
	/*private static KieSession setEverythingIsOk(KieSession ks){
		String[] names = new String[]{"kitchen", "bedroom", "office", "livingroom"};
		Map<String,Room> name2room = new HashMap<String,Room>();
		for( String name: names ){
			Room room = new Room( name );
			name2room.put( name, room );
			ks.insert( room );
			Sprinkler sprinkler = new Sprinkler( room );
			ks.insert( sprinkler );
		}
		
		return ks;
	}*/
	
	private static KieSession setFire(KieSession ks){
		String[] names = new String[]{"kitchen", "bedroom", "office", "livingroom"};
		Map<String,Room> name2room = new HashMap<String,Room>();
		for( String name: names ){
			Room room = new Room( name );
			name2room.put( name, room );
			ks.insert( room );
			Sprinkler sprinkler = new Sprinkler( room );
			ks.insert( sprinkler );
		}
		
		Fire kitchenFire = new Fire( name2room.get( "kitchen" ) );
		Fire officeFire = new Fire( name2room.get( "office" ) );
		FactHandle kitchenFireHandle = ks.insert( kitchenFire );
		FactHandle officeFireHandle = ks.insert( officeFire );
		
		ks.fireAllRules();
		
		ks.delete( kitchenFireHandle );
		ks.delete( officeFireHandle );
		
		
		return ks;
	}
	
	

}
