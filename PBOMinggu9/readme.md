# Pengantar Konsep Pemrograman Berorientasi Objek

<h4>Nama : Hafidza Tsamara Z.<br>
NIM : 254107020034<br>
Kelas : TI-2G<br>
Repository [link] : https://github.com/hafidzatsamarazahra-dev/PBO.git <h4>

## Pertanyaan Percobaan 1
Setelah setiap uji coba, kembalikan kode seperti semula sebelum mengerjakan nomor berikutnya.
1. Jelaskan jalannya program di atas. Mengapa pemanggilan
this.hewanPeliharaan.bergerak() di class Orang menghasilkan output yang berbeda
untuk Ani dan Budi?
2. Tambahkan baris Hewan hewan = new Hewan(); pada method main(). Tunjukkan hasil
kompilasinya dan jelaskan secara singkat.
7
3. Bolehkah sebuah class yang meng-extend abstract class tidak mengimplementasikan abstract
method induknya? Buktikan dengan menghapus method bergerak() dari class Ikan, lalu
tunjukkan hasil kompilasinya dan jelaskan.
4. Tambahkan abstract method public abstract void bernapas(); di dalam class Ikan
tanpa mengubah deklarasi class Ikan. Tunjukkan hasil kompilasinya dan jelaskan aturan yang
dilanggar.

### jawaban pertanyaan percobaan 1
1. Program berjalan dengan mencetak identitas, lalu memanggil this.hewanPeliharaan.bergerak(). Outputnya berbeda karena menerapkan konsep polimorfisme dan dynamic method dispatch.

    Meskipun variabel hewanPeliharaan di dalam class Orang sama-sama bertipe Hewan, objek nyata di dalamnya berbeda:

    Ani memelihara Kucing, sehingga method yang dieksekusi milik class Kucing (Berjalan dengan KAKI).

    Budi memelihara Ikan, sehingga method yang dieksekusi milik class Ikan (Berenang dengan SIRIP).
2. Hasil: Gagal kompilasi (Error).

    Penjelasan: Sebuah abstract class (Hewan) bersifat incomplete dan berfungsi sebagai kerangka/template. Java melarang instansiasi langsung abstract class menggunakan keyword new. Objek hanya bisa dibuat dari concrete class (subclass-nya).
3. Hasil: Gagal kompilasi (Error).

    Penjelasan: Aturan Java mewajibkan class biasa (concrete subclass) yang mewarisi abstract class untuk mengimplementasikan seluruh abstract method dari parent-nya. Jika method bergerak() dihapus, class Ikan dianggap melanggar kontrak tersebut.
4. Hasil: Gagal kompilasi (Error).

    Penjelasan: Aturan yang dilanggar adalah class biasa (non-abstract) dilarang memiliki abstract method. Karena deklarasi class Ikan bukan public abstract class Ikan, ia tidak boleh menampung method abstrak. Pilihannya, class Ikan harus diubah jadi abstract, atau method bernapas() harus langsung diberi isi (implementasi).