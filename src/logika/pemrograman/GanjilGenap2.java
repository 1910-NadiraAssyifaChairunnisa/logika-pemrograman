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
public class GanjilGenap2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int bil;
        System.out.println("program menentukan bilangan ganjil dan genap");
        System.out.println("masukan bilangan = ");
        bil = input.nextInt();
        
        if(bil % 2 == 0){
            System.out.println("bilangan "+bil+"adalah bilangan genap");
        }else{
            System.out.println("bilangan "+bil+"adalah bilangan ganjil");
        }
    }
    
}
