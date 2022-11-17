package com.student.system.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;


@Entity   //we are working on a gradle project so we had added dependencies to gradlew.bat before.
@Data
@NoArgsConstructor
@Transactional
@AllArgsConstructor
@Table(name = "student_family")
public class StudentFamily {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "parent_id")
    private  int parentId;

    private  String parentName;
    private  String parentPhone;
    private String parentAddress;




}
