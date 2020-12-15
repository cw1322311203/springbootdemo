package com.cw.springboot.config;

import com.cw.springboot.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 陈小哥cw
 * @date 2020/12/15 13:58
 */

/**
 * SpringBoot推荐给容器中添加组件的方式；推荐使用全注解的方式
 * <p>
 * 1、配置类@Configuration------>Spring配置文件
 * <p>
 * 2、使用@Bean给容器中添加组件
 *
 * @Configuration: 指明当前类是一个配置类，就是来替代之前的Spring配置文件
 * <p>
 * 在配置文件中用<bean></bean>标签添加组件
 */
@Configuration
public class MyAppConfig {

    // 将方法的返回值添加到容器中，容器中这个组件默认的id就是方法名
    @Bean
    public HelloService helloService() {
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloService();
    }
}
