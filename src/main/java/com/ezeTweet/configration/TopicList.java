package com.ezeTweet.configration;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

import org.xml.sax.SAXException;

import com.ezeTweet.constants.ServerConstants;

import jline.CandidateCycleCompletionHandler;

public class TopicList {
	private ArrayList<String> topiclist=new ArrayList<String>();
	public TopicList(ConfigrationReader config) {
	
	try {
	    ZooKeeper zk = new ZooKeeper(config.getZookeeperServer(), 10000, null);
        List<String> topics = zk.getChildren(ServerConstants.TOPICS_PATH, false);
        String[] prefix = config.getTopicPrefix();
        
        for (String topic : topics) {
        	for(String topicPrefix:prefix)
        	{
        	if(topic.contains(topicPrefix))
        		topiclist.add(topic);
        	}
        }
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	}
	
	public ArrayList<String> getTopiclist() {
		return topiclist;
	}
	public void setTopiclist(ArrayList<String> topiclist) {
		this.topiclist = topiclist;
	}
}
