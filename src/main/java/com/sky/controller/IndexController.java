package com.sky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 主页控制器
 *
 * @Author: lantian
 * @Date: 2019/1/8
 * @Description:
 */
@Controller
public class IndexController extends BaseController {
	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
