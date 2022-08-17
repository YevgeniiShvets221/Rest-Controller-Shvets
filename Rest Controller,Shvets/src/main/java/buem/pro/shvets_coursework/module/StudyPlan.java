package buem.pro.shvets_coursework.module;

import java.time.LocalDateTime;
import java.util.Objects;

public class StudyPlan {
    private String id;
    private  Student student;
    private  Subjects subjects;
    private String mark;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public StudyPlan() {
    }

    public StudyPlan(String id,Student student, Subjects subjects, String mark) {
        this.id = id;
        this.student = student;
        this.subjects = subjects;
        this.mark = mark;
    }

    public StudyPlan(String id, Student student, Subjects subjects, String mark, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.student = student;
        this.subjects = subjects;
        this.mark = mark;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public StudyPlan(String id, String s, String s1, String mark, LocalDateTime now, LocalDateTime now1) {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Subjects getSubjects() {
        return subjects;
    }

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudyPlan studyPlan = (StudyPlan) o;
        return id.equals(studyPlan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "StudyPlan{" +
                ", id='" + id + '\'' +
                "student=" + student +
                ", subjects=" + subjects +
                ", mark=" + mark +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}


