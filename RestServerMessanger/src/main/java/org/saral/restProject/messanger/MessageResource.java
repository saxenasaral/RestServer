package org.saral.restProject.messanger;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.saral.restProject.modal.MessageBean;
import org.saral.restProject.modal.MessageService;


@Path("/messages")
public class MessageResource {
	
	MessageService MessageService = new MessageService();

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<MessageBean> getMessage(){
		return MessageService.createMessage();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON )
	@Produces(MediaType.APPLICATION_JSON)
	public String addMessage(MessageBean MessageBean){
		
		return "posting";
	}
	
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.TEXT_PLAIN)
	public String test(@PathParam("messageId") String messageId){
		return "messages : "+messageId;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
