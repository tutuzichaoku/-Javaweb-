package com.lyrpx.pojo;

public class ICourse {
    private Integer c_id;                       // 主键id
    private String name;                    // 课程名称
    private int hours;                // 课时
    private int schools;                // 学院


    public Integer getId() {
        return c_id;
    }

    public void setId(Integer c_id) {
        this.c_id = c_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHours(){
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getSchools() {
        return schools;
    }

    public void setSchools(int schools) {
        this.schools = schools;
    }


    @Override
    public String toString() {
        return "ICourse{" +
                "c_id=" + c_id +
                ", name='" + name +
                ", hours=" + hours +
                ", schools=" + schools +
                '}';
    }

}
