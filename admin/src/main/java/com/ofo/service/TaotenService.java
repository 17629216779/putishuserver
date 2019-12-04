package com.ofo.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ofo.entity.TaokenEntity;

public interface TaotenService extends IService<TaokenEntity> {
     TaokenEntity queryByToken(String token);

    /**
     * 生成token
     * @param userId  用户ID
     * @return        返回token信息
     */
    TaokenEntity createToken(String userId);

    /**
     * 设置token过期
     * @param userId 用户ID
     */
    void expireToken(long userId);
}
