package com.carfinder.carfinder.infrastructure.controllers;

import com.carfinder.carfinder.domain.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.DefaultOAuth2User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:5173/")
public class UserController {

    @GetMapping("/userInfo")
    public User getUserInfo(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.getPrincipal() instanceof DefaultOAuth2User) {
            DefaultOAuth2User oauth2User = (DefaultOAuth2User) authentication.getPrincipal();
            String name = oauth2User.getAttribute("name");
            String email = oauth2User.getAttribute("email");
            String pictureUrl = oauth2User.getAttribute("picture");
            return new User(name, email, pictureUrl);
        }
        return null;
    }
}
