package com.example.student;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentDetails extends JpaRepository<StudentPOJO, String> {

}
