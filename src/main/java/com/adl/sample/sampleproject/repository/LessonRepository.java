package com.adl.sample.sampleproject.repository;

import com.adl.sample.sampleproject.model.entity.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository extends JpaRepository<Lesson,Integer> {
}
