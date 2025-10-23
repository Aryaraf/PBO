package com.example;
import java.util.ArrayList;

public class Perpustakaan {
    private String nama;
    private ArrayList<Buku> koleksiBuku;
    private ArrayList<String> daftarPeminjaman;

    // Konstruktor: Inisialisasi nama dan daftar kosong
    public Perpustakaan(String nama) {
        this.nama = nama;
        this.koleksiBuku = new ArrayList<>();
        this.daftarPeminjaman = new ArrayList<>();
    }
    
    // Method tambahBuku: Menambahkan buku ke koleksi
    public void tambahBuku(Buku buku) {
        koleksiBuku.add(buku);
    }

    // Method cariBuku: Mencari buku berdasarkan ISBN, mengembalikan objek Buku atau null
    public Buku cariBuku(String isbn) {
        for (Buku buku : koleksiBuku) {
            if (buku.isbn.equals(isbn)) {
                return buku;
            }
        }
        return null;
    }

    // Method pinjamBuku: Logika peminjaman
    public void pinjamBuku(String idAnggota, String isbn) {
        Buku buku = cariBuku(isbn);
        if (buku == null) {
            System.out.println("Buku tidak ditemukan.\n");
        } else if (buku.statusDipinjam) {
            System.out.println("Buku sedang dipinjam.");
        } else {
            buku.statusDipinjam = true;
            daftarPeminjaman.add(idAnggota + " - " + buku.judul);
        }
    }

    // Method tampilkanKoleksiBuku: Menampilkan semua buku beserta statusnya
    public void tampilkanKoleksiBuku() {
        System.out.println("Koleksi Buku di " + nama + ":");
        for (Buku buku : koleksiBuku) {
            String status = buku.statusDipinjam ? "Dipinjam" : "Tersedia";
            System.out.println("ISBN: " + buku.isbn + ", Judul: " + buku.judul + ", Pengarang: " + buku.pengarang + ", Status: " + status);
        }
        System.out.println(); // Baris kosong untuk pemisah
    }

    // Method tampilkanLogPeminjaman: Menampilkan daftar log peminjaman
    public void tampilkanLogPeminjaman() {
        System.out.println("Log Peminjaman:");
        for (String log : daftarPeminjaman) {
            System.out.println(log);
        }
        System.out.println(); 
    }
}