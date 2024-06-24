/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fauzan.perpustakaan.perpustakaan;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author D-15
 */
public class PerpustakaanDigital implements Perpustakaan {
    private HashMap<String, Boolean> daftarBuku;
    
    public PerpustakaanDigital() {
        this.daftarBuku = new HashMap<>();
        this.daftarBuku.put("Atomic Habbits", true);
        this.daftarBuku.put("Anies si Manies", true);
        this.daftarBuku.put("Psichology of money", true);
    }
    
    @Override
    public void pinjamBuku(String judulBuku) {
        if (this.daftarBuku.get(judulBuku)) {
            this.daftarBuku.put(judulBuku, false);
            System.out.println("Meminjam buku: " + judulBuku);
        } else {
            System.out.println("Buku " + judulBuku + "sedang dipinjam.");
        }
    }
    
    @Override
    public void kembalikanBuku(String judulBuku) {
        if(!this.daftarBuku.get(judulBuku)) {
            this.daftarBuku.put(judulBuku, true);
            System.out.println("Mengembalikan buku: " + judulBuku);
        } else {
            System.out.println("Buku " + judulBuku + " sudah dikembalikan");
        }
    }
    
    @Override 
    public void lihatDaftarBuku() {
        System.out.println("Daftar buku di perpustakaan digital: ");
        for (Map.Entry<String, Boolean> entry : this.daftarBuku.entrySet()) {
            String buku = entry.getKey();
            boolean tersedia = entry.getValue();
            System.out.println("- " + buku + " (Tersedia: " + tersedia + ")");
        }
    }
}
