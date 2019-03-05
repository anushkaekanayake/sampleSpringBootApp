package com.adl.sample.sampleproject;

import com.adl.sample.sampleproject.model.entity.Lesson;
import com.adl.sample.sampleproject.repository.LessonRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class SampleServiceImplTest {
    @Autowired
    LessonRepository lessonRepository;

    @Before
    public void saveLesson() {
        Lesson lesson = new Lesson();
        lesson.setLeassonName("Lesson1");
        lessonRepository.save(lesson);
    }

    @Test
    public void loadLesson() {
        assert (lessonRepository.findAll().size() == 1);
    }

}
