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
public class Iter {

    public static void main(String[] args) {
       ArrayList al = new ArrayList();
       al.add(12);
       al.add("Hello");
       al.add(12.5f);
       al.add(132.1736892);
       al.add('$');
        System.out.println("Elements: "+al );
        System.out.println();
        System.out.println("Using Iterator");
        Iterator itr = al.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next()+" ");
        }
        System.out.println();
        System.out.println("Printing alternate elements: ");
        Iterator i = al.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next()+" ");
            if(i.hasNext())
                i.next();
        }
        System.out.println();
        System.out.println("Reverse order:");
        ListIterator lit = al.listIterator(al.size());
        while(lit.hasPrevious())
        {
            System.out.println(lit.previous()+" ");
        }
        
    }
}
