package com.bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BMIController {

    @FXML
    private TextField txtNama;

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Label lblHasil;

    @FXML
    private Label lblKategori;

    @FXML
    private void hitungBMI() {
        String nama = txtNama.getText().trim();
        String inputBerat = txtBerat.getText().trim().replace(',', '.');
        String inputTinggi = txtTinggi.getText().trim().replace(',', '.');

        if (nama.isEmpty() || inputBerat.isEmpty() || inputTinggi.isEmpty()) {
            tampilkanPesan("Semua kolom harus diisi.");
            return;
        }

        try {
            double berat = Double.parseDouble(inputBerat);
            double tinggiCm = Double.parseDouble(inputTinggi);

            if (berat <= 0 || tinggiCm <= 0) {
                tampilkanPesan("Berat dan tinggi harus lebih dari 0.");
                return;
            }

            double tinggiMeter = tinggiCm / 100.0;
            double bmi = berat / (tinggiMeter * tinggiMeter);

            String kategori;
            if (bmi < 18.5) {
                kategori = "Berat badan kurang";
            } else if (bmi < 25.0) {
                kategori = "Berat badan normal";
            } else if (bmi < 30.0) {
                kategori = "Kelebihan berat badan";
            } else {
                kategori = "Obesitas";
            }

            lblHasil.setText(String.format("BMI: %.2f", bmi));
            lblKategori.setText(nama + " - " + kategori);

        } catch (NumberFormatException e) {
            tampilkanPesan("Berat dan tinggi harus berupa angka.");
        }
    }

    @FXML
    private void reset() {
        txtNama.clear();
        txtBerat.clear();
        txtTinggi.clear();
        lblHasil.setText("BMI: -");
        lblKategori.setText("Kategori: -");
    }

    private void tampilkanPesan(String pesan) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Peringatan");
        alert.setHeaderText(null);
        alert.setContentText(pesan);
        alert.showAndWait();
    }
}
