package org.paf.Register_Service.service;

//import java.util.ArrayList;
import java.util.List;

import org.paf.Register_Service.Model.User;
import org.paf.Register_Service.database.UserDatabase;


public class UserService {
	
	private UserDatabase userdb;
	
		
	public UserService(){
	
		userdb = new UserDatabase();
		
	}
	
	public List<User> getAllUsers() {
		
		
		return userdb.allUsers();
		
	}
	
	public User getUser(int id) {
		
		return userdb.getUser(id);
		
		
		
	}
	
	public String deletUser(int id) {
		
		return userdb.deleteUser(id);
	}
	

	public String addUser(User user) {
		
		return userdb.addUser(user);
		
	}
	public String updateUser(User user) {
		return userdb.updateUser(user);
	}
}
