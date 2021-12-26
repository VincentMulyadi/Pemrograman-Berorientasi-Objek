/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apppendataankaryawan;

import apppendataankaryawan.JenisKaryawan;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class AppPendataanKaryawan {
    static ArrayList<JenisKaryawan> dataKaryawan = new ArrayList<JenisKaryawan>();
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        Menu.Menu();
    }
}
