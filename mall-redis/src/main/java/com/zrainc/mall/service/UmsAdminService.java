package com.zrainc.mall.service;

import com.zrainc.mall.mbg.model.UmsAdmin;
import com.zrainc.mall.mbg.model.UmsPermission;

import java.security.Permission;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @Author: Zrainc
 * Date: 2021/1/26
 * Time: 16:40
 * Description: 后台管理员Service
 */
public interface UmsAdminService {
    /**
     * @description: 根据用户名获取后台管理员
     */
    UmsAdmin getAdminByUsername(String username);

    /**
     * @description: 注册功能
     */
    UmsAdmin register(UmsAdmin umsAdminParam);

    /**
     * 登录功能
     * @param username 用户名
     * @param password 密码
     * @return 生成的JWT的token
     */
    String login(String username, String password);

    /**
     * 获取用户所有权限（包括角色权限和+-权限）
     * @return
     */
    List<UmsPermission> getPermissionList(Long adminId);
}
