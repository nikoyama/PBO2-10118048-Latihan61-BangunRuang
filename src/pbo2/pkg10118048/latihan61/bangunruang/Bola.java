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
 * Deskripsi program : sub class dari interface bangunruang
 */
public class Bola implements BangunRuang{
    
    private double  r; // jari"

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double hitungVolume() {
        return ((4*Math.PI*r*r*r)/3);
    }
      
}
