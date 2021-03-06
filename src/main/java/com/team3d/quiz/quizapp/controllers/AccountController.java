package com.team3d.quiz.quizapp.controllers;


import com.team3d.quiz.quizapp.entities.Account;
import com.team3d.quiz.quizapp.services.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccountController {

    private AccountService accountService;


    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping(value = "/signup")
    private String getModel(Model model){
        model.addAttribute("account",new Account());
        return "MainPages/Signup";

    }

    @PostMapping(value = "/signup")
    public String signUpUser(@ModelAttribute Account account, Model model){

        accountService.saveAccount(account);

        return "MainPages/Login";
    }



    @GetMapping("/login")
    public String getLoginPage(){
        return "MainPages/Login";
    }


    @GetMapping("/success")
    public String getSuccessPage() {
        return "MainPages/Success";
    }

    @GetMapping("/accessDenied")
    public String getAccessDeniedPage() {
        return "MainPages/AccessDenied";
    }
}
