/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10118048.latihan61.bangunruang;

/**
 *
 * @author NIX
 * NAMA : Niko Yama
 * KELAS : PBO2
 * NIM : 10118048
 * Deskripsi program : menghitung luas volume bangun ruang dengan 
 * konsep interface
 */
public class PBO210118048Latihan61BangunRuang {

    public static void main(String[] args) {
        Bola bola = new Bola();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();
        
        bola.setR(7);
        System.out.println("Jari-jari Bola = " + bola.getR());
        System.out.printf("Volume Bola = %.2f %n%n" , bola.hitungVolume());
        
        tabung.setR(10);
        tabung.setT(21);
        System.out.println("Jari-jari Tabung = " + tabung.getR());
        System.out.println("Tinggi Tabung = " + tabung.getT());
        System.out.printf("Volume Tabung = %.2f %n%n" , tabung.hitungVolume());
        
        kerucut.setR(9);
        kerucut.setT(14);
        System.out.println("Jari-jari Kerucut = " + kerucut.getR());
        System.out.println("Tinggi Kerucut = " + kerucut.getT());
        System.out.printf("Volume Kerucut = %.2f %n" , kerucut.hitungVolume());
    }

}
