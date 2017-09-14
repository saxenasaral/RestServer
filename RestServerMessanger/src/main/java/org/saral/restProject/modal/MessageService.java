package org.saral.restProject.modal;

import java.util.ArrayList;
import java.util.List;

public class MessageService {

	public List<MessageBean> createMessage(){
		
		MessageBean m1 = new MessageBean(01, "hard code","saral","first");
		MessageBean m2 = new MessageBean(01, "hardcode","saral","second");
		
		ArrayList<MessageBean> al = new ArrayList<MessageBean>();
		
		al.add(m1);
		al.add(m2);
		return al;
	}
	
	
}
