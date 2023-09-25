/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colllection;

/**
 *
 * @author E-LAB-PC28
 */
//Write a java code to print elemnts from array list without using generics and print it in reverse order.
import java.util.*;
public class Prac {
    public static void main(String[] args) {
       ArrayList al = new ArrayList();
       
       al.add(12);
       al.add("Hello");
       al.add(12.5f);
       al.add(132.1736892);
       al.add('$');
       System.out.println("Elements: "+al );
       
       ListIterator lit = al.listIterator(al.size());
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous()+" ");
        }
    }
}
