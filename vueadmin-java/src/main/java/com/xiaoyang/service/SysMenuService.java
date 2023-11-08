package com.xiaoyang.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.xiaoyang.common.dto.SysMenuDto;
import com.xiaoyang.entity.SysMenu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author  ：xiaoyang
 * @since 2023-10-24
 */
public interface SysMenuService extends IService<SysMenu> {

	List<SysMenuDto> getCurrentUserNav();

	List<SysMenu> tree();

}
