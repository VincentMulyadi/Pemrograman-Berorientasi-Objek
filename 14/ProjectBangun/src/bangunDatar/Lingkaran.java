/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author Administrator
 */
public class Lingkaran extends BangunDatar {
    
    public double jari;
    
    public double hitungLuas() {
        double luas = 3.14 * this.jari * this.jari;
        return luas;
    }
    
    public double hitungKeliling() {
        double keliling = 2 * 3.14 * this.jari;
        return keliling;
    }
}
