package com.example.tridib.cassandra;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.cassandra.core.CassandraOperations;
import org.springframework.data.cassandra.core.CassandraTemplate;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

@SpringBootApplication
public class ItemServiceApplication {
	
	
	@Value("${cassandra.contactpoints}")
	private String cassandraHost;
	
	@Value("${cassandra.port}")
	private int cassandraPort;
	
	@Value("${cassandra.keyspace}")
	private String cassandraKeyspace;
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ItemServiceApplication.class);
	
	@Bean
	public Cluster cluster(){		
		
		Cluster cluster = Cluster.builder()
								.addContactPoint(cassandraHost)
								.withPort(cassandraPort)
								.build();
		return cluster;
	}
	
	public Session session(){
		Session session = cluster().connect(cassandraKeyspace);
		return session;
	}
	
	@Bean
    public CassandraOperations cassandraTemplate() throws Exception {
		CassandraOperations cassandraOps = new CassandraTemplate(session());		
        return cassandraOps;
    }

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}
}
