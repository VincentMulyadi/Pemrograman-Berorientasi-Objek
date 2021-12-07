package ProjectMobil;


import ProjectMobil.SUV;
import ProjectMobil.Sedan;
import ProjectMobil.MPV;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Administrator
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Sedan - Solo ke Kudus");
        Sedan s1 = new Sedan(157.6, 60);
        s1.tampilHasil();
        System.out.println(" ");
        
        System.out.println("Sedan - Solo ke Jakarta");
        Sedan s2 = new Sedan(518.39, 65);       
        s2.tampilHasil();
        System.out.println(" ");
        
        System.out.println("SUV - Solo ke Banten");
        SUV suv1 = new SUV(662.3, 57);
        suv1.tampilHasil();
        System.out.println(" ");
        
        System.out.println("Sedan - Solo ke Bandung");
        SUV suv2 = new SUV(533.7, 62);
        suv2.tampilHasil();
        System.out.println(" ");
        
        System.out.println("MPV - Solo ke Banyuwangi");
        MPV m1 = new MPV(540.8, 64);
        m1.tampilHasil();
        System.out.println(" ");
        
        System.out.println("MPV - Solo ke Jember");
        MPV m2 = new MPV(432.6, 53);
        m2.tampilHasil();
    }
    
}
