package com.zrainc.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuchen Zhang
 * Date: 2021/1/26
 * Time: 10:03
 * Description: MyBatis配置类
 */

@Configuration
@MapperScan("com.zrainc.mall.mbg.mapper")
public class MyBatisConfig {
}
