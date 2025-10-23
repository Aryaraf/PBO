package com.example;

public class Buku {
    String isbn;
    String judul;
    String pengarang;
    boolean statusDipinjam;

    // Konstruktor untuk mengisi data buku
    public Buku(String isbn, String judul, String pengarang) {
        this.isbn = isbn;
        this.judul = judul;
        this.pengarang = pengarang;
        this.statusDipinjam = false; // Default false
    }
}
