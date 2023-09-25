/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructor;

/**
 *
 * @author E-LAB-PC28
 */
public class Constructor {
    String name;
    int r_no;
    int age;
    public static void main(String[] args) {
        Constructor obj = new Constructor();
        obj.name="Ayush";
        obj.r_no=55;
        obj.age=19;
        System.out.println("Name :"+obj.name+" Roll no : "+obj.r_no+" Age : "+obj.age);
    }
}
