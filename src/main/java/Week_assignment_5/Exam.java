package Week_assignment_5;

package com.example;

import jakarta.persistence.*;

@Entity
@Table(name = "exams")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;
    @Column(name = "grade", nullable = false)
    private int grade;

    public Exam() {}
    public Exam(Student student, int grade) {
        this.student = student;
        this.grade = grade;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

}
