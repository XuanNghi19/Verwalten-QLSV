/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verwalten;

import java.sql.Blob;
import java.util.ArrayList;

/**
 *
 * @author XuanN
 */
public class Sinh_vien {
    private String id;
    private String name;
    private String date_of_birth;
    private String sex;
    private String address;
    private String hometown;
    private String email;
    private String phoneNumber;
    private String nganhHoc;
    private String lopHoc;
    private String namHoc;
    private double gpa;
    private ArrayList<Mon_hoc> listMonhoc;
    private Blob image;

    public Sinh_vien(String id, String name, String date_of_birth, String sex, String address, String hometown, String email, String phoneNumber, String nganhHoc, String lopHoc, String namHoc, double gpa, ArrayList<Mon_hoc> listMonhoc, Blob image) {
        this.id = id;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.sex = sex;
        this.address = address;
        this.hometown = hometown;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.nganhHoc = nganhHoc;
        this.lopHoc = lopHoc;
        this.namHoc = namHoc;
        this.gpa = gpa;
        this.listMonhoc = listMonhoc;
        this.image = image;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }

    public String getLopHoc() {
        return lopHoc;
    }

    public void setLopHoc(String lopHoc) {
        this.lopHoc = lopHoc;
    }

    public String getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(String namHoc) {
        this.namHoc = namHoc;
    }

    public Blob getImage() {
        return image;
    }

    public void setImage(Blob image) {
        this.image = image;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ArrayList<Mon_hoc> getListMonhoc() {
        return listMonhoc;
    }

    public void setListMonhoc(ArrayList<Mon_hoc> listMonhoc) {
        this.listMonhoc = listMonhoc;
    }
}
