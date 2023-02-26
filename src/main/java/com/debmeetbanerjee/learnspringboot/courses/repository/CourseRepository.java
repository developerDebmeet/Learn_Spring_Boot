package com.debmeetbanerjee.learnspringboot.courses.repository;

import com.debmeetbanerjee.learnspringboot.courses.bean.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
