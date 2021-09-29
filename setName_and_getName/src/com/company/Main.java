package com.company;

public class Main {

    public static void main(String[] args) {
        Human human = new Human();
        human.setName("Илья");
        human.setAge(33)
        System.out.println("Мое имя: "+human.getName());
        System.out.println("Мой возраст: "+human.getAge());
        //human.displayName();
    }
}

class Human {
    private String name;
    private int age;


    public void setName(String userName) {
        name = userName;
    }
    public String getName() {
        return name;
    }


    public int setAge(int userAge) {
        age = userAge;
        return age;
    }
    public int getAge() {
        return age;
    }


    public void displayName() {
        System.out.println("Мое имя: "+name+". "+"Мой возраст: "+age+" года.");
    }
}
