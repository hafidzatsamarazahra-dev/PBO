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

## Pertanyaan – Percobaan 3 dan 4
1. Apa yang dimaksud getter dan setter?
2. Apa kegunaan dari method getSimpanan()?
3. Method apa yang digunakan untuk menambah saldo?
4. Apa yang dimaksud konstruktor?
5. Sebutkan aturan dalam membuat konstruktor?
6. Apakah boleh konstruktor bertipe private?
7. Kapan menggunakan konstruktor dengan passing parameter?
8. Apa perbedaan inisialisasi atribut dan instansiasi atribut?
9. Apa perbedaan inisialisasi method dan instansiasi method? 

### jawaban
1. - Getter: Method untuk mengambil atau membaca nilai dari suatu atribut private.

   - Setter: Method untuk mengisi atau mengubah nilai dari suatu atribut private.  
2.   Kegunaan getSimpanan(): Untuk mengembalikan/menampilkan nilai saldo simpanan anggota saat ini.
3. Method Penambah Saldo: Method setor(float uang) atau setor(double uang).
4. Method khusus yang dipanggil otomatis saat objek pertama kali dibuat (instansiasi) untuk memberikan nilai awal (inisialisasi) pada atribut.
5. - Nama konstruktor harus sama persis dengan nama class.

    - Tidak memiliki return type (bahkan tidak menggunakan void).

    - Tidak boleh dipanggil secara langsung seperti method biasa, melainkan dipanggil menggunakan kata kunci new.
6. Boleh. Biasanya digunakan pada pola Singleton Pattern atau Factory Pattern agar objek tidak bisa dibuat secara bebas dari luar class tersebut.
7. Digunakan saat kita ingin langsung memberikan nilai awal (initial state) pada atribut objek secara dinamis sewaktu objek dibuat, tanpa harus memanggil method setter satu per satu.
8. - Inisialisasi Atribut: Proses memberikan nilai awal ke dalam variabel/atribut (contoh: this.simpanan = 0;).

   - Instansiasi Atribut: Proses membuat objek baru untuk atribut yang bertipe reference/class menggunakan kata kunci new (contoh: this.alamat = new Alamat();)
9. - Inisialisasi Method: Merujuk pada pendefinisian/pembuatan struktur dan isi kode dari suatu method di dalam class.

    - Instansiasi Method: Merujuk pada pemanggilan/penggunaan method tersebut melalui objek yang telah dibuat (karena yang di-instansiasi sebenarnya adalah objeknya, bukan method-nya).