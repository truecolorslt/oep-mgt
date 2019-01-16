package com.sky.druid;

import com.alibaba.druid.support.http.StatViewServlet;

import javax.servlet.Servlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

/**
 * @Author: lantian
 * @Date: 2019/1/16
 * @Description:
 */
@WebServlet(urlPatterns = { "/druid/*" }, initParams = {
		@WebInitParam(name = "allow", value = "192.168.1.72,127.0.0.1"), // IP白名单(没有配置或者为空，则允许所有访问)
		@WebInitParam(name = "deny", value = "192.168.1.73"), // IP黑名单
		@WebInitParam(name = "loginUsername", value = "root"),
		@WebInitParam(name = "loginPassword", value = "123"),
		@WebInitParam(name = "resetEnable", value = "true")// 允许HTML页面上的“Reset All”功能
})
public class DruidStatViewServlet extends StatViewServlet implements Servlet {
}
