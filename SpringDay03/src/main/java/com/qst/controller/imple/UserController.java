package com.qst.controller.imple;

import com.qst.controller.IUserController;
import com.qst.service.imple.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller()
public class UserController implements IUserController {
    @Autowired
    UserService userService;
    public void insert() {
        userService.inset();
        System.out.println("UserController");
    }
}
