package com.wipro.messenger.resources;


import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.wipro.messenger.model.Message;
import com.wipro.messenger.service.MessageService;

@Path("/messages")
public class MessageResource {
	
	MessageService messageservice=new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessage() {
		
		return messageservice.getAllMessages();
	}
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{messageId}")
	public Message getMessage(@PathParam("messageId") long id) {
		return messageservice.getMessage(id);
	}
	
	
}
