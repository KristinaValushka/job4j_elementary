package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("German Jactin");
        student.setGroupNumber(3);
        student.setAdmissionDate(2013);

        System.out.println(student.getName() + " studied in a group number " +
                student.getGroupNumber() + " in " +
                student.getAdmissionDate());
    }
}