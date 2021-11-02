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
public class DegDeganApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Degan b = new Degan(5000);
        b.hitungBerat();
        Pengantaran b1 = new Pengantaran(15, b.jumlahAntar());
        
        Degan s = new Degan(7500);
        s.hitungBerat();
        Pengantaran s1 = new Pengantaran(35, s.jumlahAntar());
        
        Degan kl = new Degan(8300);
        kl.hitungBerat();
        Pengantaran kl1 = new Pengantaran(30, kl.jumlahAntar());
        
        Degan ku = new Degan(9100);
        ku.hitungBerat();
        Pengantaran ku1 = new Pengantaran(75, ku.jumlahAntar());
        
        Harga h = new Harga();
        h.hitungJumlah(b.buah, s.buah, kl.buah, ku.buah);
        h.hargaAntar(b1.hargaAntar(), s1.hargaAntar(), kl1.hargaAntar(), ku1.hargaAntar());
        h.hargaModal(b.hitungModal(), s.hitungModal(), kl.hitungModal(), ku.hitungModal());
        h.totalModal();
        System.out.println("Harga jual minimal degan per buah adalah Rp."+h.hargaSatuan());
    }
    
}
