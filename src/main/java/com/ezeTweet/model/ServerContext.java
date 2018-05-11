package com.ezeTweet.model;

public class ServerContext {
	private String bootstrapServer;
	private String consumerGroupId;
	private String zookeeperServer;
	private String topicPath;
	private String[] topicPrefix;
	private String mongoDbServer;
	private String mongoDbDatabase;
	private String tweetCollection;
	private String TemplateCollection;
	private String eventCollection;
	
	
	
	 public String getBootstrapServer() {
		return bootstrapServer;
	}



	public void setBootstrapServer(String bootstrapServer) {
		this.bootstrapServer = bootstrapServer;
	}



	public String getConsumerGroupId() {
		return consumerGroupId;
	}



	public void setConsumerGroupId(String consumerGroupId) {
		this.consumerGroupId = consumerGroupId;
	}



	public String getZookeeperServer() {
		return zookeeperServer;
	}



	public void setZookeeperServer(String zookeeperServer) {
		this.zookeeperServer = zookeeperServer;
	}



	public String getTopicPath() {
		return topicPath;
	}



	public void setTopicPath(String topicPath) {
		this.topicPath = topicPath;
	}



	public String[] getTopicPrefix() {
		return topicPrefix;
	}



	public void setTopicPrefix(String[] topicPrefix) {
		this.topicPrefix = topicPrefix;
	}



	public String getMongoDbServer() {
		return mongoDbServer;
	}



	public void setMongoDbServer(String mongoDbServer) {
		this.mongoDbServer = mongoDbServer;
	}



	public String getMongoDbDatabase() {
		return mongoDbDatabase;
	}



	public void setMongoDbDatabase(String mongoDbDatabase) {
		this.mongoDbDatabase = mongoDbDatabase;
	}



	public String getTweetCollection() {
		return tweetCollection;
	}



	public void setTweetCollection(String tweetCollection) {
		this.tweetCollection = tweetCollection;
	}



	public String getTemplateCollection() {
		return TemplateCollection;
	}



	public void setTemplateCollection(String templateCollection) {
		TemplateCollection = templateCollection;
	}



	public String getEventCollection() {
		return eventCollection;
	}



	public void setEventCollection(String eventCollection) {
		this.eventCollection = eventCollection;
	}



	public void readConfiguration() 
		{
	
}
}
