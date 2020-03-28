package com.wipro.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.wipro.messenger.database.DatabaseClass;
import com.wipro.messenger.model.Message;

public class MessageService {
	
	private static Map<Long,Message> messages = DatabaseClass.getMessages();
	
	public MessageService() {
		messages.put(1L, new Message(1L,"Hello World!!","Akshay"));
		messages.put(2L, new Message(2L,"Hello Nature!!","Akshay"));
	}
	public List<Message> getAllMessages(){
		
//		Message msg1=new Message(1L,"Hello World!!","Akshay");
//		Message msg2=new Message(1L,"Hello Nature!!","Akshay");
//		
//		List<Message> list=new ArrayList<Message>();
//		list.add(msg1);
//		list.add(msg2);
//		return list;
		
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id) {
		return messages.get(id);
	}
	
	public Message addMessage(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message updateMessage(Message message) {
		if(message.getId()==0) {
			return null;
		}
		messages.put(message.getId(),message);
		return message;
	}
	
	public Message removeMessage(long id) {
		return messages.remove(id);
	}
}
