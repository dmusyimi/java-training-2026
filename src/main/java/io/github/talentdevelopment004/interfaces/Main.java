package io.github.talentdevelopment004.interfaces;

public class Main {
    private final StudentService studentService;

    public Main(StudentService studentService) {
        this.studentService = studentService;
    }

    public static void main(String[] args) {
        ThreePinPlug laptopCharger = new LaptopCharger();
        ThreePinPlug phoneCharger = new PhoneCharger();

        laptopCharger.accessPower();
        phoneCharger.accessPower();
        laptopCharger.checkStatus();
        phoneCharger.checkStatus();
        ThreePinPlug.printSpecifications();

        StudentService studentService = new StudentServiceImpl();
        studentService.addStudent(new Student("John"));
        studentService.removeStudent(new Student("John"));
        studentService.updateStudent(new Student("John"));
    }
}
