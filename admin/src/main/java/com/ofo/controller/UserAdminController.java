package com.ofo.controller;

import com.ofo.entity.UserAdmin;
import com.ofo.service.UserAdminSercice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;

@Controller
@RestController
public class UserAdminController {
    private Logger logger = LoggerFactory.getLogger(UserAdminController.class);
    @Autowired
    private  UserAdminSercice userAdminSercice;
    public HashMap<String,Object> findbyaccount(String useraccount,String userpassword,HttpServletRequest httpServletRequest){
        HashMap<String,Object> hashMap = new HashMap<>();
        List<UserAdmin>userAdminSercice.findbyaccount(useraccount,userpassword);

    }


}
