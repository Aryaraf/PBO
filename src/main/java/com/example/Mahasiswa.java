package com.example;
import java.util.Date;
import java.util.Arrays;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private int umur;
    private Date tglLahir;
    private String[] skills;

    public Mahasiswa(String nama, String nim, String jurusan, int umur, Date tglLahir, String[] skills) {
        setNama(nama);
        setNim(nim);
        setJurusan(jurusan);
        setUmur(umur);
        setTglLahir(tglLahir);
        setSkills(skills);
    }

    // Getter dan Setter dengan validasi
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama tidak boleh kosong");
        }
        if (nama.matches("[a-zA-Z\\s]+")){
            throw new IllegalArgumentException("Nama hanya boleh mengandung huruf");
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
        if (jurusan.length() < 3) {
            throw new IllegalArgumentException("Jurusan minimal 3 karakter");
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

    // Getter dan Setter untuk tglLahir defensive copy
    public Date getTglLahir() {
        return tglLahir != null ? new Date(tglLahir.getTime()) : null;
    }
    
    public void setTglLahir(Date tglLahir) {
        this.tglLahir = tglLahir != null ? new Date(tglLahir.getTime()) : null;
    }

    // Getter dan Setter untuk skills defensive copy
    public String[] getSkills() {
        return skills != null ? Arrays.copyOf(skills, skills.length) : null;
    }

    public void setSkills(String[] skills) {
        this.skills = skills != null ? Arrays.copyOf(skills, skills.length) : null;
    }

    public void tampilkanInfo() {
        System.out.println("===== Data Mahasiswa =====");
        System.out.println("Nama: " + this.nama);
        System.out.println("NIM: " + this.nim);
        System.out.println("Jurusan: " + this.jurusan);
        System.out.println("Umur: " + this.umur + " tahun");
        System.out.println("Tanggal Lahir: " + (tglLahir != null ? tglLahir.toString() : "Tidak ada"));
        System.out.println("Skills: " + (skills != null ? Arrays.toString(skills) : "Tidak ada"));
    }
}
