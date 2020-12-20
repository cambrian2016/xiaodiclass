package net.htwater.xiaodiclass.model.entity;

import org.hibernate.validator.constraints.Length;

import javax.naming.Name;

public class School {

    @Length(min = 1,max = 3)
    private String address;

    private int area;

    @Override
    public String toString() {
        return "School{" +
                "address='" + address + '\'' +
                ", area=" + area +
                '}';
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }
}
