package com.zrainc.mall.dao;

import com.zrainc.mall.mbg.model.UmsPermission;
import io.lettuce.core.dynamic.annotation.Param;
import org.springframework.stereotype.Repository;

import java.security.Permission;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Yuchen Zhang
 * Date: 2021/1/26
 * Time: 17:31
 * Description: 后台用户与角色管理自定义Dao
 */

@Repository
public interface UmsAdminRoleRelationDao {

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

}
