package com.example.taruc.lab44;

public class Course {
    private String code;
    private String title;
    private String credit;

    public Course(){}

    public Course(String code, String title, String credit){
        this.code = code;
        this.title = title;
        this.credit = credit;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCode() {
        return code;
    }

    public String getCredit() {
        return credit;
    }

    public String getTitle() {
        return title;
    }
}
