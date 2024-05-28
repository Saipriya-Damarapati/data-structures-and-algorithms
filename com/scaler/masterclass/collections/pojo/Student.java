package com.scaler.masterclass.pojo;

// Comparable helps to get natural ordering
// there can be only one natural ordering
public class Student implements Comparable<Student> {

    public int age;
    public String name;
    public double percentage;

    public Student(int age, String name, double percentage) {
        this.age = age;
        this.name = name;
        this.percentage = percentage;
    }

    // provide the default ordering to the class
    // set the natural ordering here
    /*@Override
    public int compareTo(Student other) {
        // this object vs other object
        // this object first, then return -1
        // other object first, then 1

        // to put descending order of age as natural ordering
        if(this.age < other.age) {
            return 1;
        } else if(this.age > other.age) {
            return -1;
        }
        return 0;
    }*/

    @Override
    public int compareTo(Student other) {
        // this object vs other object
        // this object first, then return -1
        // other object first, then 1

        // to put descending order of percentage as natural ordering
        // if percentage is equal, younger one should be first
        if(this.percentage > other.percentage) {
            return -1;
        } else if(this.percentage < other.percentage) {
            return 1;
        }
        else {
            if(this.age > other.age) {
                return 1;
            } else if (this.age < other.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
