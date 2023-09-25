/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor;

/**
 *
 * @author E-LAB-PC28
 */
public class NoParameter {
    String name;
    int r_no;
    int age;
    NoParameter()
    {
        name = "Aman";
        r_no = 69;
        age = 96;
    }
    public static void main(String[] args){
        NoParameter obj = new NoParameter();
        System.out.println("Name is: "+obj.name+" Roll no is: "+obj.r_no+"Age is: "+obj.age);
    }
    
}
