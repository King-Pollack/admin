package com.king.admin.kimpolladmin.presentation.web.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class AdminWebController {

    @GetMapping({"/login",""})
    public String login() {
        return "admin/admin-login";
    }

    @GetMapping("/main")
    public String main() {
        return "admin/waiting-board";
    }

    @PostMapping("/login")
    public String loginPost() {
        return "redirect:/main";
    }


}
