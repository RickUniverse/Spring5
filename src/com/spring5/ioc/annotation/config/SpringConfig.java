package com.spring5.ioc.annotation.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author lijichen
 * @date 2020/11/15 - 17:00
 */
//spring的配置类
@Configuration
//开启组件扫描
@ComponentScan(basePackages = {"com.spring5.ioc.annotation"})
public class SpringConfig {
}
