package GramPanchayat.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import GramPanchayat.model.BirthData;
import GramPanchayat.model.DeathData;
import GramPanchayat.model.Marriege;
import GramPanchayat.model.UserDtls;
import GramPanchayat.model.Voter;
import GramPanchayat.repository.UserRepository;
import GramPanchayat.service.CertificateService;
import GramPanchayat.service.UserService;
import GramPanchayat.service.UserServiceImpl;

@Controller
public class HomeController {

	@Autowired
	private CertificateService service1;
	@Autowired
	private UserService userService;

	@Autowired
	private UserServiceImpl service;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@ModelAttribute
	private void userDetails(Model m, Principal p) {

		if (p != null) {
			String email = p.getName();
			UserDtls user = userRepo.findByEmail(email);
			m.addAttribute("user", user);
		}
	}

	@GetMapping("/")
	public String index() {
		return "index1";
	}

	@GetMapping("/signin")
	public String login() {
		return "login";
	}

	@GetMapping("/register")
	public String register() {
		return "register";
	}

	@PostMapping("/createUser")
	public String createuser(@ModelAttribute UserDtls user, HttpSession session, HttpServletRequest request) {

		// System.out.println(user);
		String url = request.getRequestURL().toString();
		// http://localhost:8080/createUser
		url = url.replace(request.getServletPath(), "");

		boolean f = userService.checkEmail(user.getEmail());

		if (f) {
			session.setAttribute("msg", "Email Id alreday exists");
		}

		else {
			UserDtls userDtls = userService.createUser(user, url);
			if (userDtls != null) {
				session.setAttribute("msg", "Register Sucessfully");
			} else {
				session.setAttribute("msg", "Something wrong on server");
			}
		}
		return "redirect:/register";
	}

	@GetMapping("/verify")
	public String verifyAccount(@Param("code") String code) {

		if (userService.verifyAccount(code)) {
			return "verify_success";
		}

		return "verify_failed";
	}

	@GetMapping("/loadForgotPassword")
	public String loadForgotPassword() {
		return "forgot_password";
	}

	@GetMapping("/loadResetPassword/{id}")
	public String loadResetPassword(@PathVariable int id, Model m) {
//		System.out.println(id);
		m.addAttribute("id", id);
		return "reset_password";
	}

	@PostMapping("/forgotPassword")
	public String forgotPassword(@RequestParam String email, @RequestParam String mobileNum, HttpSession session) {

		UserDtls user = userRepo.findByEmailAndMobileNumber(email, mobileNum);

		if (user != null) {
			return "redirect:/loadResetPassword/" + user.getId();
		} else {
			session.setAttribute("msg", "Invalid Email Mobile Number");
			return "forgot_password";
		}

	}

	@PostMapping("/changePassword")
	public String resetPassword(@RequestParam String psw, @RequestParam Integer id, HttpSession session) {

		UserDtls user = userRepo.findById(id).get();
		String encryptPsw = passwordEncoder.encode(psw);
		user.setPassword(encryptPsw);
		UserDtls updateUser = userRepo.save(user);

		if (updateUser != null) {
			session.setAttribute("msg", "Password Change Successfully");
		}

		return "redirect:/loadForgotPassword";
	}

	@GetMapping("/index1")
	public String index1() {
		return "index1";
	}

	@GetMapping("/index")
	public String index2() {
		return "index1";
	}

	@GetMapping("/about")
	public String about() {
		return "about";
	}

	@GetMapping("/Birthcertificate")
	public String Birthcertificate1()
	{
		return "Birthcertificate";
	}

	@GetMapping("/birthcertificate")
	public String Birthcertificate() {
		
		return "birthform";
	}
//	@GetMapping("/birth_certificateform")
//	public String birth_certificateform()
//	{
//		return "birthForm";
//	}

	@PostMapping("/birthcertificate")
	public String SaveBirthData(@ModelAttribute BirthData b) {
		service1.save(b);
		System.out.println("2222222222222222222222222222222222");

		return "index1";
	}

	@GetMapping("/Deathcertificate")
	public String Deathcertificate() {
		return "deathform";
	}

	@PostMapping("/Deathcertificate")
	public String SaveDeathData(@ModelAttribute DeathData b) {
		service1.deathsave(b);
		return "index1";
	}

	@GetMapping("/required_doc_certificate")
	public String requiredDocCertificate() {

		return "required_doc_certificate";

	}

	@GetMapping("/required_doc_certificate_list")
	public String requiredDocCertificateList() {

		return "required_doc_certificate_list";

	}

	@GetMapping("/404")
	public String alert404() {

		return "404";

	}

	@GetMapping("/category")
	public String category() {

		return "category";

	}

	@GetMapping("/complaint_section")
	public String complaintSection() {

		return "complaint_section";

	}

	@GetMapping("/contact")
	public String contact() {

		return "contact";

	}

	@GetMapping("/feedback")
	public String feedback() {

		return "feedback";
	}

	@GetMapping("/help")
	public String help() {

		return "help";
	}

	@GetMapping("/scheme_info")
	public String schemeInfo() {

		return "scheme_info";
	}
	
	// voter 
		@GetMapping("/voterApplication")
		public String voterApplication()
		{
		return "voterApplication";  
	    }   
		
		@PostMapping("/voterApplication")
		public String voterApplication(@ModelAttribute Voter m)
		{
			System.out.println("voterApplication");
			service1.saveVoter(m);
			return "index1";
		}     
		
		//marriege_certificte
		@GetMapping("/marriege_certificate")
		public String marriege_certificate()
		{
		return "marriege_certificate";  
	    }   
		
		@PostMapping("/marriege_certificate")
		public String marriege_certificate(@ModelAttribute Marriege m)
		{
			System.out.println("marriege_certificate");
			service1.saveMarrieage(m);
			return "index1";
		}
		
		@GetMapping("/chatbot")
		public String chatBot() {
			return "chatbot";
		}
	

		@GetMapping("/certificate_data")
		public String getAll(Model model) {
			List<BirthData> birthdata = service1.getAll();
			model.addAttribute("certificate_data", birthdata);
			return "Birthcertificate";
		}
}
