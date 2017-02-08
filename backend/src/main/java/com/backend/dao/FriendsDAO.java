package com.backend.dao;

import java.util.List;

import com.backend.model.Friends;


public interface FriendsDAO {

	public List<Friends> listAllFriends(String useremail);
	
	public Friends getFriend(String useremail, String friendid);
	
	public boolean saveRequest(Friends friend);
	
	public boolean updateRequest(int reqid, char reply);
	
	public boolean deleteFriend(String useremail, String friendid);
	
	public List<Friends> listRequestedFriends(String useremail);
	
	public boolean updateStatus(String useremail, char status);
	
}
