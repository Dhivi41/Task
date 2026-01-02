package com.task;

public class StaticInstanceDifference {
    static int staticVar = 50;   
    int instanceVar = 20;      
    public static void main(String[] args) {
        StaticInstanceDifference obj1 = new StaticInstanceDifference();
        StaticInstanceDifference obj2 = new StaticInstanceDifference();
        obj1.instanceVar = 100;
        obj2.instanceVar = 200;
        System.out.println("obj1 instanceVar = " + obj1.instanceVar);
        System.out.println("obj2 instanceVar = " + obj2.instanceVar);
        System.out.println("Static variable = " + staticVar);
    }
}