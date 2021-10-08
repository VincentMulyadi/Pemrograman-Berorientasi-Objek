/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author LENOVO
 */
public class MainClass {
    public static void main(String[] args) {
        Lingkaran li = new Lingkaran();
        
        int totalLuas = li.hitungLuas(28) - (li.hitungLuas(14)* 2);
        System.out.println(totalLuas+" centimeters square");
    }
}
