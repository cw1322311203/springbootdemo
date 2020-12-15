package com.cw.springboot.bean;

import org.hibernate.validator.constraints.Email;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 陈小哥cw
 * @date 2020/12/15 10:31
 *
 * 将配置文件中配置的每一个属性的值，映射到这个组件中
 * @ConfigurationProperties :告诉SpringBoot将本类中的所有属性和配置文件中相关的配置进行绑定
 *      prefix = "person"：配置文件中哪个下面的所有属性进行一一映射
 *
 * 只有这个组件是容器中的组件，才能使用容器提供的@ConfigurationProperties功能
 * @ConfigurationProperties(prefix = "person")默认从全局配置文件中获取值
 *
 * @PropertySource： 加载指定的配置文件
 *
 */
//@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
//@Validated
public class Person {

    /**
     * <bean class="Person">
     *      <property name="lastName" value="字面量 / ${key}从环境变量、配置文件中获取值 / #{SpEL}"></property>
     * <bean/>
     * 如果说，我们只是在某个业务逻辑中需要获取一下配置文件中的某项值，使用@Value；
     * @Value 需要一个个指定属性，
     *       不支持松散绑定(松散语法，如last-name和lastName)
     *       不支持JSR303数据校验(判断是否为Email合法地址)
     *       不支持复杂类型封装（如无法取值@Value("${person.maps}")）
     *       支持Spel（Spring Expression Language）
     *
     * 如果说，我们专门编写了一个javaBean来和配置文件进行映射，我们就直接使用@ConfigurationProperties；
     * @ConfigurationProperties
     *      支持松散绑定(松散语法 ， 如last - name和lastName)
     *      支持JSR303数据校验(判断是否为Email合法地址)
     *      支持复杂类型封装（如无法取值@Value("${person.maps}")）
     *      不支持Spel（Spring Expression Language）
     */
    //@Value("${person.last-name}")
    //lastName必须是邮箱格式
    //@Email
    private String lastName;
    //@Value("#{11*2}")
    private Integer age;
    //@Value("true")
    private Boolean boss;
    private Date birth;

    //@Value("${person.maps}")
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
