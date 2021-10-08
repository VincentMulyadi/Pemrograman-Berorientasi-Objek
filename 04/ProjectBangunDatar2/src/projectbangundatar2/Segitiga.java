/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectbangundatar2;

/**
 *
 * @author LENOVO
 */
public class Segitiga {
    double hitungLuas(int a, int t){
        return 0.5 * a * t;
    }
    
    double hitungLuas(double a, double t){
        return 0.5 * a * t;
    }
    
    double hitungKeliling(int a, int t){
        double s = Math.sqrt(a*a + t*t);
        return a + t + s;
    }
    
    double hitungKeliling(double a, double t){
        double s = Math.sqrt(a*a + t*t);
        return a + t + s;
    }
}
