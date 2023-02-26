package com.debmeetbanerjee.learnspringboot.courses.controller;

import com.debmeetbanerjee.learnspringboot.courses.bean.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Java", "Debmeet Banerjee"),
                new Course(2, "Learn OOPS", "Leo Tolstoy")
        );

    }

    @GetMapping("/courses/1")
    public Course getCourse() {
        return new Course(0, "learn nothing", "Anonymous");
    }
}