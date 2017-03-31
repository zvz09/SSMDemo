package com.zvz.controller;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.zvz.entity.TUserEntity;
import com.zvz.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;

    @RequestMapping(value = "/showUser/{id}")
    public String toIndex(@PathVariable Integer id, HttpServletRequest request, Model model){
        //int userId = Integer.parseInt(request.getParameter("id"));
        TUserEntity user = this.userService.getUserById(id);
        model.addAttribute("user", user);
        return "showUser";
    }
}
