package com.cw.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author 陈小哥cw
 * @date 2020/12/10 13:25
 *
 * 1.开启自动化配置：由于项目中添加了spring-boot-starterweb依赖，因此在开启了自动化配置之后会自动进行Spring和Spring MVC的配置
 * 2.可以直接使用组合注解@Spring BootApplication来代替@EnableAutoConfiguration和@ComponentScan
 * 3.@ComponentScan注解默认扫描的类都位于当前类所在包的下面，因此建议在实际项目开发中把项目启动类放在根包中
 */
//@EnableAutoConfiguration
//@ComponentScan
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        /**
         * 在Java项目的main方法中，通过SpringApplication中的run方法启动项目。
         * 第一个参数传入App.class，告诉Spring哪个是主要组件。
         * 第二个参数是运行时输入的其他参数
         */
        SpringApplication.run(App.class, args);
    }
}
