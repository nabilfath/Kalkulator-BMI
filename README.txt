KALKULATOR BMI - PROJECT JAVA FX NETBEANS

Isi project:
- pom.xml                  : konfigurasi Maven dan JavaFX
- App.java                 : menjalankan aplikasi
- BMIController.java       : proses hitung BMI, reset, dan validasi
- BMI.fxml                 : tampilan awal yang bisa diedit di Scene Builder

PERSIAPAN:
1. Pastikan JDK 21 sudah terpasang.
2. Pastikan NetBeans mendukung project Maven.
3. Ekstrak folder KalkulatorBMI dari ZIP.
4. Di NetBeans pilih File > Open Project, lalu pilih folder KalkulatorBMI.
5. Tunggu Maven mengunduh library JavaFX.

MEMBUKA DESAIN DI SCENE BUILDER:
1. Buka file:
   src/main/resources/com/bmi/BMI.fxml
2. Klik kanan file BMI.fxml di NetBeans, lalu pilih Open atau Open With Scene Builder
   (nama menu bergantung pada konfigurasi NetBeans).
3. Jika Scene Builder tidak terhubung, buka aplikasi Scene Builder secara langsung,
   lalu pilih File > Open dan pilih BMI.fxml.
4. Desain tampilan boleh diubah, tetapi pertahankan fx:id dan On Action berikut:
   txtNama, txtBerat, txtTinggi, lblHasil, lblKategori
   tombol Hitung: #hitungBMI
   tombol Reset: #reset
   Controller Class: com.bmi.BMIController
5. Simpan perubahan dengan Ctrl+S.

MENJALANKAN:
- Dari terminal pada folder project:
  mvn clean javafx:run
- Atau gunakan Run Project di NetBeans jika konfigurasi Maven JavaFX sudah terbaca.

CATATAN:
- Input tinggi menggunakan cm.
- Input berat menggunakan kg.
- Kategori BMI pada contoh ini menggunakan klasifikasi BMI dewasa umum.
- Jangan menghapus nama fx:id atau mengganti nama method On Action tanpa menyesuaikan
  BMIController.java.
