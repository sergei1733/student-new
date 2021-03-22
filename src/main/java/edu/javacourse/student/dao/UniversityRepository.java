package edu.javacourse.student.dao;

import edu.javacourse.student.domain.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepository extends JpaRepository<University, Long> {
}
