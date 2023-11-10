/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verwalten;

/**
 *
 * @author XuanN
 */
public class Lop_hoc {
    private String name;
    private String id;
    private String majors;
    private String teacherCharge;

    public Lop_hoc(String name, String id, String majors, String teacherCharge) {
        this.name = name;
        this.id = id;
        this.majors = majors;
        this.teacherCharge = teacherCharge;
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

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getTeacherCharge() {
        return teacherCharge;
    }

    public void setTeacherCharge(String teacherCharge) {
        this.teacherCharge = teacherCharge;
    }
    
}
