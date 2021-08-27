package com.hendisantika.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-alert2
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 27/08/21
 * Time: 09.34
 */
@Controller
public class TestController {
    @GetMapping("/")
    public String test() {
        return "index";
    }

    @GetMapping("/{id}")
    @ResponseBody
    public Object test(@PathVariable("id") String id, Model model) {
        return id != null && !id.trim().equals("") && id.equalsIgnoreCase("OK");
    }
}
