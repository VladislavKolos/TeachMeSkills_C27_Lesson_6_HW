package com.teachmeskills.hw7.task2.basis;

import com.teachmeskills.hw7.task2.output.Output;
import com.teachmeskills.hw7.task2.student.Student;

public class Basis {
    public static void main(String[] args) {
        Student[] array = new Student[17];
        array[0] = new Student("Артём", "Астапчик", "AB0234589");
        array[1] = new Student("Алина", "Илькевич", "KH8790134");
        array[2] = new Student("Анастасия", "Иргалиева", "BM0228919");
        array[3] = new Student("Артем", "Каральчук", "HB2340901");
        array[4] = new Student("Никита", "Крайко", "AB5670102");
        array[5] = new Student("Олег", "Манеев", "BM0415679");
        array[6] = new Student("Иван", "Михновецкий", "BM4508712");
        array[7] = new Student("Кирилл", "Паляница", "KH2334798");
        array[8] = new Student("Руслан", "Рябухин", "PD0244479");
        array[9] = new Student("Евгений", "Саркисов", "HB0110454");
        array[10] = new Student("Павел", "Свинко", "KH0912233");
        array[11] = new Student("Руслан", "Семенчик", "AB1230908");
        array[12] = new Student("Руслан", "Третяк", "BM0910208");
        array[13] = new Student("Александр", "Хамицкий", "HB1033491");
        array[14] = new Student("Даниил", "Чаботько", "AB3500102");
        array[15] = new Student("Алексей", "Шубин", "PD0340507");
        array[16] = new Student("Владислав", "Колос", "PD0251438");
        Output output = new Output();
        output.outputArrayOfStudent(array);
    }
}
