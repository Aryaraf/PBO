package com.example;
import java.util.Date;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;

    public Mahasiswa(String nama, String nim, String jurusan, int umur) {
        setNama(nama);
        setNim(nim);
        setJurusan(jurusan);
        setUmur(umur);
    }

    // Getter dan Setter dengan validasi
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        if (jurusan == null || jurusan.trim().isEmpty()) {
            throw new IllegalArgumentException("Jurusan tidak boleh kosong");
        }
        this.jurusan = jurusan;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        if (umur <= 0) {
            throw new IllegalArgumentException("Umur harus lebih dari 0");
        }
        this.umur = umur;
    }

    public void tampilkanInfo() {
        System.out.println("===== Data Mahasiswa =====");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.println("Umur: " + this.umur + " tahun");
    }
}
