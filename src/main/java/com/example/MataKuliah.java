package com.example;

public class MataKuliah {
    private String kode;
    private String namaMatkul;
    private int sks;
    
    // Constructor
    public MataKuliah(String kode, String namaMatkul, int sks) {
        this.kode = kode;
        this.namaMatkul = namaMatkul;
        this.sks = sks;
    }
    
    // Getters kode, namaMatkul, sks
    public String getKode() {
        return kode;
    }
    
    public String getNamaMatkul() {
        return namaMatkul;
    }
    
    public int getSks() {
        return sks;
    }
    
    // Setters kode, namaMatkul, sks
    public void setTIF(String kodeBaru, String namaMatkulBaru, int sksBaru) {
        this.kode = kodeBaru;
        this.namaMatkul = namaMatkulBaru;
        this.sks = sksBaru;
    }

    public void ShowMatkuliah() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama Mata Kuliah: " + namaMatkul);
        System.out.println("SKS: " + sks);
    }
}