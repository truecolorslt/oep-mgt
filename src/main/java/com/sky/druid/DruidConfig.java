package com.sky.druid;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @Author: lantian
 * @Date: 2019/1/16
 * @Description:
 */
@Configuration // 标识该类被纳入spring容器中实例化并管理
@ServletComponentScan // 用于扫描所有的Servlet、filter、listener
// @PropertySource(value = "classpath:druid.properties")
public class DruidConfig {
	@Bean
	@ConfigurationProperties(prefix = "spring.datasource") // 加载时读取指定的配置信息,前缀为spring.datasource.druid
	public DataSource druidDataSource() {
		return new DruidDataSource();
	}
}
