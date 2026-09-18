# Pengantar Konsep Pemrograman Berorientasi Objek

<h4>Nama : Hafidza Tsamara Z.<br>
NIM : 254107020034<br>
Kelas : TI-2G<br>
Repository [link] : https://github.com/hafidzatsamarazahra-dev/PBO.git <h4>

## pertanyaan percobaan 1
1. Di dalam class Processor dan class Laptop, terdapat method setter dan getter untuk masingmasing atributnya. Apakah gunanya method setter dan getter tersebut?
2. Di dalam class Processor dan class Laptop, masing-masing terdapat konstruktor default dan
konstruktor berparameter. Bagaimanakah beda penggunaan dari kedua jenis konstruktor
tersebut?
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang
bertipe object? Baris kode manakah yang menunjukkan bahwa class Laptop memiliki relasi dengan
class Processor?
4. Perhatikan pada class Laptop, apakah guna dari sintaks proc.info()?
5. Pada Langkah 8, objek p dibuat lebih dulu baru diberikan ke constructor Laptop. Pada Langkah 10,
objek Processor dibuat langsung di dalam argumen constructor Laptop (tanpa variabel p). Apakah
keduanya menghasilkan output yang berbeda? Mengapa?
6. Secara kode, apakah relasi Laptop-Processor pada percobaan ini termasuk Aggregation atau
Composition? Tunjukkan baris kode yang menjadi bukti jawabanmu.
7. Andaikan constructor Laptop diubah menjadi seperti berikut, sehingga Processor dibuat sendiri di
dalam Laptop, bukan diterima sebagai parameter:
    public Laptop (String merk) {
    this.merk = merk;
    this.proc = new Processor ("Generic", 1);
    }
Apakah relasi Laptop-Processor pada versi ini masih Aggregation? Jelaskan alasannya (jawaban ini
akan kita buktikan sendiri lewat kode pada Percobaan 5).

### jawaban
1. - Getter: Berfungsi untuk mengambil atau membaca nilai dari suatu atribut yang bersifat private.

    - Setter: Berfungsi untuk memberikan atau mengubah nilai dari suatu atribut yang bersifat private.
2. - Konstruktor Default: Digunakan untuk menginstansiasi objek tanpa memberikan nilai awal pada atributnya, sehingga atribut akan bernilai default (seperti null atau 0).

    - Konstruktor Berparameter: Digunakan untuk menginstansiasi objek sekaligus menginisialisasi nilai awal atribut secara langsung saat objek dibuat.
3. - Atribut bertipe Object: Atribut proc (bertipe class Processor).

    - Baris Kode Relasi: Terletak pada deklarasi atribut private Processor proc; di dalam class Laptop.
4. Sintaks tersebut berfungsi untuk memanggil method info() milik objek proc guna menampilkan informasi atau rincian spesifikasi dari Processor.
5. Kedua cara tersebut sama-sama meneruskan instansi objek Processor yang valid ke dalam konstruktor Laptop. Perbedaannya hanya terletak pada penggunaan variabel penampung: Langkah 8 menyimpan objek Processor pada variabel p terlebih dahulu, sedangkan Langkah 10 instansiasi objek Processor dilakukan secara langsung pada argumen konstruktor Laptop
6. Relasi pada kode tersebut adalah Aggregation.

    public Laptop(String merk, Processor proc) {
    this.merk = merk;
    this.proc = proc;
    }
7. Objek Processor diinstansiasi secara internal di dalam konstruktor Laptop (this.proc = new Processor(...)). Dengan demikian, keberadaan dan siklus hidup objek Processor bergantung sepenuhnya pada objek Laptop. Apabila objek Laptop dihancurkan, maka objek Processor di dalamnya juga akan ikut terhapus.

## Pertanyaan Percobaan 2
1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukkan bahwa class Pelanggan
memiliki relasi dengan class Mobil dan class Sopir?
10
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada
class Mobil. Mengapa method tersebut harus memiliki argument hari, padahal hari sendiri adalah
atribut milik Pelanggan, bukan milik Mobil atau Sopir?
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari)
dan sopir.hitungBiayaSopir(hari)?
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s)?
5. Untuk apakah proses p.hitungBiayaTotal()?
6. Pada Langkah 7, p.getMobil().getMerk() memanggil dua method sekaligus secara berantai.
Jelaskan urutan eksekusinya: objek apa yang dikembalikan p.getMobil(), dan objek apa yang
kemudian dipanggil .getMerk()-nya?
7. Andaikan p.setMobil(m) tidak pernah dipanggil lalu p.hitungBiayaTotal() dijalankan, error
apa yang akan muncul? Jelaskan mengapa error itu terjadi, dikaitkan dengan konsep referensi objek
yang sudah kita pelajari sebelumnya. 

### jawaban
1. private Mobil mobil;

    private Sopir sopir;
2. Method tersebut memerlukan argumen hari karena jumlah hari sewa merupakan variabel dinamis yang menentukan total biaya. Class Mobil dan Sopir hanya menyimpan informasi tarif per hari (misalnya biaya atau tarif), sehingga untuk menghitung total biaya sewa komponen tersebut, method membutuhkan masukan data lama durasi sewa yang berasal dari objek Pelanggan.
3. - mobil.hitungBiayaMobil(hari): Berfungsi untuk menghitung dan mengembalikan (return) subtotal biaya sewa mobil berdasarkan durasi hari yang dikirimkan.

    - sopir.hitungBiayaSopir(hari): Berfungsi untuk menghitung dan mengembalikan (return) subtotal biaya jasa sopir berdasarkan durasi hari yang dikirimkan.
4. - p.setMobil(m): Memasukkan referensi objek m (instansi dari Mobil) ke dalam atribut mobil milik objek p (Pelanggan).

    - p.setSopir(s): Memasukkan referensi objek s (instansi dari Sopir) ke dalam atribut sopir milik objek p (Pelanggan).
5. Proses tersebut bertujuan untuk menghitung keseluruhan biaya yang harus dibayar oleh pelanggan. Method ini akan menjumlahkan hasil kalkulasi biaya sewa mobil dan biaya jasa sopir dengan memanggil method perhitungan dari masing-masing objek komponennya.
6. - p.getMobil() dieksekusi terlebih dahulu: Method ini mengembalikan (return) referensi objek Mobil yang tersimpan di dalam atribut mobil pada objek p.

    - .getMerk() dieksekusi kemudian: Method ini dipanggil langsung dari objek Mobil hasil pengembalian tahap pertama untuk mengambil String merek dari mobil tersebut.
7. Jenis Error: NullPointerException.

    Penjelasan: Jika p.setMobil(m) tidak dipanggil, maka atribut mobil di dalam objek p belum menunjuk ke instansi objek Mobil manapun di memori, sehingga nilainya secara default masih null. Ketika p.hitungBiayaTotal() dijalankan dan berusaha memanggil method mobil.hitungBiayaMobil(hari), program mencoba mengakses method dari referensi bernilai null, yang menyebabkan Java melempar eksepsi NullPointerException.

## Pertanyaan Percobaan 3
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan
this.asisten.info() digunakan untuk apa?
2. Apa hasil output dari MainPertanyaan sebelum diperbaiki (Langkah 8)? Mengapa hal tersebut dapat
terjadi?
3. Kaitkan dengan materi referensi objek: apa isi variabel asisten di dalam objek KeretaApi yang
dibuat lewat constructor 3-parameter, sebelum guard clause ditambahkan?
4. Setelah guard clause ditambahkan (Langkah 9), apakah objek masinis juga perlu dicek dengan cara
yang sama? Perhatikan kedua constructor KeretaApi, apakah mungkin masinis bernilai null?
Jelaskan.
5. Kelas Pegawai dipakai lewat dua atribut berbeda (masinis dan asisten) pada KeretaApi. Apakah
ini membuat KeretaApi punya dua objek Pegawai yang berbeda, atau satu objek Pegawai yang
dipakai dua kali? Jelaskan berdasarkan kode pada Langkah 6. 

### jawaban
1. Kegunaan this.masinis.info() dan this.asisten.info()
Kedua baris tersebut digunakan untuk memanggil method info() milik objek Pegawai yang tersimpan pada atribut masinis dan asisten. Tujuannya adalah menampilkan rincian informasi (seperti NIP dan nama) dari masing-masing pegawai tersebut.
2. Hasil Output: Terjadi error/eksepsi java.lang.NullPointerException.

    Penyebab: Pada Langkah 8, objek KeretaApi diinstansiasi menggunakan konstruktor 3-parameter tanpa menyertakan objek asisten (parameter asisten tidak diisi atau bernilai null). Ketika method info() dipanggil, program mencoba mengeksekusi this.asisten.info(), yaitu memanggil method dari referensi yang bernilai null.
3. Di dalam objek KeretaApi yang dibuat via konstruktor 3-parameter, variabel referensi asisten berisi nilai null (alamat memori kosong/belum menunjuk ke instansi objek Pegawai manapun).
4. Apakah masinis mungkin bernilai null?: Ya, sangat mungkin.

    Penjelasan: Pada konstruktor 3-parameter (nama, kelas, masinis), parameter asisten tidak ada sehingga atribut asisten secara otomatis bernilai null. Namun, jika seseorang secara sengaja menginstansiasi KeretaApi dengan memasukkan argumen null pada posisi parameter masinis (misal: new KeretaApi("Gaya Baru", "Bisnis", null)), maka atribut masinis juga akan bernilai null. Oleh karena itu, guard clause (if (masinis != null)) sebaiknya juga diterapkan pada atribut masinis untuk mencegah NullPointerException.
5. Pada Langkah 6, dilakukan instansiasi dua kali menggunakan operator new:

    Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); (membuat objek Pegawai pertama di memori).

    Pegawai asisten = new Pegawai("5678", "Patrick Star"); (membuat objek Pegawai kedua di lokasi memori yang berbeda).

    Kedua referensi objek yang berbeda tersebut kemudian masing-masing diteruskan ke atribut masinis dan asisten pada class KeretaApi.