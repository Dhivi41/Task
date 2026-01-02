package com.task;

public class AllVariables {
    static int staticVar = 30;  
    int instanceVar = 40;     

    public void display() {
        int localVar = 10;     
        System.out.println("Local Variable = " + localVar);
        System.out.println("Instance Variable = " + instanceVar);
        System.out.println("Static Variable = " + staticVar);
    }

    public static void main(String[] args) {
        AllVariables obj = new AllVariables();
        obj.display();
    }
}
