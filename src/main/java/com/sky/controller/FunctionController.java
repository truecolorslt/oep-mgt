package com.sky.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.stereotype.Controller;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lantian
 * @since 2019-01-11
 */
@Controller
@RequestMapping("/function/")
public class FunctionController extends BaseController {
    public static final String TITLE_VALUE = "功能菜单管理";
	/**
	 * 进入功能菜单管理页面
	 * 
	 * @return
	 */
	@RequestMapping(value = "functionMgt")
	public String functionMgt(Model model) {
        model.addAttribute("title",TITLE_VALUE);
		return "function/function_mgt";
	}
}
