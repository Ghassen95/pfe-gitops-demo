package tn.tekup.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


import tn.tekup.spring.entities.User;
import tn.tekup.spring.services.IUserService;

// userRestControl
@RestController // = @Controller + @ResponseBody 
//@Scope("session") 
// singleton c'est par défaut 
// prototype 
// request 
public class UserRestControl {

	// Couplage Faible 
	@Autowired 
	IUserService userService; 
 
	@GetMapping("/")
    @ResponseStatus(code = HttpStatus.OK, reason = "OK")
    public String ok() {
        return "Class Level HTTP Status Overriden. The HTTP Status will be OK (CODE 200)\n";
    }

	// URL : http://localhost:6868/timesheet-devops/retrieve-all-users

	@GetMapping("/retrieve-all-users")
	public List<User> retrieveAllUsers() {
		List<User> list = userService.retrieveAllUsers();
		return list;
	}
 

	// http://localhost:6868/timesheet-devops/retrieve-user/{user-id}

	@GetMapping("/retrieve-user/{user-id}")
	public User retrieveUser(@PathVariable("user-id") String userId) {
		return userService.retrieveUser(userId);
	}



	// Ajouter User : http://localhost:6868/timesheet-devops/add-user 


	@PostMapping("/add-user")
	public User addUser(@RequestBody User u) {
		User user = userService.addUser(u); 
		return user;
	}

	
	// Supprimer User : 

	// http://localhost:6868/timesheet-devops/remove-user/{user-id}

	@DeleteMapping("/remove-user/{user-id}") 
	public void removeUser(@PathVariable("user-id") String userId) { 
		userService.deleteUser(userId);
	} 

	// Modifier User 


	// http://localhost:6868/timesheet-devops/modify-user 


	@PutMapping("/modify-user") 
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}
	 
} 
 