package com.xiaoyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyang.entity.SysRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author  ：xiaoyang
 * @since 2023-10-24
 */
public interface SysRoleService extends IService<SysRole> {

	List<SysRole> listRolesByUserId(Long userId);

}
