package com.carfinder.carfinder.infrastructure.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/admin")
    public String admin(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof DefaultOAuth2User) {
            StringBuilder sb = new StringBuilder();
            DefaultOAuth2User oauth2User = (DefaultOAuth2User) authentication.getPrincipal();
            sb.append("Name: " + oauth2User.getAttribute("name") + "\n");
            sb.append("Email: " + oauth2User.getAttribute("email") + "\n");
            sb.append("Picture: " + oauth2User.getAttribute("picture") + "\n");
            sb.append(oauth2User.getAuthorities());
            return sb.toString();
        }
        return "No identified!";
    }

}
