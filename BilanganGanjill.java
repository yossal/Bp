/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bilanganganjil;

import java.util.Scanner;

public class BilanganGanjil {
    public static void main(String[] args) {
        int a;
        Scanner keyboard = new Scanner (System.in);
        
        System.out.print("Masukkan Angka Maksimal : ");
        a=keyboard.nextInt();
        
        int i=1;
        while (i<a){
            System.out.print(i + " ");
            i +=2;
        }
    }
    
}
