package com.spring5.aop.aspect.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author lijichen
 * @date 2020/11/16 - 15:45
 */
@Configuration
//组件扫描
@ComponentScan(basePackages = {"com.spring5.aop.aspect"})
//开启aspectj生成代理对象
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAOP {
}
