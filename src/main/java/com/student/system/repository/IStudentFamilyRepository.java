package com.student.system.repository;

import com.student.system.model.StudentFamily;
import org.springframework.data.jpa.repository.JpaRepository;

import java.net.Inet4Address;

public interface IStudentFamilyRepository extends JpaRepository<StudentFamily, Integer> {
}
