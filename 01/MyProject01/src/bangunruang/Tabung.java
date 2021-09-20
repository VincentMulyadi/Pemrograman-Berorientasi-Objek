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
public class Tabung {
    public int radius;
    public int tinggi;
    
    public void hitungVol(){
        double hasil = 3.14 * radius * radius * tinggi;
        System.out.println("Volume tabung: ");
    }
    
    public void hitungLuasSelimut(){
        double hasil = 2 * 3.14 * radius * tinggi + 2 * 3.14 * radius * radius;
        System.out.println("Luas selimut tabung: " + hasil);
    }
}
