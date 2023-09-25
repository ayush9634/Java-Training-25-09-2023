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
public class ExIter {
    public static void main(String[] args) {
        List<String> ls = new ArrayList<>();
        ls.add("B14");
        ls.add("Python");
        ls.add("Java");
        ls.add("C++");
        ls.add("DSA");
        ls.add("DS");
        System.out.println(ls);
        
        //Removing element from array list
        String str = "";
        Iterator it = ls.iterator();
        while(it.hasNext())
        {
            str = (String) it.next();
            if(str.equals("Python"))
                it.remove();
        }
        System.out.println(ls);
        Collections.addAll(ls,"Algo","Ruby","RDBMS","JS","CSS","HTML","React");//Adding more than one element in arraylist.
        System.out.println("Upadated "+ls);
        System.out.println("Index of "+ls.get(2));//Accessing the value at particular index. 
        ls.set(1,"Ayush");//Setting the value at particular index.
        System.out.println(ls);
        ls.remove("Ayush");//Removing the element
        System.out.println(ls);
        ls.clear();//Remove all the elements from array.
        System.out.println(ls);
    }
}
