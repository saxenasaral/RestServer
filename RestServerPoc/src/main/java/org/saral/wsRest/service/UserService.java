package org.saral.wsRest.service;

import java.util.ArrayList;

import org.saral.wsRest.bean.User;
import org.saral.wsRest.bean.User.Address;
import org.saral.wsRest.bean.User.Offer;
import org.saral.wsRest.bean.User.Offer.MisseleneousOffer;
import org.saral.wsRest.bean.User.Offer.SubscriberOffer;

public class UserService {

	
	public User getUser() {

		User user1 = new User();
		Address address1 = new Address();
		address1.setCity("bhopal");
		address1.setCountry("india");
		address1.setHouseNo("45");
		address1.setState("M.P");
		
		SubscriberOffer SubscriberOffer = new SubscriberOffer();
		MisseleneousOffer MisseleneousOffer = new MisseleneousOffer();
		MisseleneousOffer.setCallerTune("songs");
		MisseleneousOffer.setMissedCallAlert("2 missed calls");
		Offer offer = new Offer();
		offer.setOffer(SubscriberOffer);
		offer.setOtherOffer(MisseleneousOffer);
		
		ArrayList<Address> ad = new ArrayList<User.Address>();
		ad.add(address1);
		user1.setItem(offer);
		user1.setAddress(ad);
		user1.setId(001);
		user1.setName("saral");
		
		return user1;
		
	}

	public void updateUser() {

	}
	
	public User createUser(User user){
		Address addressGiven = new Address();
		addressGiven = user.getAddress().get(0);
		User user1 = new User();
		Address address1 = new Address();
		address1.setCity(addressGiven.getCity());
		address1.setCountry(addressGiven.getCountry());
		address1.setHouseNo(addressGiven.getHouseNo());
		address1.setState(addressGiven.getState());
		
		SubscriberOffer SubscriberOffer = new SubscriberOffer();
		MisseleneousOffer MisseleneousOffer = new MisseleneousOffer();
		MisseleneousOffer.setCallerTune(user.getItem().getOtherOffer().getCallerTune());
		MisseleneousOffer.setMissedCallAlert(user.getItem().getOtherOffer().getMissedCallAlert());
		Offer offer = new Offer();
		offer.setOffer(SubscriberOffer);
		offer.setOtherOffer(MisseleneousOffer);
		
		ArrayList<Address> ad = new ArrayList<User.Address>();
		ad.add(address1);
		user1.setItem(offer);
		user1.setAddress(ad);
		user1.setId(user.getId());
		user1.setName(user.getName());
		
		return user1;
	}

	public User createUser() {
		User user1 = new User();
		Address address1 = new Address();
		address1.setCity("bhopal");
		address1.setCountry("india");
		address1.setHouseNo("45");
		address1.setState("M.P");
		
		SubscriberOffer SubscriberOffer = new SubscriberOffer();
		MisseleneousOffer MisseleneousOffer = new MisseleneousOffer();
		MisseleneousOffer.setCallerTune("songs");
		MisseleneousOffer.setMissedCallAlert("2 missed calls");
		Offer offer = new Offer();
		offer.setOffer(SubscriberOffer);
		offer.setOtherOffer(MisseleneousOffer);
		
		ArrayList<Address> ad = new ArrayList<User.Address>();
		ad.add(address1);
		user1.setItem(offer);
		user1.setAddress(ad);
		user1.setId(001);
		user1.setName("saral");
		
		return user1;
		
	}

	public void deleteUser() {

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
