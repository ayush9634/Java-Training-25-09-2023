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
public class CollWithGen {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<>();
        ai.add(10);
        ai.add(20);
        ai.add(456);
        ai.add(7);
        ai.add(12);
        System.out.println("Elements: "+ai);
        System.out.println();
        System.out.println("Iterator ");
        Iterator it = ai.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next()+" ");
            
        }
                   
    }

}
