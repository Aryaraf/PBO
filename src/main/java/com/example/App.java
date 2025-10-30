package com.example;

import java.util.Arrays;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Date tgl = new Date();
            String[] skills = {"Java", "Python"};
            Mahasiswa mhs = new Mahasiswa("Arya", "123456", "Teknik Informatika", 20, tgl, skills);
            mhs.tampilkanInfo();

            String[] externalSkills = mhs.getSkills();
            externalSkills[0] = "Hacked";
            System.out.println("Skills setelah perubahan luar: " + Arrays.toString(mhs.getSkills()));
        } catch (IllegalArgumentException e) {
            System.out.println("Error:" + e.getMessage());
        }

        // MataKuliah matkul = new MataKuliah("TIF", "Pemrograman Berorientasi Objek", 3);
        
        // // Menampilkan informasi mata kuliah
        // matkul.ShowMatkuliah();
        
        // // Mengubah informasi mata kuliah
        // matkul.setTIF("TIF101", "Pemrograman Berorientasi Objek Lanjut", 4);
        
        // // Menampilkan informasi mata kuliah setelah perubahan
        // matkul.ShowMatkuliah();

        // Mahasiswa mhs = new Mahasiswa("Reyhan", "123456789", "Teknik Informatika");
        // Mahasiswa mhs2 = new Mahasiswa("Arya", "1234", "Teknik Informatika");
        // Mahasiswa mhs3 = new Mahasiswa("Budi", "12345", "Teknik Informatika");
        // mhs.displayInfo();
        // mhs2.displayInfo();
        // mhs3.displayInfo();


        // Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Kampus");

        // Buku buku1 = new Buku("123", "PBO", "John Doe");
        // Buku buku2 = new Buku("456", "Struktur Data", "Asep");
        // Buku buku3 = new Buku("789", "Basis Data", "Komar");
        
        // perpustakaan.tambahBuku(buku1);
        // perpustakaan.tambahBuku(buku2);
        // perpustakaan.tambahBuku(buku3);

        // perpustakaan.tampilkanKoleksiBuku();

        // System.out.println("------------------------------");
        // System.out.println("Proses Peminjaman Buku");
        // System.out.println("------------------------------");

        // perpustakaan.pinjamBuku("A001", "123");
        // perpustakaan.pinjamBuku("A002", "123");
        // perpustakaan.pinjamBuku("A001", "999");
        // perpustakaan.pinjamBuku("A002", "456");

        // perpustakaan.tampilkanKoleksiBuku();

        // perpustakaan.tampilkanLogPeminjaman();

    }
}
