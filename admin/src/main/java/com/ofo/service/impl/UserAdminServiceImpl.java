package com.ofo.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ofo.dao.UserDao;
import com.ofo.entity.UserAdmin;
import com.ofo.service.UserAdminSercice;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserAdminServiceImpl extends ServiceImpl<UserDao,UserAdmin> implements UserAdminSercice{

    @Override
    public List<UserAdmin> findbyaccount(String useraccount, String userpassword) {
        return null;
    }


}
