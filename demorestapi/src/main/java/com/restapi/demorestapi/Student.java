package com.restapi.demorestapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder//simplifies object creation and improves code readability
public class Student {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long studentRollNumber;
    private String studentName;
    private int studentAge;
    private String studentAddress;
    private String[] StudentSubjects;
}
