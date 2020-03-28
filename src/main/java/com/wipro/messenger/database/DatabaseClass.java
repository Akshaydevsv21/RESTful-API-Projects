package com.wipro.messenger.database;

import java.util.HashMap;
import java.util.Map;

import com.wipro.messenger.model.Message;

public class DatabaseClass {

	private static Map<Long, Message> messages = new HashMap<>();
	private static Map<Long,Message> profiles = new HashMap<>();
	
	public static Map<Long,Message> getMessages(){
		return messages;
	}
	
	public static Map<Long,Message> getProfiles(){
		return profiles;
	}
}
