package com.example;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.Date;

public class MainMahasiswaFX extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Input Data Mahasiswa");

        // Label untuk hasil
        Label resultLabel = new Label("Hasil akan ditampilkan di sini");

        // Form inputs
        TextField namaField = new TextField();
        namaField.setPromptText("Masukkan nama");

        TextField nimField = new TextField();
        nimField.setPromptText("Masukkan NIM");

        TextField jurusanField = new TextField();
        jurusanField.setPromptText("Masukkan jurusan");

        TextField umurField = new TextField();
        umurField.setPromptText("Masukkan umur");

        Button simpanButton = new Button("Simpan");
        simpanButton.setOnAction(e -> {
            try {
                String nama = namaField.getText();
                String nim = nimField.getText();
                String jurusan = jurusanField.getText();
                int umur = Integer.parseInt(umurField.getText());

                // Buat objek Mahasiswa dengan nilai default untuk tglLahir dan skills
                Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, umur, null, new String[]{});

                // Tampilkan hasil menggunakan getter
                String result = "Nama: " + mhs.getNama() + "\n" +
                                "NIM: " + mhs.getNim() + "\n" +
                                "Jurusan: " + mhs.getJurusan() + "\n" +
                                "Umur: " + mhs.getUmur() + "\n" +
                                "Tanggal Lahir: " + (mhs.getTglLahir() != null ? mhs.getTglLahir().toString() : "Tidak ada") + "\n" +
                                "Skills: " + (mhs.getSkills() != null ? java.util.Arrays.toString(mhs.getSkills()) : "Tidak ada");
                resultLabel.setText(result);

            } catch (NumberFormatException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Input Tidak Valid");
                alert.setContentText("Umur harus berupa angka.");
                alert.showAndWait();
            } catch (IllegalArgumentException ex) {
                // Tampilkan alert untuk validasi error
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error");
                alert.setHeaderText("Input Tidak Valid");
                alert.setContentText(ex.getMessage());
                alert.showAndWait();
            }
        });

        // Layout
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10));
        grid.setHgap(10);
        grid.setVgap(10);

        grid.add(new Label("Nama:"), 0, 0);
        grid.add(namaField, 1, 0);
        grid.add(new Label("NIM:"), 0, 1);
        grid.add(nimField, 1, 1);
        grid.add(new Label("Jurusan:"), 0, 2);
        grid.add(jurusanField, 1, 2);
        grid.add(new Label("Umur:"), 0, 3);
        grid.add(umurField, 1, 3);
        grid.add(simpanButton, 1, 4);

        VBox vbox = new VBox(10, grid, resultLabel);
        vbox.setPadding(new Insets(10));

        Scene scene = new Scene(vbox, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
