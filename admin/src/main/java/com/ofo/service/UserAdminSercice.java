package com.ofo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ofo.entity.UserAdmin;

import java.util.List;

public interface UserAdminSercice extends IService<UserAdmin> {
    List<UserAdmin> findbyaccount(String useraccount,String userpassword);
}
