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

## Pertanyaan Percobaan 4
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A?
2. Perhatikan potongan kode if (this.penumpang != null) { ... } pada method info()
dalam class Kursi. Apa maksud kode tersebut?
3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1?
4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada
gerbong dengan gerbong.setPenumpang(budi, 1), menimpa Mr. Krab yang sudah duduk di
sana. Apakah yang terjadi? Apakah Java memberi peringatan/error?
5. Modifikasi program sehingga tidak diperkenankan menduduki kursi yang sudah ada penumpang lain
(tambahkan pengecekan pada Gerbong.setPenumpang() sebelum baris arrayKursi[nomor -
1].setPenumpang(...) dijalankan).
6. Bandingkan tiga bentuk relasi has-a yang sudah kita praktikkan: Laptop-Processor (Percobaan 1, 1-
1), KeretaApi-Pegawai (Percobaan 3, dua relasi 1-1 bernama), dan Gerbong-Kursi (Percobaan 4, 1..*).
Untuk kasus seperti apa kita akan memilih array, dan untuk kasus seperti apa kita akan memilih
atribut bernama satu-satu?
7. Terapkan kriteria kode (siapa yang memanggil new) pada dua relasi has-a di Percobaan ini: GerbongKursi dan Kursi-Penumpang. Manakah yang Aggregation dan manakah yang Composition? Tunjukkan
baris kode yang menjadi bukti untuk masing-masing.

### jawaban
1. Jumlah kursi dalam Gerbong A adalah 10 kursi (sesuai dengan argumen 10 yang dikirimkan saat instansiasi new Gerbong("A", 10) pada class MainPercobaan4).
2. Kode tersebut merupakan guard clause yang berfungsi untuk memeriksa apakah kursi tersebut sudah diisi oleh penumpang atau masih kosong.

    Jika penumpang != null (ada objek Penumpang), maka program akan menampilkan rincian informasi penumpang via penumpang.info().

    Jika penumpang == null, bagian menampilkan info penumpang dilewati (atau menampilkan status kursi kosong) sehingga mencegah terjadinya NullPointerException.
3. Pengurangan angka 1 dilakukan untuk menyesuaikan nomor kursi dunia nyata (berbasis 1) dengan indeks array pada Java (berbasis 0).
Pengguna atau sistem menentukan posisi kursi mulai dari nomor 1 hingga 10, sedangkan secara teknis di memori, elemen array arrayKursi tersimpan pada indeks 0 hingga 9.
4. Yang Terjadi: Objek budi akan berhasil menimpa objek Mr. Krab pada kursi nomor 1.

    Peringatan/Error Java: Java tidak memberikan peringatan maupun error. Secara teknis, variabel referensi penumpang pada objek Kursi indeks ke-0 hanya akan mengganti alamat referensinya dari objek Mr. Krab menjadi objek budi.
5. public void setPenumpang(Penumpang penumpang, int nomor) {
   penumpangnya
    if (this.arrayKursi[nomor - 1].getPenumpang() != null) {
        System.out.println("Gagal: Kursi nomor " + nomor + " sudah diisi oleh penumpang lain!");
    } else {
        this.arrayKursi[nomor - 1].setPenumpang(penumpang);
    }
    }
6. - Penggunaan Atribut Bernama Satu-satu: Dipilih ketika jumlah hubungan antar-objek bersifat pasti, terbatas, dan memiliki peran/fungsi yang berbeda secara eksplisit. 

    Contohnya:Laptop-Processor (1-1): Komputer umumnya hanya memiliki satu komponen utama prosesor.

    KeretaApi-Pegawai (dua atribut bernama): Memiliki fungsi peran terpisah yang jelas, yaitu masinis dan asisten.

    - Penggunaan Array (Koleksi): Dipilih ketika jumlah hubungan bernilai banyak/jamak ($1..*$) atau dinamis, di mana tiap elemennya memiliki peran, struktur, dan sifat yang seragam. 

    Contohnya Gerbong-Kursi, di mana satu gerbong menampung banyak kursi dengan struktur yang sama persis.
7. - Gerbong - Kursi merupakan COMPOSITION

    Alasan: Objek Kursi dikonstruksi/dibuat di dalam class Gerbong (menggunakan operator new di dalam class Gerbong).

    Bukti Kode (pada constructor Gerbong):

    for (int i = 0; i < arrayKursi.length; i++) {
    this.arrayKursi[i] = new Kursi(String.valueOf(i + 1));
    }

    - Kursi - Penumpang merupakan AGGREGATION

    Alasan: Objek Penumpang dibuat di luar class Kursi (pada main program) dan hanya diteruskan/dimasukkan lewat method setter.

    Bukti Kode (pada method setPenumpang dalam class Kursi):

    public void setPenumpang(Penumpang penumpang) {
        this.penumpang = penumpang;
    }

## Pertanyaan Percobaan 5
1. Pada class Mobil, baris manakah yang menunjukkan bahwa Mesin adalah bagian yang “dimiliki
secara eksklusif” oleh Mobil (bukan sekadar “dipinjam”)?
2. Apa yang terjadi secara desain jika ditambahkan method setMesin(Mesin mesin) pada class
Mobil? Apakah relasi ini akan tetap menjadi Composition? Jelaskan.
3. Bandingkan dengan Percobaan 1 (Laptop-Processor): sebutkan satu perbedaan baris kode yang
membuat salah satunya Aggregation dan yang lain Composition.
4. Jika objek mobil di MainPercobaan5 di-set null setelah tampilkanInfo() dipanggil, apa yang
terjadi pada objek Mesin miliknya? Bandingkan dengan nasib objek Processor pada Percobaan 1
seandainya objek Laptop-nya dihapus, apakah Processor tersebut masih bisa “diselamatkan” oleh
kode lain? Kenapa Mesin tidak bisa?
5. Coba (secara terpisah, boleh di file/package percobaan sendiri) tambahkan constructor kedua pada
Mobil yang menerima parameter Mesin, mirip pola Percobaan 1: public Mobil(String merek,
Mesin mesin) { this.merek = merek; this.mesin = mesin; }. Kalau constructor ini yang
dipakai, apakah Mobil-Mesin berubah menjadi Aggregation? Jelaskan alasannya. 

### jawaban
1. this.mesin = new Mesin();
2. Relasi tersebut berpotensi melemah atau tidak lagi menjadi Composition murni, melainkan bergeser ke arah Aggregation.

    Jika terdapat method setMesin(Mesin mesin), objek Mesin dari luar dapat disuntikkan (inject) atau diganti sewaktu-waktu. Hal ini menghilangkan sifat keterikatan penuh di mana Mobil menjadi satu-satunya pihak yang mengontrol pembuatan dan penggantian Mesin.
3. Perbedaannya terletak pada tempat instansiasi objek komponennya dilakukan:

    - Composition (Percobaan 5 - Mobil): Instansiasi new dilakukan di dalam konstruktor Mobil.

    this.mesin = new Mesin();

    - Aggregation (Percobaan 1 - Laptop): Instansiasi new dilakukan di luar class Laptop (main program), lalu objeknya diteruskan melalui parameter konstruktor.

    public Laptop(String merk, Processor proc) {
    this.proc = proc;
    }
4. Nasib Objek Mesin pada Percobaan 5: Objek Mesin akan ikut hilang/dihancurkan dari memori oleh Garbage Collector. Hal ini terjadi karena tidak ada variabel referensi lain dari luar yang memegang objek Mesin tersebut selain atribut mesin di dalam objek mobil.

    Perbandingan dengan Objek Processor pada Percobaan 1: Objek Processor masih bisa diselamatkan karena diinstansiasi di main program dan disimpan dalam variabel tersendiri (misalnya p). Meskipun objek laptop di-set null, objek Processor masih diacu oleh variabel p. Sebaliknya, Mesin pada Percobaan 5 dibuat secara internal tanpa variabel penampung di luar, sehingga keberadaannya terikat mati dengan siklus hidup Mobil.
5. Ya, relasinya berubah menjadi Aggregation jika menggunakan konstruktor tersebut.

    Alasan: Objek Mesin dibuat di luar class Mobil terlebih dahulu, kemudian dioper/diteruskan ke dalam Mobil sebagai argumen parameter. Dengan demikian, objek Mesin memiliki siklus hidup yang independen dari objek Mobil dan dapat digunakan atau dirujuk oleh bagian kode lainnya.

## Pertanyaan Percobaan 6
1. Apakah class Laptop pada percobaan ini memiliki atribut bertipe Printer? Bandingkan dengan
Percobaan 1, di mana Processor disimpan sebagai atribut Laptop.
2. Setelah method cetakDokumen() selesai dijalankan, apakah Laptop masih menyimpan referensi ke
objek printer yang tadi dipakai? Jelaskan berdasarkan baris kode class Laptop.
3. Mengapa relasi Laptop-Printer pada percobaan ini disebut Dependency (uses-a), bukan Aggregation,
meskipun sama-sama melibatkan dua objek yang saling berinteraksi?
4. Coba ubah kode Laptop supaya Printer disimpan sebagai atribut (mis. private Printer
printerDefault, diisi lewat constructor atau setter, lalu dipakai kembali di cetakDokumen()
tanpa parameter Printer). Apakah relasi ini sekarang berubah dari Dependency menjadi
Aggregation? Jelaskan. 
5. Lengkapi tabel berikut dengan kata-katamu sendiri (boleh dijawab di laporan): untuk masing-masing
dari Aggregation, Composition, dan Dependency, sebutkan (a) apakah objek part disimpan sebagai
atribut atau tidak, dan (b) siapa yang memanggil new untuk membuat objek part tersebut. 

### jawaban
1. Tidak. Class Laptop pada percobaan ini tidak memiliki atribut bertipe Printer.

    Perbandingan dengan Percobaan 1: Pada Percobaan 1, Processor disimpan secara permanen sebagai atribut (field) dari Laptop (private Processor proc;). Sementara pada Percobaan 6, Printer tidak disimpan sebagai atribut, melainkan hanya disisipkan sebagai parameter pada method cetakDokumen(Printer printer).
2. Tidak. Laptop tidak menyimpan referensi ke objek Printer tersebut.

    Variabel printer hanya bersifat sebagai variabel lokal/parameter dari method cetakDokumen(). Begitu eksekusi method cetakDokumen() selesai, variabel lokal tersebut akan dialokasikan keluar dari stack (scope hilang), sehingga Laptop tidak lagi memegang referensi ke objek Printer.
3. Relasi ini disebut Dependency (uses-a) karena class Laptop hanya menggunakan (uses) objek Printer secara sementara untuk menyelesaikan suatu tugas (method), tanpa memiliki (has-a) objek tersebut. Laptop tidak menyimpan Printer di dalam struktur atributnya, sehingga keterikatannya sangat longgar dan hanya terjadi saat method dipanggil.
4. Ya, relasi tersebut berubah dari Dependency menjadi Aggregation.

    Ketika Printer disimpan sebagai atribut private Printer printerDefault; dan diisikan melalui konstruktor atau setter, relasi yang tadinya uses-a (ketergantungan sementara) berubah menjadi has-a (kepemilikan). Karena objek Printer dibuat di luar class Laptop lalu disuntikkan via konstruktor/setter, maka sifat kepemilikannya adalah Aggregation (longgar/independen).
5. - Aggregation

    (a) Status Penyimpanan Atribut: Ya, objek part disimpan sebagai atribut (field) permanen di dalam class utama.

    (b) Pihak Pembuat Objek (new): Objek part dibuat di luar class utama (misalnya di main program), lalu diteruskan atau disuntikkan ke class utama melalui parameter konstruktor atau method setter.

    - Composition

    (a) Status Penyimpanan Atribut: Ya, objek part disimpan sebagai atribut (field) permanen di dalam class utama.

    (b) Pihak Pembuat Objek (new): Objek part dibuat secara internal di dalam class utama itu sendiri (biasanya dieksekusi langsung di dalam konstruktor class utama).

    - Dependency

    (a) Status Penyimpanan Atribut: Tidak, objek part tidak disimpan sebagai atribut class.

    (b) Pihak Pembuat Objek (new): Objek part biasanya dibuat di luar class utama, lalu hanya dioper sebagai argumen/parameter sementara saat panggilan method tertentu dijalankan.

## Tugas

1. Deskripsi & Diagram Kelas (UML)

+-------------------+           +-------------------+
|      Dokter       |           |      Pasien       |
+-------------------+           +-------------------+
| - nama: String    |           | - nama: String    |
| - spesialis: Str. |           | - noRM: String    |
+-------------------+           +-------------------+
| + info(): void    |           | + info(): void    |
+-------------------+           +-------------------+
          ^                               ^
          | (Aggregation)                 | (Dependency)
          |                               |
+---------------------------------------------------+
|                      RekamMedis                   |
+---------------------------------------------------+
| - idRekam: String                                 |
| - tanggal: String                                 |
| - resep: Resep             <--- (Composition)     |
| - dokter: Dokter                                  |
+---------------------------------------------------+
| + cetakRekamMedis(pasien: Pasien): void           |
+---------------------------------------------------+
                          |
                          v (Composition)
                +-------------------+
                |       Resep       |
                +-------------------+
                | - obat: String    |
                | - dosis: String   |
                +-------------------+
                | + info(): void    |
                +-------------------+

Class Dokter

<img src="Screenshot 2026-09-23 195754.png" width="50%">

Class pasien

<img src="Screenshot 2026-09-23 200042.png" width="50%">

Class resep

<img src="Screenshot 2026-09-23 210040.png" width="50%">

Class RekamMedis

<img src="Screenshot 2026-09-23 210708.png" width="50%">

Class MainTugas

<img src="Screenshot 2026-09-23 210819.png" width="50%">

Hasil output

<img src="Screenshot 2026-09-23 211247.png" width="50%">

- Relasi Aggregation: RekamMedis - Dokter

    private Dokter dokter;
    public RekamMedis(..., Dokter dokter, ...) {
        this.dokter = dokter;
    }

    Objek Dokter dibuat di luar class RekamMedis (main program) lalu dikirim melalui parameter konstruktor. Jika objek RekamMedis dihapus dari memori, objek Dokter tetap ada dan masih bisa digunakan untuk rekam medis pasien lainnya.

- Relasi Composition: RekamMedis - Resep

    private Resep resep;
    public RekamMedis(..., String obat, String dosis) {
        this.resep = new Resep(obat, dosis);
    }

    Objek Resep dikonstruksi secara internal (new Resep(...)) di dalam konstruktor RekamMedis. Siklus hidup Resep terikat mati pada RekamMedis; jika dokumen RekamMedis dihancurkan, maka objek Resep di dalamnya ikut terhapus dari memori.

- Relasi Dependency: RekamMedis - Pasien

    public void cetakRekamMedis(Pasien pasien) {
    pasien.info();
    }

    Class RekamMedis tidak menyimpan Pasien sebagai atribut (field) permanen. Objek Pasien hanya dipinjam/digunakan sementara sebagai parameter pada method cetakRekamMedis(). Setelah method selesai dieksekusi, referensi objek Pasien dilepas.

2. Untuk memutuskan jenis relasi antar-class, kita dapat mengajukan tiga pertanyaan kunci berdasarkan tingkat keterikatan dan siklus hidup objek. Pertama, ajukan pertanyaan: "Apakah Class A menggunakan Class B hanya secara sementara saat method tertentu dipanggil?" Jika ya, gunakan Dependency. Kedua, jika Class A memiliki Class B sebagai atribut, tanyakan: "Apakah Class B dibuat di luar dan masih bisa hidup sendiri jika Class A dihapus?" Jika ya, pilih Aggregation. Ketiga, tanyakan: "Apakah Class B diciptakan langsung di dalam Class A dan ikut musnah jika Class A dihapus?" Jika ya, maka pilih Composition.