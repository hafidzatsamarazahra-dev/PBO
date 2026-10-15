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

## Langkah 4: Eksperimen, langgar aturan overriding
1. attempting to assign weaker access privileges; was public
2. overridden method is final
3. method does not override or implement a method from a supertype
4. overridden method does not throw Exception

## Pertanyaan Percobaan 4
1. Bandingkan a.swim() dan c.swim(). Apa peran super.swim(), dan apa yang tercetak bila
baris itu dihapus?
2. Apa manfaat covariant return pada beranak()? Apakah Piranha anak = a.beranak();
valid? Mengapa?
3. Untuk tiap baris tabel Langkah 4, sebutkan aturan overriding yang dilanggar.
4. Pada baris ketiga tabel, apa yang terjadi bila @Override dihapus? Apakah swim(int)
overriding atau overloading?
5. Tantangan. Jika swim() di Ikan dibuat private dan Piranha memiliki @Override public
void swim(), apa yang terjadi? Mengapa?

### jawaban percobaan 4
1. Perbandingan: a.swim() memanggil metode swim() milik kelas Ikan (mencetak "Ikan bisa berenang"). Sedangkan c.swim() menjalankan metode yang sudah dioverride di kelas Piranha.

    Peran super.swim(): Memanggil dan mengeksekusi metode swim() milik kelas induk (Ikan) terlebih dahulu sebelum mengeksekusi baris kode berikutnya di kelas anak.

    Bila baris super.swim() dihapus: Teks "Ikan bisa berenang" tidak akan tercetak, dan output c.swim() hanya akan mencetak "Piranha bisa makan daging".
2. Manfaat covariant return: Memungkinkan metode di kelas turunan mengembalikan tipe data objek yang lebih spesifik (subkelasnya sendiri, yaitu Piranha) dibanding tipe data aslinya di kelas induk (Ikan), tanpa perlu melakukan casting manual.

    Apakah Piranha anak = a.beranak(); valid? Tidak valid.

    Alasan: Variabel a dideklarasikan bertipe Ikan. Meskipun objek aslinya Piranha, metode beranak() dilihat dari tipe referensinya (Ikan), yang mengembalikan objek bertipe Ikan. Menyimpan objek Ikan ke dalam variabel bertipe Piranha akan memicu error kompilasi karena butuh downcasting eksplisit (Piranha).
3. Baris 1 (Hapus public): Melanggar aturan Visibilitas Akses (Access Modifiers), yaitu hak akses tidak boleh lebih lemah/terbatas daripada kelas induknya.

    Baris 2 (Tambah final di induk): Melanggar aturan Final Method, yaitu metode yang bersifat final dilarang untuk di-override.

    Baris 3 (Ubah jadi swim(int jarak)): Melanggar aturan Kecocokan Signature Metode, karena anotasi @Override memaksa kecocokan nama dan parameter, sedangkan pengubahan parameter mengubahnya menjadi overloading, bukan overriding.

    Baris 4 (Tambah throws Exception): Melanggar aturan Exception Handling pada Overriding, di mana metode turunan tidak boleh mendeklarasikan checked exception baru yang lebih luas dari kelas induknya.
4. Bila @Override dihapus: Kode akan lolos kompilasi (berhasil dijalankan). Saat c.swim() dipanggil, program akan menjalankan versi milik Ikan (karena c.swim() tanpa parameter tidak cocok dengan swim(int)).

    Apakah overriding atau overloading? Itu adalah overloading (karena memiliki nama yang sama tetapi parameter atau signature-nya berbeda).
5. Terjadi error kompilasi. Metode dengan akses private bersifat rahasia dan tidak diwariskan (not inherited) ke kelas anak. Oleh karena itu, kelas Piranha tidak sedang meng-override metode apa pun dari kelas induknya, sehingga anotasi @Override akan menolak dan memunculkan error bahwa metode tersebut tidak mengimplementasikan metode dari supertype.

## Pertanyaan Percobaan 5
1. Tunjuk method yang termasuk overloading dan yang termasuk overriding pada ketiga class
(sebutkan class dan signature-nya), dan jelaskan pembeda masing-masing.
2. Mengapa getGaji(int, double) memakai super.getGaji(), sedangkan getGaji() pada
Staff memanggil getGaji(jamLembur, tarifLembur)? Apa yang terjadi bila isi
getGaji(int, double) diganti return getGaji() + jamLembur * tarifLembur;?
3. Apa akibatnya pada gaji Staff bila getGaji() di Staff ditulis return jamLembur *
tarifLembur;? Apakah gaji Manager ikut berubah?
4. Apa hubungan Manager dengan Staff (is-a atau has-a)? Tunjuk atributnya dan bandingkan
dengan hubungan Manager dengan Karyawan.

### jawaban percobaan 5
1. Overloading:
    
        Class: Staff
        
        Signature: public double getGaji(int jamLembur, double tarifLembur)
        
        Pembeda: Method ini memiliki nama yang sama dengan getGaji() milik supertype (Karyawan), tetapi memiliki parameter yang berbeda (menerima 2 parameter).
    
    Overriding:
    
        Class: Staff - Signature: public double getGaji()
        
        Class: Manager - Signature: public double getGaji()
        
        Class: Staff - Signature: public void lihatInfo()
        
        Class: Manager $- Signature: public void lihatInfo()
        
        Pembeda: Method-method ini memiliki nama dan signature (parameter) yang sama persis dengan method yang ada di kelas induknya (Karyawan), namun diimplementasikan ulang untuk menyesuaikan kebutuhan kelas anak.
2. Mengapa getGaji(int, double) memakai super.getGaji()?

Karena method tersebut perlu mengambil nilai gaji pokok asli milik kelas induk (Karyawan) terlebih dahulu, lalu menjumlahkannya dengan hasil perhitungan lembur.

    Mengapa getGaji() memanggil getGaji(jamLembur, tarifLembur)?

    Untuk memanfaatkan method overloaded yang sudah ada, sehingga perhitungan gaji total (gaji pokok + lembur) bisa dipusatkan di satu tempat tanpa menulis ulang rumusnya.

    Apa yang terjadi bila isi getGaji(int, double) diganti return getGaji() + jamLembur * tarifLembur;?

    Terjadi rekursif tak terbatas (infinite recursion) yang berujung pada error StackOverflowError. Alasannya, pemanggilan getGaji() di dalam kelas Staff akan merujuk ke method getGaji() milik kelas Staff itu sendiri secara terus-menerus, bukan mengambil gaji pokok dari kelas Karyawan.
3. Akibat pada gaji Staff: Jika isinya diganti menjadi return jamLembur * tarifLembur;, maka gaji pokok Staff tidak akan dihitung lagi. Gaji yang diterima Staff hanya akan sebesar uang lemburnya saja (gaji pokoknya hilang/tidak masuk hitungan).

    Apakah gaji Manager ikut berubah? Tidak ikut berubah. Manager memiliki implementasi getGaji() sendiri yang memanggil super.getGaji() + tunjangan, sehingga perhitungannya tidak terpengaruh oleh perubahan method di kelas Staff.
4. Hubungan Manager dengan Staff: Hubungannya adalah Has-A (Agregasi/Asosiasi).

        Atribut pembuksinya: Atribut private Staff[] bawahan; di dalam class Manager, yang menunjukkan bahwa seorang Manager memiliki daftar objek Staff sebagai bawahannya.

    Dibandingkan dengan hubungan Manager dengan Karyawan: Hubungan Manager dengan Karyawan adalah Is-A (Inheritance/Pewarisan, menggunakan extends Karyawan), yang berarti Manager adalah bentuk spesifik dari Karyawan.

## Tugas 1
3. (a) keliling(3, 4, 5) dan keliling(3, 4) bertipe kembalian berbeda (int vs double). Apakah itu yang membuatnya sah sebagai overloading? Apa pembeda sebenarnya?

        Bukan itu penentunya. Tipe kembalian (return type) yang berbeda tidak membuat suatu metode menjadi overloading.

        Pembeda sebenarnya: Overloading sah karena adanya perbedaan parameter (jumlah, tipe data, atau urutan parameter), yaitu metode pertama menerima 3 parameter (int, int, int) sedangkan metode kedua menerima 2 parameter (int, int). Di Java, perubahan tipe kembalian saja tidak cukup untuk melakukan overloading jika parameternya sama persis.

    (b) Apa yang terjadi bila t.keliling(3, 4.0) dipanggil? Tuliskan pesan error dan alasannya.

        Terjadi Error Kompilasi.

        Pesan Error: error: no suitable method found for keliling(int,double) (atau pesan bahwa metode tidak dapat diaplikasikan pada argumen tersebut).

        Alasan: Parameter kedua yang dikirimkan adalah 4.0 yang bertipe double. Di dalam class Segitiga, metode keliling dengan 2 parameter hanya menerima tipe data int (keliling(int sisiA, int sisiB)). Java tidak melakukan konversi otomatis secara sembarangan dari double ke int untuk menghindari kehilangan data (narrowing conversion), sehingga Java menganggap tidak ada metode yang cocok.

## Tugas 2
5. (a) Mengapa bernafas() pada objek Mahasiswa mencetak teks milik Manusia, sedangkan makan() tidak?

        Metode bernafas() tidak di-override di kelas Mahasiswa, sehingga objek Mahasiswa mewarisi secara langsung perilaku asli dari kelas induknya (Manusia).
        
        Sebaliknya, metode makan() sudah di-override (ditulis ulang) secara spesifik di kelas Mahasiswa, sehingga program mengeksekusi versi baru yang ada di kelas Mahasiswa alih-alih milik induknya.
    
    (b) Bandingkan hasil makan() pada Dosen dan Mahasiswa, lalu jelaskan peran super.makan().
    
        Perbandingan: Pada objek Dosen, hasil cetaknya menggabungkan perilaku induk dan anak (Manusia makan nasi diikuti Dosen makan di kantin fakultas). Sedangkan pada objek Mahasiswa, hasil cetaknya langsung menggantikan tanpa membawa teks induk (Mahasiswa makan di kantin kampus saja).   
        
        Peran super.makan(): Digunakan di kelas Dosen untuk memanggil dan mengeksekusi terlebih dahulu metode makan() milik kelas induk (Manusia) sebelum mengeksekusi baris kode tambahan di kelas Dosen.

## Tugas 3
1. - Lokasi Terjadi

        Overloading: Bisa terjadi di dalam satu kelas yang sama (same class), atau antara kelas induk dan kelas anak.

        Overriding: Wajib terjadi antar kelas yang memiliki hubungan pewarisan (inheritance), yaitu antara kelas induk (superclasses) dan kelas anak (subclasses).

    - Signature (Parameter)

        Overloading: Wajib berbeda (bisa dari jumlah, tipe data, atau urutan parameternya), meskipun nama metodenya sama.

        Overriding: Wajib sama persis (nama method dan parameternya tidak boleh diubah).

    - Tipe Kembalian (Return Type)

        Overloading: Boleh sama ataupun berbeda (karena penentunya adalah parameter, bukan tipe kembaliannya).

        Overriding: Harus sama, atau berupa tipe data turunan yang kompatibel jika menggunakan covariant return type.

    - Access Modifier

        Overloading: Tidak terikat oleh aturan khusus; modifier bisa bebas diubah (public, private, protected, dll).

        Overriding: Hak akses method pada kelas anak tidak boleh lebih ketat/lemah daripada method di kelas induknya (misal: jika induknya public, anak tidak boleh protected atau private).

    - Peran @Override

        Overloading: Tidak menggunakan anotasi @Override (jika dipakai justru akan memicu error kompilasi).

        Overriding: Dianjurkan menggunakan anotasi @Override sebagai bentuk pengaman agar Java ikut memvalidasi kecocokan method dengan kelas induk.
2. Kapan memilih Overloading:

 Dipilih saat kita ingin membuat beberapa versi method dengan nama yang sama untuk melakukan fungsi yang mirip, tetapi menerima jenis atau jumlah data masukan yang berbeda.

        Contoh dari jobsheet: Method keliling(int sisiA, int sisiB, int sisiC) dan keliling(int sisiA, int sisiB) pada class Segitiga, atau method getGaji(int jamLembur, double tarifLembur) dan getGaji() pada class Staff. 

    Kapan memilih Overriding: Dipilih saat kita ingin mengubah atau menyesuaikan perilaku (behavior) dari sebuah method yang sudah diwarisi dari kelas induk agar sesuai dengan karakteristik khusus di kelas anak.
    
        Contoh dari jobsheet: Method makan() di dalam class Dosen dan Mahasiswa yang meng-override method makan() milik kelas Manusia.   
3. static: Bersifat terikat pada tingkat kelas (class-level), bukan pada objek instansiasi, sehingga tidak dapat di-override secara polimorfik (melainkan hanya bisa di-hiding atau disembunyikan).

    private: Bersifat tertutup dan hanya bisa diakses di dalam kelas aslinya saja, sehingga tidak diwariskan ke kelas anak dan tidak bisa dikenali atau di-override.

    final: Secara sengaja dikunci oleh pembuatnya agar tidak bisa diubah, dimodifikasi, ataupun di-override lagi oleh kelas turunan manapun.