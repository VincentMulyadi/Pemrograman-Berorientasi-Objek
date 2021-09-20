/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunruang;

/**
 *
 * @author LENOVO
 */
public class Bola {
    public int radius;
    
    public void hitungVol(){
        double hasil = 4 * 3.14 * radius * radius * radius / 3;
        System.out.println("Volume bola: ");
    }
    
    public void hitungLuasSelimut(){
        double hasil = 4 * 3.14 * radius * radius;
        System.out.println("Luas selimut bola: " + hasil);
    }
}
