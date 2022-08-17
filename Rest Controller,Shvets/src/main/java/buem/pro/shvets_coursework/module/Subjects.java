package buem.pro.shvets_coursework.module;

import java.time.LocalDateTime;
import java.util.Objects;

import static java.lang.String.*;

public class Subjects {
    private String id;
    private String name;
    private String lecturesHours;
    private String practicesHours;
    private String laboratoryWorkHours;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Subjects() {
    }


    public Subjects(String id, String name, String lecturesHours, String practicesHours, String laboratoryWorkHours) {
        this.id = id;
        this.name = name;
        this.lecturesHours = lecturesHours;
        this.practicesHours = practicesHours;
        this.laboratoryWorkHours = laboratoryWorkHours;
    }

    public Subjects(String id, String name, String lecturesHours, String practicesHours, String laboratoryWorkHours, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.lecturesHours = lecturesHours;
        this.practicesHours = practicesHours;
        this.laboratoryWorkHours = valueOf(laboratoryWorkHours);
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLecturesHours() {
        return lecturesHours;
    }

    public void setLecturesHours(String lecturesHours) {
        this.lecturesHours = lecturesHours;
    }

    public String getPracticesHours() {
        return practicesHours;
    }

    public void setPracticesHours(String practicesHours) {
        this.practicesHours = practicesHours;
    }

    public String getLaboratoryWorkHours() {
        return laboratoryWorkHours;
    }

    public void setLaboratoryWorkHours(String laboratoryWorkHours) {
        this.laboratoryWorkHours = laboratoryWorkHours;
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
        Subjects subjects = (Subjects) o;
        return id.equals(subjects.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Subjects{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lecturesHours=" + lecturesHours +
                ", practicesHours=" + practicesHours +
                ", laboratoryWorkHours=" + laboratoryWorkHours +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }

    public void add(Subjects subjects) {
    }
}
