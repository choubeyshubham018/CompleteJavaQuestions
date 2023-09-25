package in.ineuron.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import in.ineuron.model.User;
import in.ineuron.service.IUserService;


@Controller
public class UserController {

	@Autowired
	private IUserService service;
	
	@GetMapping("/")
	public String homePage() {
		System.out.println("UserController.homePage()");
		return "index";
	}
	
	@GetMapping("/register")
	public String registrationPage() {
		System.out.println("UserController.registrationPage()");
		return "regUser";
	}
	
	@GetMapping("/login")
	public String loginPage() {
		System.out.println("UserController.loginPage()");
		return "userLogin";
	}
	
	@PostMapping("/regisUser")
	public String registerUser(Map<String,Object>model,@ModelAttribute("user") User user) {
		System.out.println(user);
		String msg = service.saveUser(user);
		model.put("msg", msg);
		return "status";
	}
	
	@GetMapping("/userLogin")
	public String userLogin(Map<String,Object>model,@RequestParam String userId,@RequestParam String password) {
		System.out.println(userId +" :: "+password);
		String msg = service.loginUser(userId, password);
	    model.put("msg", msg);
	    return "status";
	}
	
}
