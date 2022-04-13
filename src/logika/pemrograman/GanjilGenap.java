/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logika.pemrograman;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class GanjilGenap {
    public static void main(String[] args){
        int bilangan;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        bilangan = input.nextInt();
        
        if (bilangan % 2 == 0){
            System.out.println(Integer.toString(bilangan) + "adalah bilangan genap");
        } else {
            System.out.println(Integer.toString(bilangan) + "adalah bilangan ganjil");
        }
    }
    
}
