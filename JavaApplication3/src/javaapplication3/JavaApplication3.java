/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Erdem Özer
 */

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
           
    
    
    public static void main(String[] args) 
    {
        // TODO code application logic here
        ArrayList <Integer> list1 = new ArrayList<>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);    
        list1.add(4);
        list1.add(6);
        list1.add(8);
        list2.add(2);
        list2.add(7);
        list2.add(8);
        for (int i = 0; i < 5; i++) 
        {
            for (int j = 0; j < 3; j++) {
                if (list1.get(i)==list2.get(j)) {
                    list3.add(list1.get(i));
                    
                    
                }
            }
        }
        System.out.println("Kesişen elemanlar:\n");
        System.out.println(list3);
        //soru2
        Scanner input = new Scanner(System.in);
        System.out.println("Sayi gir");
        int oguz = input.nextInt();
        int k=0;
        
        int[] dizi = new int[100];
        while(oguz!=0)
        {
            dizi[k]  = oguz%2;
            oguz = oguz /2;
            k++;
        }
        for (int i = k-1 ; i>-1; i--) {
            System.out.print(dizi[i]);
        }
        
        
    }
    
    
    
    
}
