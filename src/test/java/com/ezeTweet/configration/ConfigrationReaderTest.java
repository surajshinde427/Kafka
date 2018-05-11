package com.ezeTweet.configration;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import javax.naming.ConfigurationException;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConfigrationReaderTest {

	@Test
	@DisplayName("Configration Reader")
	public void readConfig() 
	{
		String[] prefixTestArray= {"topicPrefix1","topicPrefix2"};
		ConfigrationReader configReader;
		try {
			configReader = new ConfigrationReader("config.properties");
		assertEquals("event",configReader.getEventCollection());
		assertEquals("mongodb", configReader.getMongoDbDatabase());
		assertEquals("128.0.0.1:27018", configReader.getMongoDbServer());
		assertEquals("template",configReader.getTemplateCollection());		
		assertArrayEquals(prefixTestArray, configReader.getTopicPrefix());
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}

}
