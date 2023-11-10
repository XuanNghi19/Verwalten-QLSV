/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package verwalten;

/**
 *
 * @author XuanN
 */
public class Mon_hoc {
    private String name;
    private String id;
    private String teacherCharge;
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

    public Mon_hoc(String name, String id, String teacherCharge, String describe) {
        this.name = name;
        this.id = id;
        this.teacherCharge = teacherCharge;
        this.describe = describe;
    } 

    public String getTeacherCharge() {
        return teacherCharge;
    }

    public void setTeacherCharge(String teacherCharge) {
        this.teacherCharge = teacherCharge;
    }
}
