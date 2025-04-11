package ru.kata.spring.boot_security.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoutController {

    @GetMapping("/logout-success")
    public String showLogoutPage() {
        return "logout"; // Возвращает имя Thymeleaf-шаблона (logout.html)
    }
}