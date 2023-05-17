package com.basics;
class MyEmployee{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
public class Employee {
    public static void main(String[] args) {
        MyEmployee chaita = new MyEmployee();
       // chaita.id = 45;
     //   chaita. name = "chaitali";
        chaita.setName("chaitali");
        chaita.setId(45);
        System.out.println(chaita.getName());
        System.out.println(chaita.getId());



    }
}
