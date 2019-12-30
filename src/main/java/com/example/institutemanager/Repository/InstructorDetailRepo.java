package com.example.institutemanager.Repository;

import com.example.institutemanager.Model.InstructorDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailRepo extends JpaRepository<InstructorDetail, Integer> {
}
