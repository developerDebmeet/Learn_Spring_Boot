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
        return Arrays.asList(new Course(1, "Lean Java", "Debmeet Banerjee"));

    }

    @GetMapping("/courses/1")
}
