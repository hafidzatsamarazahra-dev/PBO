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