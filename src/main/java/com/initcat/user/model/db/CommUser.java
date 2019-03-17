package com.initcat.user.model.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class CommUser implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String phone;
    private String password;
    private String name;
    private Integer six;
    private Integer age;
    private Integer activate_status;
    private Date create_time;
    private Date activate_time;
    private Date update_time;
    private String memo;

    public CommUser() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSix() {
        return six;
    }

    public void setSix(Integer six) {
        this.six = six;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getActivate_status() {
        return activate_status;
    }

    public void setActivate_status(Integer activate_status) {
        this.activate_status = activate_status;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getActivate_time() {
        return activate_time;
    }

    public void setActivate_time(Date activate_time) {
        this.activate_time = activate_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}