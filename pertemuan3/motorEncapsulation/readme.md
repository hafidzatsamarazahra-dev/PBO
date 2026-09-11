# Pengantar Konsep Pemrograman Berorientasi Objek

<h4>Nama : Hafidza Tsamara Z.<br>
NIM : 254107020034<br>
Kelas : TI-2G<br>
Repository [link] : https://github.com/hafidzatsamarazahra-dev/PBO.git <h4>

## pertanyaan
1. Pada class TestMobil, saat kita menambah kecepatan untuk pertama kalinya, mengapa muncul peringatan “Kecepatan tidak bisa bertambah karena Mesin Off!”? 
2. Mengapa atribut kecepatan dan kontakOn diset private? 
3. Ubah class Motor sehingga kecepatan maksimalnya adalah 100!

### jawaban
1. Pesan tersebut muncul karena pemanggilan motor.tambahKecepatan() pertama kali dilakukan sebelum metode nyalakanMesin() dipanggil. Saat itu nilai variabel kontakOn masih false, sehingga kondisi if (kontakOn == true) tidak terpenuhi dan blok else yang mencetak peringatan dieksekusi.
2. Atribut di-set private untuk menerapkan prinsip enkapsulasi. Tujuannya agar data internal tidak bisa diubah secara langsung dari luar kelas tanpa melalui metode pengontrol (public method), sehingga integritas dan validasi data tetap terjaga.
3. public void tambahKecepatan(){
        if (kontakOn == true){
            if (kecepatan + 5 <= 100) {
                kecepatan += 5;
            } else {
                kecepatan = 100;
                System.out.println("Kecepatan maksimal 100 telah tercapai! \n");
            }
        } else{
            System.out.println("Kecepatan tidak bisa bertambah karena mesin off! \n");
        }
    }
