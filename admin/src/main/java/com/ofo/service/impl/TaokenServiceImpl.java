//package com.ofo.service.impl;
//
//import com.baomidou.mybatisplus.core.conditions.Wrapper;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.ofo.dao.TaokenDao;
//import com.ofo.entity.TaokenEntity;
//import com.ofo.service.TaotenService;
//import org.springframework.stereotype.Service;
//
//import java.io.Serializable;
//import java.util.Collection;
//import java.util.Date;
//import java.util.List;
//import java.util.Map;
//import java.util.function.Function;
//@Service
//public class TaokenServiceImpl extends ServiceImpl<TaokenDao,TaokenEntity> implements TaotenService {
//    /**
//     * 12小时后过期
//     */
//    private final static int EXPIRE = 3600 * 12;
//
//
//    @Override
//    public TaokenEntity queryByToken(String token) {
//        return this.getOne(new QueryWrapper<TaokenEntity>().eq("token", token));
//    }
//
//    @Override
//    public TaokenEntity createToken(String userId) {
//        //当前时间
//        Date now = new Date();
//        //过期时间
//        Date expireTime = new Date(now.getTime() + EXPIRE * 1000);
//
//        //生成token
//
//        String token = generetorTaoken();
//        //保存或更新用户token
//        TaokenEntity taokenEntity = new TaokenEntity();
//        taokenEntity.setToken(userId);
//        taokenEntity.setToken(token);
//        taokenEntity.setExpireTime(expireTime);
//        taokenEntity.setUpdateTime(now);
//        this.saveOrUpdate(taokenEntity);
//        return  taokenEntity;
//
//    }
//
//    @Override
//    public void expireToken(long userId) {
//
//    }
//
//    @Override
//    public boolean save(TaokenEntity entity) {
//        return false;
//    }
//
//
//}
