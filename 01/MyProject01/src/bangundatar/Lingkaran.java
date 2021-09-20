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
public class Lingkaran {
    public int radius;
    
    public void hitungLuas(){
        double hasil = 3.14 * radius * radius;
        System.out.println("Luas Lingakran: " + hasil);
    }
    
    public void hitungKeliling(){
        double hasil = 2 * 3.14 * radius;
        System.out.println("Keliling Lingkaran: " + hasil);
    }
}
