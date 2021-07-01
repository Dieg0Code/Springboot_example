package com.dieg0Code.springbootex.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // data access
public interface StudentRepository extends JpaRepository<Student, Long> { // object and id

}
