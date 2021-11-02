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
public class Harga {
    int jumlah;
    int antar;
    int modal;
    int modalTotal;
    int hargaSatuan;
    
    int hitungJumlah(int a, int b){
        this.jumlah = a + b; 
        return(this.jumlah);
    }
    
    int hitungJumlah(int a, int b, int c){
        this.jumlah = a + b + c; 
        return(this.jumlah);
    }
    
    int hitungJumlah(int a, int b, int c, int d){
        this.jumlah = a + b + c + d; 
        return(this.jumlah);
    }
    
    int hargaAntar(int a, int b){
        this.antar = a + b;
        return(this.antar);
    }
    
    int hargaAntar(int a, int b,int c){
        this.antar = a + b + c;
        return(this.antar);
    }
    
    int hargaAntar(int a, int b,int c,int d){
        this.antar = a + b + c + d;
        return(this.antar);
    }
    
    int hargaModal(int a, int b){
        this.modal = a + b;
        return this.modal;
    }
    
    int hargaModal(int a, int b,int c){
        this.modal = a + b + c;
        return this.modal;
    }
    
    int hargaModal(int a, int b,int c, int d){
        this.modal = a + b + c + d;
        return this.modal;
    }
    
    int totalModal(){
        this.modalTotal = this.antar + this.modal;
        return this.modalTotal;
    }
    
    int hargaSatuan(){
        this.hargaSatuan = (this.modalTotal + 15000000)/this.jumlah;
        return this.hargaSatuan;
    }
}
