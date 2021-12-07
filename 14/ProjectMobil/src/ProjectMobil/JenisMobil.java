/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectMobil;


/**
 *
 * @author Administrator
 */
public abstract class JenisMobil {
    
    public abstract float hitungWaktu();
    public abstract float hitungBensin();
    
    public void tampilHasil() {
        System.out.println("Waktu Perjalanan        : " + this.hitungWaktu() + " jam");
        System.out.println("Bahan Bakar Minimal     : " + this.hitungBensin() + " liter");
    }
}