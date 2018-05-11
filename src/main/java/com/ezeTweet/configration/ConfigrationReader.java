package com.ezeTweet.configration;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class ConfigrationReader {

	private String bootstrapServer;
	private String consumerGroupId;
	private String zookeeperServer;
	private String topicPath;
	private String[] topicPrefix;
	private String mongoDbServer;
	private String mongoDbDatabase;
	private String tweetCollection;
	private String templateCollection;
	private String eventCollection;
	private String autoOffset;
	
	public  ConfigrationReader(String configration) throws ConfigurationException {

		 Configuration config = new PropertiesConfiguration(configration);
		 
		 bootstrapServer = config.getString("kafka.server.ip");
		 consumerGroupId = config.getString("kafka.consumer.id");
		 zookeeperServer = config.getString("zookeeper.ip");
		 topicPath = config.getString("topic.path");
		 topicPrefix = config.getStringArray("topic.prefix");
		 mongoDbServer = config.getString("mongodb.server.ip");
		 mongoDbDatabase = config.getString("mongodb.database");
		 tweetCollection = config.getString("tweet.collection");
		 templateCollection = config.getString("template.collection");
		 eventCollection = config.getString("event.collection");
		 autoOffset=config.getString("auto.offset.reset");
	}
	public String getAutoOffset() {
		return autoOffset;
	}
	public String getBootstrapServer() {
		return bootstrapServer;
	}
	public String getConsumerGroupId() {
		return consumerGroupId;
	}
	public String getZookeeperServer() {
		return zookeeperServer;
	}
	public String getTopicPath() {
		return topicPath;
	}
	public String[] getTopicPrefix() {
		return topicPrefix;
	}
	public String getMongoDbServer() {
		return mongoDbServer;
	}
	public String getMongoDbDatabase() {
		return mongoDbDatabase;
	}
	public String getTweetCollection() {
		return tweetCollection;
	}
	public String getTemplateCollection() {
		return templateCollection;
	}
	public String getEventCollection() {
		return eventCollection;
	}

}
