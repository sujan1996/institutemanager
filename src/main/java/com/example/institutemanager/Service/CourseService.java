package com.example.institutemanager.Service;

import com.example.institutemanager.Model.Course;
import com.example.institutemanager.Model.Instructor;
import com.example.institutemanager.Repository.CourseRepo;
import com.example.institutemanager.Repository.InstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;

    @Autowired
    InstructorRepo instructorRepo;

    public void saveCourse(Course course, int ins_id){
        Instructor tempInstructor = instructorRepo.getOne(ins_id);
        tempInstructor.add(course);
        courseRepo.save(course);
    }
}
