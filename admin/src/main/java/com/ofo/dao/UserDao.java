package com.ofo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ofo.entity.UserAdmin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface UserDao  extends BaseMapper<UserAdmin> {
    List<UserAdmin> findByAccount();
}