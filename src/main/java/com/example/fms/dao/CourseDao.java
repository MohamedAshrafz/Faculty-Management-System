package com.example.fms.dao;

import com.example.fms.model.Course;

import java.util.ArrayList;

public interface CourseDao {
    Course findCourseByCode(String courseCode);

    ArrayList<Course> findCoursePrerequisits(Course course);

    void updateDescription(Course course, String newDescription);

}
