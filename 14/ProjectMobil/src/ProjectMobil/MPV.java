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
public class MPV extends JenisMobil{
    
    private double jarak;
    private float kecepatan;
    
    public MPV (double j, float k) {
        this.jarak = j;
        this.kecepatan = k;
    }
    
    public float hitungBensin() {
        float bensin = (float) jarak / 14;
        return bensin;
    }
    
    public float hitungWaktu() {
        float waktu = (float) jarak / kecepatan;
        return waktu;
    }
}
