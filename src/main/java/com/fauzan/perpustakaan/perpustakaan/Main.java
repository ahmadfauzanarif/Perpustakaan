/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fauzan.perpustakaan.perpustakaan;

/**
 *
 * @author D-15
 */
public class Main {
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new PerpustakaanDigital();
        perpustakaan.pinjamBuku("Atomic Habbits");
        perpustakaan.kembalikanBuku("Psichology of money");
        perpustakaan.lihatDaftarBuku();
    }
}
