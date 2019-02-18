package com.adl.sample.sampleproject.repository;

import com.adl.sample.sampleproject.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

    @Query("SELECT c FROM Course c WHERE c.name=:courseName")
    Course findCourseById(@Param("courseName") String courseName);
}
