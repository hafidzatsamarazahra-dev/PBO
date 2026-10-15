# Pengantar Konsep Pemrograman Berorientasi Objek

<h4>Nama : Hafidza Tsamara Z.<br>
NIM : 254107020034<br>
Kelas : TI-2G<br>
Repository [link] : https://github.com/hafidzatsamarazahra-dev/PBO.git <h4>

## Langkah 4 Percobaan 1 
1. tambahan di perkalian

    public long kali(int a, int b) { 
    return (long) a * b; 
    }

    pesan eror:

    method kali(int,int) is already defined in class id.ac.polinema.overloading.percobaan1.Perkalian
2. tambahan di perkalian

    public int kali(int x, int y) { 
    return x * y; 
    }

    pesan eror:

    method kali(int,int) is already defined in class id.ac.polinema.overloading.percobaan1.Perkalian
3. kode tambahan di main

    System.out.println(p.kali(5, 2.5));
    System.out.println(p.kali(2, 3));
    System.out.println(p.kali(2.0, 3));

    hasil output:
    <img src="Screenshot 2026-10-09 091056.png" width="50%">

## Pertanyaan Percobaan 1
1. Sebutkan method hasil overloading pada Perkalian dan pembeda tiap pasangannya (jumlah,
tipe, atau urutan parameter).
2. Pada p.kali(25.5, 4.0), versi kali() mana yang dipanggil? Mengapa bukan versi int?
3. Mengapa tampilkan(int, String) dan tampilkan(String, int) sah sebagai
overloading, sedangkan dua method yang hanya beda tipe kembalian atau nama parameter
tidak?
4. Pada eksperimen ketiga, mengapa kali(5, 2.5) menghasilkan 12.5 dan bukan error?

### jawaban percobaan 1
1. Method overloading pada class Perkalian terdiri dari dua kelompok: method kali() yang dibedakan berdasarkan jumlah parameter (int, int dengan int, int, int) dan tipe data parameter (int, int dengan double, double), serta method tampilkan() yang dibedakan berdasarkan urutan tipe data parameternya (int, String dengan String, int)
2. Versi yang dipanggil adalah kali(double, double) karena angka desimal secara default di Java bertipe double. Versi int tidak dipanggil karena Java tidak mengizinkan konversi otomatis dari double ke int untuk menghindari kehilangan presisi data.
3. Perbedaan urutan parameter pada tampilkan() sah karena Java mengidentifikasi pemanggilan method berdasarkan method signature (urutan dan tipe parameter). Sebaliknya, beda return type atau sekadar nama parameter tidak sah karena tidak masuk dalam method signature, sehingga compiler kebingungan membedakan method saat dipanggil.
4. Pemanggilan kali(5, 2.5) berhasil menghasilkan 12.5 karena Java melakukan automatic type promotion, yaitu secara otomatis mempromosikan nilai 5 (int) menjadi 5.0 (double) sehingga cocok diproses oleh method kali(double, double)

## Langkah 2 percobaan 2
1. Prediksi: tampil(long) : 5

    Hasil sebenarnya: tampil(long) : 5
2. Prediksi: tampil(long) : 5L

    Hasil sebenarnya: tampil(long) : 5
3. Prediksi: tampil(Integer) : 7

    Hasil sebenarnya: tampil(Integer) : 7
4. Prediksi: tampil(Object) : 3.5

    Hasil sebenarnya: tampil(Object) : 3.5
5. Prediksi: tampil(Object) : Java

    Hasil sebenarnya: tampil(Object) : Java
6. Prediksi: tampil(int...) : 0 elemen

    Hasil sebenarnya: tampil(int...) : 0 elemen
7. Prediksi: tampil(int...) : 3 elemen

    Hasil sebenarnya: tampil(int...) : 3 elemen

## langkah 3 percobaan 2
1. Overload yang dipanggil: tampil(long)

    Alasan: Java lebih milih konversi pelebaran (widening dari int ke long) ketimbang boxing atau varargs.
2. Overload yang dipanggil: tampil(Integer)

    Alasan: Karena tampil(long) udah mati, Java lanjut ke pilihan prioritas berikutnya, yaitu boxing (int dibungkus jadi objek Integer).
3. Overload yang dipanggil: tampil(Object)

    Alasan: Karena long dan Integer nggak ada, Java melakukan boxing jadi Double/Number/Integer (atau naik ke Object lewat hierarki kelas/supertype) untuk menampungnya. Note: Di Java, int enggak bisa langsung dibungkus jadi Double (karena beda tipe wrapper), tapi karena hierarki, tipe dasarnya bisa masuk ke Object.
4. Overload yang dipanggil: tampil(int...)

    Alasan: Ini jalur terakhir (fallback). Karena semua metode spesifik udah mati, mau enggak mau Java lari ke varargs (int...) yang prioritasnya paling bawah.

## Pertanyaan Percobaan 2
1. Mengapa tampil(5) memilih tampil(long) dan bukan tampil(Integer), padahal 5 dapat
di-boxing? Sebutkan fase yang menentukan.
2. Jelaskan perpindahan overload pada tiap baris tabel Langkah 3.
3. Mengapa tampilLong(5) gagal, sedangkan tampil(5) dapat berakhir pada tampil(Object)
bila overload lain dikomentari?
4. Tantangan. Tanpa menjalankan, prediksi output Resolusi.tampil((short) 3) dan
Resolusi.tampil('A'), lalu buktikan.

### jawaban percobaan 2
1. Fase yang menentukan: Fase Overload Resolution di Java, khususnya aturan prioritas konversi (widening lebih diutamakan daripada boxing).

    Alasan: Angka 5 adalah literal bertipe int. Berdasarkan aturan resolusi metode Java, primitive widening (memperluas tipe data primitif dari int ke long) memiliki prioritas yang lebih tinggi dibandingkan proses boxing (mengubah primitif int menjadi objek pembungkus Integer). Oleh karena itu, Java lebih memilih tampil(long) daripada tampil(Integer).
2. Semua aktif: Pilih long (karena widening prioritas tertinggi).

    long mati: Turun ke boxing (Integer).

    long & Integer mati: Naik ke kelas induknya (Object).

    Semua mati: Lari ke pilihan terakhir (varargs int...).
3. Java tidak bisa menggabung dua konversi sekaligus (misal widening + boxing ke Long). Parameter Long butuh tipe pas, sedangkan Object bisa menampung apa saja lewat boxing/widening lalu naik ke hirarki atas.
4. <img src="Screenshot 2026-10-15 140611.png" width="50%">

## Pertanyaan Percobaan 3
1. Mengapa Konstruktor 2 parameter selesai tercetak lebih dulu daripada Konstruktor 1
parameter selesai pada new Kucing("Tom")?
2. Apa keuntungan this(nama, 1) dibandingkan menyalin isi konstruktor kedua ke
konstruktor pertama?
3. Tambahkan public Kucing() yang memanggil this("Tanpa Nama") dan mencetak
Konstruktor 0 parameter selesai. Tuliskan output new Kucing() serta urutan ketiga
konstruktor dijalankan.

### jawaban percobaan 3
1. Karena di dalam konstruktor 1 parameter terdapat baris this(nama, 1); yang memanggil konstruktor 2 parameter terlebih dahulu. Proses eksekusi menyelesaikan konstruktor yang dipanggil lewat this(...) di dalam, baru setelah itu mencetak baris sisa di konstruktor 1 parameter.
2. Reusability (Penggunaan ulang kode): Menghindari duplikasi kode (DRY - Don't Repeat Yourself). Kalau ada perubahan logika di masa depan (misal nambah validasi), kita cukup ubah di satu tempat saja (di konstruktor 2 parameter).
3. kode tambahan:

    public Kucing() {
        this("Tanpa Nama");
        System.out.println("Konstruktor 0 parameter selesai");
    }

    dan

     Kucing c = new Kucing();
        c.info();

    hasil output:

    <img src="Screenshot 2026-10-15 142131.png" width="50%">
