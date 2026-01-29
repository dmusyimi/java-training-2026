package io.github.talentdevelopment004.interfaces;

public interface StudentService {
    void addStudent(Student student);
    void removeStudent(Student student);
    void updateStudent(Student student);
    Student getStudent(int id);
}
