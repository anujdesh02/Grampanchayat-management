package GramPanchayat.controller;

import java.io.IOException;
import java.security.Principal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import com.lowagie.text.DocumentException;

import GramPanchayat.model.ApplyCertificate;
import GramPanchayat.model.BirthData;
import GramPanchayat.model.ContactData;
import GramPanchayat.model.DeathData;
import GramPanchayat.model.Marriege;
import GramPanchayat.model.UserDtls;
import GramPanchayat.model.Voter;
import GramPanchayat.repository.UserRepository;
import GramPanchayat.service.CertificateService;
import GramPanchayat.service.ContactService;
import GramPanchayat.service.UserServices;

import javax.servlet.http.HttpServletResponse;


@Controller
@RequestMapping("/user")
public class UserController {

	@Autowired
	private CertificateService service1;

	@Autowired
	private UserRepository userRepo;

	@Autowired
	private ContactService conService;

	@Autowired
	private BCryptPasswordEncoder passwordEncode;
	
	@Autowired
	private UserServices service;

	@ModelAttribute
	private void userDetails(Model m, Principal p) {
		String email = p.getName();
		UserDtls user = userRepo.findByEmail(email);

		m.addAttribute("user", user);

	}

	@GetMapping("/")
	public String home() {
		System.out.println("User Index Page");
		return "user/index1";
	}

	@GetMapping("/changPass")
	public String loadChnagePassword() {
		return "user/change_password";
	}

	@PostMapping("/updatePassword")
	public String changePassword(Principal p, @RequestParam("oldPass") String oldPass,
			@RequestParam("newPass") String newPass, HttpSession session) {

		String email = p.getName();

		UserDtls loginUser = userRepo.findByEmail(email);

		boolean f = passwordEncode.matches(oldPass, loginUser.getPassword());

		if (f) {

			loginUser.setPassword(passwordEncode.encode(newPass));
			UserDtls updatePasswordUser = userRepo.save(loginUser);
			if (updatePasswordUser != null) {
				session.setAttribute("msg", "Password Change Success");
			} else {
				session.setAttribute("msg", "Something Went Wrong On Server");
			}
		} else {
			session.setAttribute("msg", "Old Password Incorrect");
		}

		return "redirect:/user/changPass";
	}

	@GetMapping("/about")
	public String about() {
		System.out.println("User About Page");
		return "user/about";
	}

	@GetMapping("/required_doc_certificate_list")
	public String required_doc_certificate_list() {
		System.out.println("User required_doc_certificate_list Page");
		return "user/required_doc_certificate_list";
	}

	
	@GetMapping("/birthcertificate")
	public String Birthcertificate() {
		return "user/birthform";
	}

	@GetMapping("/Deathcertificate")
	public String Deathcertificate() {
		return "user/deathform";
	}

	@GetMapping("/voterApplication")
	public String voterApplication() {
		return "user/voterApplication";
	}

	@GetMapping("/marriege_certificate")
	public String marriege_certificate() {
		return "user/marriege_certificate";
	}

	@GetMapping("/contact")
	public String GetContact() {
		return "user/contact";
	}

	@PostMapping("/birthcertificate")
	public String SaveBirthData(@ModelAttribute BirthData b) {
		service1.save(b);
		return "user/birthpdfdownload";
	}

	@PostMapping("/Deathcertificate")
	public String SaveDeathData(@ModelAttribute DeathData d) {
		service1.deathsave(d);
		return "user/deathform";
	}

	@PostMapping("/voterApplication")
	public String SaveVoterData(@ModelAttribute Voter v) {
		service1.saveVoter(v);
		System.out.println("1234567899999999");
		return "user/voterApplication";
	}

	@PostMapping("/marriegeCertificate")
	public String SaveMarriageData(@ModelAttribute Marriege m) {
		service1.saveMarrieage(m);
		return "user/marriege_certificate";
	}

//	  @PostMapping("/contact") 
//	@RequestMapping(value="/contact", method=RequestMethod.POST) 
	
	  


//	@RequestMapping(value="/contactdata", method=RequestMethod.POST) 
//	public String SaveContactData(@ModelAttribute ContactData c) 
//	{
//		conService.SaveContact(c);
//		return "user/contact"; 
//	}
	
	
	@PostMapping("/contactdata")
	public String SaveContactData(@ModelAttribute ContactData c)
	{
	    conService.SaveContact(c);	
		return "user/contact";
	}
	
	
	@GetMapping("/CentrallySponsoredSchemes")
	public String CentrallySponsoredSchemes()
	{ 
		return "user/CentrallySponsoredSchemes";
	}
	
	
	
	@GetMapping("/StateSponsoredSchemes")
	public String StateSponsoredSchemes()
	{
		return "user/StateSponsoredSchemes";
	}
	
	
	@GetMapping("/user")
	public String GetUser()
	{
		return "user/user";
	}
	
	@GetMapping("/privacyPolicy")
	public String getPrivacyPolicy()
	{
		return "user/privacyPolicy";
	}
	
	
	
	@GetMapping("/termsAndCondition")
	public String termsAndCondition()
	{
		return "user/termsAndCondition";
	}
	
	
	
	@GetMapping("/birthpdfdownload")
	public String birthpdfdownload()
	{
		return "user/birthpdfdownload";
	}
	
	
	@PostMapping("/apply_certificate")
	public String apply_certificate(@ModelAttribute ApplyCertificate a) {
		service1.saveApplyCertificate(a);
		return "user/required_doc_certificate_list";
	
	}
	
	
	


}