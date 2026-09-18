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