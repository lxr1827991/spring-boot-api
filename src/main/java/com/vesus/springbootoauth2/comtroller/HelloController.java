package com.vesus.springbootoauth2.comtroller;

import com.vesus.springbootoauth2.model.Permission;
import com.vesus.springbootoauth2.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    PermissionService permissionService ;

    @RequestMapping("/")
    public String index(){

        return "index" ;
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello" ;
    }

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/abc")
    public List<Permission> getroles(){
        return permissionService.findByAdminUserId(1) ;
    }
}
