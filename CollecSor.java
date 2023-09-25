/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.colllection;

/**
 *
 * @author E-LAB-PC28
 */
import java.util.*;
public class CollecSor {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        li.add(24);
        li.add(23);
        li.add(12);
        li.add(29);
        li.add(45);
        System.out.println("List "+li);
        Collections.sort(li);//Sorting the list
        System.out.println("Sorted "+li);
        System.out.println("Sort in Reverse");
        Collections.sort(li,Collections.reverseOrder());//Sorting the list in reverse order.
        System.out.println(li);
        System.out.println("Exist : "+li.contains(45));//Return boolean value true if contains the value else false
        System.out.println("Check : "+li.contains(79874));
        li.clear();
        //Checking if list is empty list or not.
        if(li.isEmpty())
        {
            System.out.println("It is Empty");
        }
        else
        {
            System.out.println("It is not empty");
        }
    }
}
