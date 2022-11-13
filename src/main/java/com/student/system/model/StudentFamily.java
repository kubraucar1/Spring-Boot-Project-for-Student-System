package com.student.system.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity   //we are working on a gradle project so we had added dependencies to gradlew.bat before.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentFamily {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    long parentId;

    String parentName;
    String parentPhone;
    String parentAddress;


    @Override
    public String toString() {
        return "StudentFamily{" +
                "parentId=" + parentId +
                ", parentName='" + parentName + '\'' +
                ", parentPhone='" + parentPhone + '\'' +
                ", parentAddress='" + parentAddress + '\'' +
                '}';
    }
}
