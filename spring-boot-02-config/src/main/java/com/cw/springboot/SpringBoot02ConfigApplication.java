package com.cw.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @ImportResource：导入Spring的配置文件，让配置文件里面的内容生效； Spring Boot里面没有Spring的配置文件，我们自己编写的配置文件，也不能自动识别；
 * 想让Spring的配置文件生效，加载进来；@ImportResource标注在一个配置类上
 * <p>
 * SpringBoot推荐给容器中添加组件的方式；推荐使用全注解的方式
 * 1、配置类@Configuration------>Spring配置文件
 * 2、使用@Bean给容器中添加组件
 */

// 导入Spring的配置文件，让配置文件里面的内容生效
//@ImportResource(locations = {"classpath:beans.xml"})
@SpringBootApplication
public class SpringBoot02ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot02ConfigApplication.class, args);
    }

}
