/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117070.latihan41.massajenis;

import java.util.Scanner;

/**
 *
 * @author Aditya
 * NAMA                 : Aditya Nur Iskandar
 * KELAS                : PBO2/IF2
 * NIM                  : 10117070
 * Deskripsi Program    : Program ini berisi program untuk menghitung 
 * massa jenis dan volume
 */
public class PBO210117070Latihan41MassaJenis {

    /**
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        Kubus kubus1 = new Kubus();
        Scanner scn = new Scanner (System.in);
        
        System.out.println("======Massa Jenis Kubus======");
        System.out.print("Sisi\t: ");
        int kbs = scn.nextInt();
        System.out.print("Massa\t: ");
        int ms = scn.nextInt();
        
        System.out.println("======Hasil Perhitungan======");
        System.out.println("Volume\t: "+kubus1.hasilVolume(kbs));
        System.out.println("Massa Jenis\t: "+kubus1.hitungMassa(ms,kbs));
        
        
    }
    
}
