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
public class Degan {
    int buah;
    double berat;
    int modal;
    double antar;
    
    Degan(int x){
        this.buah = x;
    }
    
    double hitungBerat(){
        this.berat = this.buah * 1.2;
        return this.berat;
    }
    
    int hitungModal(){
        this.modal = this.buah * 8000;
        return this.modal;
    }
    
    double jumlahAntar(){
        this.antar = Math.ceil(this.berat / 3000);
        return this.antar;
    }
}
