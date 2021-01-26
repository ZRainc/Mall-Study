package com.zrainc.mall.service;

import com.zrainc.mall.common.api.CommonResult;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuchen Zhang
 * Date: 2021/1/26
 * Time: 13:47
 * Description: 会员管理Service
 */

public interface UmsMemberService {
    /**
     * @description: 生成验证码
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * @description: 判断验证码和手机号码是否匹配
     */
    CommonResult verifyAuthCode(String telephone, String authCode);
}
