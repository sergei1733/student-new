package edu.javacourse.student.view;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import edu.javacourse.student.domain.Faculty;
import edu.javacourse.student.domain.Student;
import edu.javacourse.student.domain.StudentForm;

import javax.persistence.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

public class StudentResponse {

    private String documentNumber;
    @JsonSerialize(converter = LocalDateStringConverter.class)
    @JsonDeserialize(converter = StringLocalDateConverter.class)
    private LocalDate documentDate;
    @JsonSerialize(converter = LocalDateStringConverter.class)
    @JsonDeserialize(converter = StringLocalDateConverter.class)
    private LocalDate expiredDate;
    private String universityName;
    private String facultyName;
    private String studentForm;

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getStudentForm() {
        return studentForm;
    }

    public void setStudentForm(String studentForm) {
        this.studentForm = studentForm;
    }
}
