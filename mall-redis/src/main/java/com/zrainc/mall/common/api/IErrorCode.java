package com.zrainc.mall.common.api;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuchen Zhang
 * Date: 2021/1/26
 * Time: 10:39
 * Description: 封装API的错误码
 */

public interface IErrorCode {
    long getCode();

    String getMessage();
}
