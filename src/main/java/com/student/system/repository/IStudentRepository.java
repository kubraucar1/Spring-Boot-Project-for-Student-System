package com.student.system.repository;

import com.student.system.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "SELECT * FROM `student`.`student` where student_id=?1;",nativeQuery = true)
     Student findStudentById(int idNumber);
}
