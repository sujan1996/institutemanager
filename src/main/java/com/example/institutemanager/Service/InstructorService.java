package com.example.institutemanager.Service;

import com.example.institutemanager.Model.Instructor;
import com.example.institutemanager.Model.InstructorDetail;
import com.example.institutemanager.Repository.InstructorDetailRepo;
import com.example.institutemanager.Repository.InstructorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InstructorService {

    @Autowired
    InstructorRepo instructorRepo;

    @Autowired
    InstructorDetailRepo instructorDetailRepo;

    public void saveInstructor(Instructor instructor, InstructorDetail instructorDetail){
        instructor.setInstructorDetail(instructorDetail);
        instructorRepo.save(instructor);
    }

    public List<Instructor> listAll() {
        return instructorRepo.findAll();
    }

    public void deleteInstructor(int id){
        instructorRepo.deleteById(id);
    }

    public List<InstructorDetail> listAllDetails() {
        return instructorDetailRepo.findAll();
    }
}
