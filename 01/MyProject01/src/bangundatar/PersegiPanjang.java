/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangundatar;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang {
    public int panjang;
    public int lebar;
    
    public void hitungLuas(){
        int hasil = panjang * lebar;
        System.out.println("Luas Persegi Panjang: " + hasil);
    }
    
    public void hitungKeliling(){
        int hasil = panjang*2 + lebar*2;
        System.out.println("Keliling Persegi Panjang: " + hasil);
    }
}
