package io.github.talentdevelopment004.interfaces;

public class StudentServiceImpl implements StudentService {
    @Override
    public void addStudent(Student student) {
        System.out.println("Adding student");
    }

    @Override
    public void removeStudent(Student student) {
        System.out.println("Removing student");

    }

    @Override
    public void updateStudent(Student student) {
        System.out.println("Updating student");

    }

    @Override
    public Student getStudent(int id) {
        return new Student("John");
    }
}
