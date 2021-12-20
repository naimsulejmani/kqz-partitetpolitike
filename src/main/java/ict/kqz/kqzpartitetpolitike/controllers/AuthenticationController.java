package ict.kqz.kqzpartitetpolitike.controllers;

import ict.kqz.kqzpartitetpolitike.models.dtos.LoginModel;
import ict.kqz.kqzpartitetpolitike.services.CookieUtilityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/auth")
public class AuthenticationController {
    private final CookieUtilityService utilityService;

    public AuthenticationController(CookieUtilityService utilityService) {
        this.utilityService = utilityService;
    }

    //login - GET
    //login - POST


    //register - GET
    //register - POST

    @GetMapping(value = "/login")
    public String getLoginPage(Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {

        if(utilityService.getLoggedIn(request.getCookies())) {
            response.sendRedirect("/partiapolitike");
            return null;
        }

        model.addAttribute("loginModel", new LoginModel());
        model.addAttribute("loginAction","/auth/login"); //POST /auth/login
        return "login";
    }


    @PostMapping(value = "/login")
    public String postLogin(@ModelAttribute LoginModel loginModel, Model model, HttpServletRequest req, HttpServletResponse res) throws IOException {
        if(!loginModel.getUsername().equals(loginModel.getPassword())) {
            model.addAttribute("error","Username and password are note the same!");
            return getLoginPage(model,req,res);
        }

        Cookie cookie = new Cookie("logged_in","true");
        cookie.setPath("/");
        res.addCookie(cookie);

        res.sendRedirect("/partiapolitike");
        return null;
    }

    @GetMapping(value = "/logout")
    public void logout(HttpServletResponse response) throws IOException {
        Cookie loggedInCookie = new Cookie("logged_in","false");
        loggedInCookie.setMaxAge(0);
        loggedInCookie.setPath("/");
        response.addCookie(loggedInCookie);
        response.sendRedirect("/auth/login");
    }

}
