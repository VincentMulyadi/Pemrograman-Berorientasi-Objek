/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package degdegan.app;

/**
 *
 * @author LENOVO
 */
public class Pengantaran {
    int jarak;
    int jumlahAntar;
    int hargaJarak;
    int harga;
    
    Pengantaran(int x, double y){
        this.jarak = x;
        this.jumlahAntar = (int) y;
    }
    
    int hargaAntar(){
        this.hargaJarak = this.jarak * 140000;
        this.harga = this.jumlahAntar * this.hargaJarak;
        return this.harga;
    }
}
