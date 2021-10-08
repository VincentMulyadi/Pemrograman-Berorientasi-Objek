/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author LENOVO
 */
public class ProjectBangunDatar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Persegi Panjang");
        System.out.println("Luas Persegi Panjang : "+ pp.hitungLuas(10, 5));
        System.out.println("Keliling Persegi Panjang :"+ pp.hitungKeliling(10, 5));
        System.out.println("Luas Persegi Panjang : "+ pp.hitungLuas(3.6, 8));
        System.out.println("Keliling Persegi Panjang :"+ pp.hitungKeliling(3.6, 8));
        System.out.println("Luas Persegi Panjang : "+ pp.hitungLuas(6, 8.3));
        System.out.println("Keliling Persegi Panjang :"+ pp.hitungKeliling(6, 8.3));
        System.out.println("Luas Persegi Panjang : "+ pp.hitungLuas(5.6, 8.8));
        System.out.println("Keliling Persegi Panjang :"+ pp.hitungKeliling(5.6, 8.8));
        
        Persegi p = new Persegi();
        System.out.println("Persegi");
        System.out.println("Luas Persegi : "+ p.hitungLuas(4.5));
        System.out.println("Keliling Persegi : "+ p.hitungKeliling(4.5));
        System.out.println("Luas Persegi : "+ p.hitungLuas(7));
        System.out.println("Keliling Persegi : "+ p.hitungKeliling(7));
        
        Lingkaran li = new Lingkaran();
        System.out.println("Lingakran");
        System.out.println("Luas Lingkaran : "+ li.hitungLuas(5));
        System.out.println("Keliling Lingkaran : "+ li.hitungKeliling(5));
        System.out.println("Luas Lingkaran : "+ li.hitungLuas(7.4));
        System.out.println("Keliling Lingkaran : "+ li.hitungKeliling(7.4));
        
        Segitiga s = new Segitiga();
        System.out.println("Segitiga");
        System.out.println("Luas Segitiga : "+ s.hitungLuas(8, 10));
        System.out.println("Keliling Segitiga : "+ s.hitungKeliling(8, 10));
        System.out.println("Luas Segitiga : "+ s.hitungLuas(8, 11.5));
        System.out.println("Keliling Segitiga : "+ s.hitungKeliling(8, 11.5));
        System.out.println("Luas Segitiga : "+ s.hitungLuas(12.2, 9));
        System.out.println("Keliling Segitiga : "+ s.hitungKeliling(12.2, 9));
        System.out.println("Luas Segitiga : "+ s.hitungLuas(13.9, 20.7));
        System.out.println("Keliling Segitiga : "+ s.hitungKeliling(13.9, 20.7));
    }
    
}
