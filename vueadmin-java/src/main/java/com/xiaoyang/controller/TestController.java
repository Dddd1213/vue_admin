package com.xiaoyang.controller;

import com. xiaoyang.common.lang.Result;
import com. xiaoyang.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Autowired
	SysUserService sysUserService;

	@Autowired
	BCryptPasswordEncoder bCryptPasswordEncoder;

	@PreAuthorize("hasRole('admin')")
	@GetMapping("/test")
	public Result test() {
		return Result.succ(sysUserService.list());
	}

	// 普通用户、超级管理员
	@PreAuthorize("hasAuthority('sys:user:list')")
	@GetMapping("/test/pass")
	public Result pass() {

		// 加密后密码
		String password = bCryptPasswordEncoder.encode("111111");

		boolean matches = bCryptPasswordEncoder.matches("111111", password);

		System.out.println("匹配结果：" + matches);

		return Result.succ(password);
	}

}
