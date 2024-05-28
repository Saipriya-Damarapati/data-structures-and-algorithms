package com.scaler.masterclass.collections.pojo;

import java.util.Comparator;

public class StudentPercentageComparator implements Comparator<Student> {

    // ascending order of percentage
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.percentage < o2.percentage) {
            // o1 to be first - return -1
            return -1;
        } else {
            // o2 to be first - return 1
            return 1;
        }
    }
}
