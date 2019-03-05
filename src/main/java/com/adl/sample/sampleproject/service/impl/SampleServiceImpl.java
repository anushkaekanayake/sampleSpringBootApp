package com.adl.sample.sampleproject.service.impl;

import com.adl.sample.sampleproject.model.entity.Course;
import com.adl.sample.sampleproject.repository.CourseRepository;
import com.adl.sample.sampleproject.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> executeSample() {
        return courseRepository.findAll();
    }

    @Override
    public int calculateSum(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
