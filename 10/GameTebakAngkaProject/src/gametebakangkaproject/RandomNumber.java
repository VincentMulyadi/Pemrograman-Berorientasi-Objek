/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gametebakangkaproject;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class RandomNumber {
    int tebakan;
    char loop;
    
    Scanner input = new Scanner(System.in);
        void Menebak(){
            do{
                Random ran = new Random();
                int x = ran.nextInt(6) + 5;
                    do{
                        System.out.print("Masukkan Tebakan Anda: ");
                        tebakan = input.nextInt();
                        input.nextLine();
                        if(tebakan > x){
                            System.out.println("Hehehe… Bilangan tebakan anda terlalu besar");
                        } else if(tebakan < x){
                            System.out.println("Hehehe… Bilangan tebakan anda terlalu kecil");
                        } else{
                            System.out.println("Yeeee… Bilangan tebakan anda BENAR :-)");
                            loop = 'n';
                        }
                    }while (tebakan != x);
            }while (loop != 'n'); 
    }   
}
