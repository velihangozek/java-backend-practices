package org.velihangozek;

public class Course {
    private String name;
    private String code;
    private Integer hoursOfWeek;
    private Teacher teacher;
    private Integer note;

    public Course(String name) {
        this.name = name;
    }

    public Course(String name, String code, Integer hoursOfWeek) {
        this.name = name;
        this.code = code;
        this.hoursOfWeek = hoursOfWeek;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getHoursOfWeek() {
        return hoursOfWeek;
    }

    public void setHoursOfWeek(Integer hoursOfWeek) {
        this.hoursOfWeek = hoursOfWeek;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Integer getNote() {
        return note;
    }

    public void setNote(Integer note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", hoursOfWeek=" + hoursOfWeek +
                '}';
    }
}
