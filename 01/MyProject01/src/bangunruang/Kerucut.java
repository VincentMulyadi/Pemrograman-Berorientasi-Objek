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
public class Kerucut {
    public int radius;
    public int tinggi;
    public int sisiMiring;
    
    public void hitungVol(){
        double hasil = 3.14 * radius * radius * tinggi / 3;
        System.out.println("Volume kerucut: ");
    }
    
    public void hitungLuasSelimut(){
        double hasil = 3.14 * radius * sisiMiring;
        System.out.println("Luas selimut kerucut: " + hasil);
    }
}
