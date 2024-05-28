package com.scaler.masterclass.collections;

import com.scaler.masterclass.collections.pojo.Student;
import com.scaler.masterclass.collections.pojo.StudentPercentageAgeComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderingLearning {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student(25, "Mohit", 90.45));
        studentList.add(new Student(21, "Nishant", 100));
        studentList.add(new Student(32, "Anirudh", 24));
        studentList.add(new Student(20, "Vikram", 100));

        //Collections.sort(studentList); // uses comparable implementation by overriding compareTo() method

        // Use custom sorting based on percentage; have custom comparator
        //Collections.sort(studentList, new StudentPercentageComparator());
        Collections.sort(studentList, new StudentPercentageAgeComparator());

        for(Student student : studentList) {
            System.out.println(student.name);
        }
    }
}
