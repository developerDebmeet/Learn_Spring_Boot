package com.debmeetbanerjee.learnspringboot.courses.bean;

public class Course {
    private int id;
    private String courseName;
    private String author;

    public Course(int id, String courseName, String author) {
        this.id = id;
        this.courseName = courseName;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthor() {
        return author;
    }

    public String toString() {
       return "[.. ID : " + id + " Name : " + courseName + " Author : " + author + " ..]";
    }
}
