package com.cw.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 陈小哥cw
 * @date 2020/12/15 10:05
 */
// 这个类的所有方法返回的数据直接写给浏览器，如果是对象可以转为json数据

// RestController=ResponseBody+Controller
/*@ResponseBody
@Controller*/
@RestController
public class HelloController {


    @RequestMapping
    public String hello(){
        return "hello world quick!";
    }


}
