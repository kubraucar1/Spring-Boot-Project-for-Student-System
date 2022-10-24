package com.student.system.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String studentSurname;

    private String studentAddress;
    private String studentPhoneNumber;
    private String studentEmail;














    public Student() {

    }

    public Student(String studentName, String studentSurname, int studentId, String studentAddress, String studentPhoneNumber, String studentEmail) {
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
        this.studentPhoneNumber = studentPhoneNumber;
        this.studentEmail = studentEmail;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public String getStudentPhoneNumber() {
        return studentPhoneNumber;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentSurname(String studentSurname) {
        this.studentSurname = studentSurname;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentPhoneNumber(String studentPhoneNumber) {
        this.studentPhoneNumber = studentPhoneNumber;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentSurname='" + studentSurname + '\'' +
                ", studentId='" + studentId + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentPhoneNumber='" + studentPhoneNumber + '\'' +
                ", studentEmail='" + studentEmail + '\'' +
                '}';
    }


}
