package com.nem.docms.controllers;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.nem.docms.config.UserValidator;
//import com.nem.docms.servies.LoginService;
//import com.nem.docms.servies.SecurityService;

@RestController
@RequestMapping("/login")
public class LoginController {
//	@Autowired
//    private LoginService userService;
//
//    @Autowired
//    private SecurityService securityService;
//
//    @Autowired
//    private UserValidator userValidator;

    /*@GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("userForm", new User());

        return "registration";
    }

    @PostMapping("/registration")
    public String registration(@ModelAttribute("userForm") User userForm, BindingResult bindingResult) {
        userValidator.validate(userForm, bindingResult);

        if (bindingResult.hasErrors()) {
            return "registration";
        }

        userService.save(userForm);

        securityService.autoLogin(userForm.getUsername(), userForm.getPasswordConfirm());

        return "redirect:/welcome";
    }*/

    @PostMapping("/login")
    public String login(Model model, String error, String logout) {
    	System.out.println("Login Controller login()");
        if (error != null)
            model.addAttribute("error", "Your username and password is invalid.");

        if (logout != null)
            model.addAttribute("message", "You have been logged out successfully.");

        return "main";
    }

    /*@GetMapping({"/", "/welcome"})
    public String welcome(Model model) {
        return "welcome";
    }*/
    
}
