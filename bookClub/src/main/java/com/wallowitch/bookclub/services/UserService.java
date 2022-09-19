package com.wallowitch.bookclub.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.wallowitch.bookclub.models.LoginUser;
import com.wallowitch.bookclub.models.User;
import com.wallowitch.bookclub.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
    @Autowired
    private UserRepository uRepo;
    
    public User register(User newUser, BindingResult result) {
        

    	Optional<User> userSearch = uRepo.findByEmail(newUser.getEmail());
    	if (userSearch.isPresent()) {
    		result.rejectValue("email", "Unique", "Email already in use, please use a different email.");
    	}
    	
        // Reject if password doesn't match confirmation
    	if(!newUser.getPassword().equals(newUser.getConfirm())) {
    	    result.rejectValue("confirm", "Matches", "Passwords must match!");
    	}
        
        // Return null if result has errors
    	if(result.hasErrors()) {
    		return null;
    	}
    
        // Hash and set password, save user to database
    	String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
    	newUser.setPassword(hashed);
    	
    	newUser = repo.save(newUser);
    	
        return newUser;
    }
    
    public User login(LoginUser newLogin, BindingResult result) {
        

    	Optional<User> userSearch = uRepo.findByEmail(newLogin.getEmail());
    	if (!userSearch.isPresent()) {
    		result.rejectValue("email", "MissingAccount", "This email is not linked with an account.");
    		return null;
    	}
    	
    	User user = userSearch.get();       
        
    	if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
    	    result.rejectValue("password", "Matches", "Incorrect password!");
    	}
    	
    	if(result.hasErrors()) {
    		return null;
    	}
    	
        return user;
    }

	public User findByEmail(String email) {
		
		Optional<User> result = repo.findByEmail(email);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
	
	public User findById(Long id) {
		
		Optional<User> result = repo.findById(id);
		if(result.isPresent()) {
			return result.get();
		}
		
		return null;
	}
}