package com.wipro.messenger.service;

import java.util.ArrayList;
import java.util.List;

import com.wipro.messenger.model.Message;

public class MessageService {
	
	public List<Message> getMessages(){
		
		Message msg1=new Message(1L,"Hello World!!","Akshay");
		Message msg2=new Message(1L,"Hello Nature!!","Akshay");
		
		List<Message> list=new ArrayList<Message>();
		list.add(msg1);
		list.add(msg2);
		return list;
	}
}
