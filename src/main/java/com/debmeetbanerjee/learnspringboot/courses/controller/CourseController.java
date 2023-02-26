package com.debmeetbanerjee.learnspringboot.courses.controller;

import com.debmeetbanerjee.learnspringboot.courses.bean.Course;
import com.debmeetbanerjee.learnspringboot.courses.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
public class CourseController {

    @Autowired
    private CourseRepository repository;

    @GetMapping("/courses")
    public List<Course> getAllCourses() {
//        return Arrays.asList(
//                new Course(1, "Learn Java", "Debmeet Banerjee"),
//                new Course(2, "Learn OOPS", "Leo Tolstoy")
//        );

        return repository.findAll();

    }

    @GetMapping("/courses/1")
    public Course getCourseById(@PathVariable long id) {
//        return new Course(0, "learn nothing", "Anonymous");
        Optional<Course> course = repository.findById(id);
        if(course.isEmpty()) {
            throw new RuntimeException("Course not found with id " + id);
        }
        return course.get();
    }

    @PostMapping("/courses")
    public void createCourse(@RequestBody Course course) {
        repository.save(course);
    }

    @PutMapping("/courses/{id}")
    public void updateCourse(@RequestBody Course course, @PathVariable int id) {
        course.setId(id);
        repository.save(course);
    }
}
