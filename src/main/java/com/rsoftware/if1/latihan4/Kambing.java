/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rsoftware.if1.latihan4;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk menampilkan value ke layar
 *                     dengan variabel lokal
 * 
 */

public class Kambing {
    
    public void tambahKambing() {
        // Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        Kambing kambingJantan = new Kambing();
        kambingJantan.tambahKambing();
    }
}