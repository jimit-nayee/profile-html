package com.enfochips.ProjectMVC.jdbc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;
import com.enfochips.ProjectMVC.model.User;

@Repository
public class UserJdbc {
	
	public List<User> getAllUsers(){
		List<User> li = new ArrayList<User>();
		li.add(new User("a","a@mail.com","23047","india"));
		li.add(new User("b","b@mail.com","23571","usa"));
		li.add(new User("c","c@mail.com","2359783","aus"));
		return li;
		
	}
}
