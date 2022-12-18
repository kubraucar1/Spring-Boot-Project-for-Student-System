package com.student.system.model;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;


@Entity
@Data
@NoArgsConstructor
@Transactional
@Table(name = "student")
@AllArgsConstructor
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "student_id")
    private int studentId;
    private String studentName;
    private String studentSurname;
    private String studentAddress;
    private String studentPhoneNumber;
    private String studentEmail;
    @JsonIgnore
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_student_family")
    private StudentFamily studentFamily;


    public Student(int studentId, String studentSurname, String studentAddress, String studentPhoneNumber, String studentEmail, StudentFamily studentFamily) {
    }
}
