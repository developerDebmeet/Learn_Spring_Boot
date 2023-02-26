package com.debmeetbanerjee.learnspringboot.courses.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue
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
