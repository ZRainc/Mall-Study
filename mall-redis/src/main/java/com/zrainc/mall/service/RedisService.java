package com.zrainc.mall.service;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuchen Zhang
 * Date: 2021/1/24
 * Time: 23:49
 * Description: No Description
 */

public interface RedisService {

    /**
     * @description: 存储数据
     */
    void set(String key , String value);

    /**
     * @description: 获取数据
     */
    String get(String key);

    /**
     * @description: 设置超时时间
     */
    boolean expire(String key, long expire);

    /**
     * @description: 删除数据
     */
    void delete(String key);

    /**
     * @description: 自增操作
     */
    Long increment(String key, long delta);

}
