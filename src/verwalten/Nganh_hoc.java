/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verwalten;

import java.util.*;

/**
 *
 * @author XuanN
 */
public class Nganh_hoc {
    
    private int sinhVienCount = 0;
    
    private String name;
    private String id;
    private String describe;

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

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public int getSinhVienCount() {
        return sinhVienCount;
    }

    public void addSinhVien() {
        this.sinhVienCount++;
    }

    public Nganh_hoc(String name, String id, String describe) {
        this.name = name;
        this.id = id;
        this.describe = describe;
    } 
    
}
