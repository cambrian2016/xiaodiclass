package net.htwater.xiaodiclass.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import net.htwater.xiaodiclass.validators.PasswordEqual;
import org.hibernate.validator.constraints.Length;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
/**
* 类  名：
* 描  述：
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date  
*/
@PasswordEqual(min = 2,max = 5)
public class Person {
    /**
     * name : shy
     * age : 23
     */

    @Length(min = 2, max = 5, message = "name 长度不对")
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", password1='" + password1 + '\'' +
                ", password2='" + password2 + '\'' +
                ", school=" + school +
                '}';
    }

    private String password1;
    private String password2;

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    @Valid
    private School school;

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
