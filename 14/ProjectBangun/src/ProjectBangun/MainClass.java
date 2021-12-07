package ProjectBangun;


import bangunDatar.BangunDatar;
import bangunDatar.Lingkaran;
import bangunDatar.Persegi;
import bangunDatar.PersegiPanjang;
import bangunRuang.Balok;
import bangunRuang.Bola;
import bangunRuang.Tabung;

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

    public static void main(String[] args) {
        
        Persegi p = new Persegi();
        System.out.println("Hitung Persegi");
        p.sisi = 10;
        p.tampilHasil();
        System.out.println(" ");
        
        Lingkaran li = new Lingkaran();
        System.out.println("Hitung Lingkaran");
        li.jari = 7;
        li.tampilHasil();
        System.out.println(" ");
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("Hitung Persegi Panjang");
        pp.lebar = 10;
        pp.panjang = 8;
        pp.tampilHasil();
        System.out.println(" ");
        
        Tabung t = new Tabung();
        System.out.println("Hitung Tabung");
        t.jari = 7;
        t.tinggi = 10;
        t.tampilHasil();
        System.out.println(" ");
        
        Balok b = new Balok();
        System.out.println("Hitung Balok");
        b.lebar = 5;
        b.panjang = 10;
        b.tinggi = 6;
        b.tampilHasil();
        System.out.println(" ");
        
        Bola bo = new Bola();
        System.out.println("Hitung Bola");
        bo.jari = 7;
        bo.tampilHasil();
        System.out.println(" ");
    }

}
