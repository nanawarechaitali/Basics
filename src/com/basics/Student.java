package com.basics;

import java.util.Scanner;

public class Student {
    private String firstName;
    private  String lastName;
    private int student_id;
    private String course;
    private String tutionBalance;


    public Student(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter firstname");
        this.firstName =sc.nextLine();

        System.out.println("Enter lastname");
        this.lastName = sc.nextLine();
        System.out.println("Enter student_id");
        this.student_id = sc.nextInt();
        System.out.println(firstName +" "+lastName + " "+ student_id);



    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }
}



