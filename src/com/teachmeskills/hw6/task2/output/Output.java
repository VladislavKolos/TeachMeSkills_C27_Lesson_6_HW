package com.teachmeskills.hw6.task2.output;

import com.teachmeskills.hw6.task2.student.Student;

public class Output {
    public void outputArrayOfStudent(Student[] array) {
        System.out.println("Студенты нашей группы: ");
        System.out.println();
        for (Student student : array) {
            System.out.println(" Имя: " + student.firstName + "," + " Фамилия: " + student.lastName + "," + " Номер паспорта: " + student.passId + "," + " Название группы: " + student.groupName);
            System.out.println();
        }
    }
}
