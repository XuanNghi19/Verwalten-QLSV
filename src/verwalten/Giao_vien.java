/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verwalten;

import java.sql.Blob;
/**
 *
 * @author XuanN
 */
public class Giao_vien {
    private String name;
    private String id;
    private String date_of_birth;
    private String sex;
    private String address;
    private String hometown;
    private String email;
    private String phoneNumeber;
    private Blob image;

    public Giao_vien(String name, String id, String date_of_birth, String sex, String address, String hometown, String email, String phoneNumeber) {
        this.name = name;
        this.id = id;
        this.date_of_birth = date_of_birth;
        this.sex = sex;
        this.address = address;
        this.hometown = hometown;
        this.email = email;
        this.phoneNumeber = phoneNumeber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumeber() {
        return phoneNumeber;
    }

    public void setPhoneNumeber(String phoneNumeber) {
        this.phoneNumeber = phoneNumeber;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }
}
