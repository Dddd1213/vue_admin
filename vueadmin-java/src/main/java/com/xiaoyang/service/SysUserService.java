package com.xiaoyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyang.entity.SysUser;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author  ：xiaoyang
 * @since 2023-10-24
 */
public interface SysUserService extends IService<SysUser> {

	SysUser getByUsername(String username);

	String getUserAuthorityInfo(Long userId);

	void clearUserAuthorityInfo(String username);

	void clearUserAuthorityInfoByRoleId(Long roleId);

	void clearUserAuthorityInfoByMenuId(Long menuId);


}
