package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MataKuliah matkul = new MataKuliah("TIF", "Pemrograman Berorientasi Objek", 3);
        
        // Menampilkan informasi mata kuliah
        matkul.ShowMatkuliah();
        
        // Mengubah informasi mata kuliah
        matkul.setTIF("TIF101", "Pemrograman Berorientasi Objek Lanjut", 4);
        
        // Menampilkan informasi mata kuliah setelah perubahan
        matkul.ShowMatkuliah();

        Mahasiswa mhs = new Mahasiswa("Reyhan", "123456789", "Teknik Informatika");
        Mahasiswa mhs2 = new Mahasiswa("Arya", "1234", "Teknik Informatika");
        Mahasiswa mhs3 = new Mahasiswa("Budi", "12345", "Teknik Informatika");
        mhs.displayInfo();
        mhs2.displayInfo();
        mhs3.displayInfo();
    }
}
