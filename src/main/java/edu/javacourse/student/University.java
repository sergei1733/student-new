package edu.javacourse.student;

import javax.persistence.*;

@Table(name ="sr_university")
@Entity
public class University {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "university_id")
    private Long universityId;
    @Column(name = "university_name")
    private String universityName;
    @Column(name = "")


}
