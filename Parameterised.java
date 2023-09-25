/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructor;

/**
 *
 * @author E-LAB-PC28
 */
//public class Parameterised {
//    String name;
//    int r;
//    int age;
//    Scanner s = new Scanner(System.in);
//    name=s.nextLine();
//    age= s.nextInt();
//    
//    
//}
import java.util.*;
class Inheritance{
    
    int a,b;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value a: ");
        a = sc.nextInt();
        System.out.println("Enter value b: ");
        b = sc.nextInt();
    }
    int add(){
        return (a+b);       
    }
}
class Ayush extends Inheritance
    {
        int c;
        void get()
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value c: ");
        c = sc.nextInt();
        }
        int sum(){
          return (a+b+c);
        }
    }
    public class Parameterised
    {
        public static void main(String[] args)
        {
            Ayush A = new Ayush();
            A.input();
            System.out.println("Sum of two numbers: "+(A.add()));
            A.get();
            System.out.println("Sum of three numbers: "+(A.sum()));
        }
    }

