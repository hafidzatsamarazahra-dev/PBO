# Pengantar Konsep Pemrograman Berorientasi Objek

<h4>Nama : Hafidza Tsamara Z.<br>
NIM : 254107020034<br>
Kelas : TI-2G<br>
Repository [link] : https://github.com/hafidzatsamarazahra-dev/PBO.git <h4>

## Pertanyaan Percobaan 1 
1. Mengapa kompilasi pada Langkah 5 gagal? Tuliskan pesan error pertama beserta file dan baris tempat error muncul. 
2. Baris kode mana yang diubah pada Langkah 6, dan apa artinya? Sebutkan class yang berperan sebagai superclass dan subclass. 
3. Setelah diperbaiki, sebutkan atribut dan method yang dapat dipakai oleh objek hitung. Kelompokkan mana yang dideklarasikan di ClassA dan mana yang dideklarasikan di ClassB. 
4. Pada MainPercobaan1, hitung.x = 20 ditulis pada objek ClassB, padahal atribut x tidak dideklarasikan di ClassB. Mengapa hal ini diperbolehkan? 
5. Atribut x dan y pada ClassA dibuat public, sehingga dapat diubah langsung dari MainPercobaan1. Apa risiko dari desain seperti ini? (jawaban ini akan kita telusuri pada Percobaan 2) 
6. Coba tambahkan class ClassD lalu ubah deklarasi menjadi public class ClassB extends ClassA, ClassD. Apa yang terjadi? Apa yang dapat Anda simpulkan tentang jumlah superclass langsung pada Java? 

### jawaban percobaan 1
1. <img src="Screenshot 2026-10-02 084212.png" width="50%">

    Kompilasi gagal karena ClassB belum melakukan pewarisan (extends ClassA). Akibatnya, ClassB maupun objek hitung tidak dapat mengenali atribut x, y, dan method getNilai() yang merupakan milik ClassA.
2. Deklarasi header ClassB diubah menjadi

    public class ClassB extends ClassA

    Artinya: ClassB melakukan pewarisan (inheritance) dari ClassA. ClassB mewarisi semua atribut dan method berakses public (dan protected) dari ClassA.
3. Dideklarasikan di ClassA: Atribut x, y dan method getNilai().

    Dideklarasikan di ClassB: Atribut z dan method getNilaiB(), getJumlah().
4. Diperbolehkan karena adanya konsep inheritance (pewarisan). Karena ClassB adalah subclass dari ClassA, maka ClassB secara otomatis mewarisi atribut x yang bertipe public dari ClassA. Oleh karena itu, objek hitung yang bertipe ClassB berhak mengakses dan mengisi nilai atribut x tersebut.
5. Atribut bertipe public melanggar prinsip Encapsulation (pembungkusan data) dalam PBO. Risikonya, nilai variabel dapat diubah secara bebas dan tanpa kontrol dari luar class, sehingga tidak ada validasi data yang dapat mencegah pengisian nilai yang salah atau tidak valid.
6. Hasil: Terjadi error kompilasi (compile error).

    Java tidak mendukung multiple inheritance (pewarisan ganda) untuk sebuah class. Sebuah subclass di Java hanya diperbolehkan memiliki satu superclass langsung (single inheritance).


## Pertanyaan Percobaan 2 
1. Di file dan baris mana error pada Langkah 5 muncul, dan apa pesannya? Mengapa error tidak muncul di MainPercobaan2? 
2. Jelaskan penyebab error tersebut dengan merujuk pada tabel kontrol pengaksesan (Langkah 1). 
3. Pada kode awal, MainPercobaan2 memanggil hitung.setX(20) dan tidak error, padahal x bersifat private. Mengapa pemanggilan ini diperbolehkan, dan di mana nilai x tersimpan? 
4. Bandingkan Perbaikan A (protected) dan Perbaikan B (private + getter) dari sisi encapsulation. Mana yang Anda pilih untuk program sungguhan? Jelaskan alasannya. 
5. Andaikan ClassA dan ClassB berada di package yang berbeda. Berdasarkan tabel, apakah ClassB tetap dapat mengakses atribut protected milik ClassA? Bagaimana jika atributnya default (tanpa modifier)? 

### jawaban percobaan 2
1. Letak Error: Di file ClassB.java pada baris di dalam method getJumlah() yang mencoba mengakses langsung atribut x dan y (misalnya System.out.println("jumlah:" + (x + y + z));).

    Pesan Error: x has private access in ClassA dan y has private access in ClassA (atau cannot find symbol / x is not visible).

    Alasan Tidak Error di MainPercobaan2: Karena MainPercobaan2 mengakses variabel melalui method setter/getter yang berakses public (setX() dan setY()), bukan mengakses atribut x dan y secara langsung.
2. Atribut x dan y di ClassA dideklarasikan dengan modifier private. Berdasarkan tabel kontrol pengaksesan, anggota class (member) berakses private hanya dapat diakses oleh internal class itu sendiri (ClassA). ClassB (meskipun merupakan subclass) tidak memiliki hak akses langsung ke atribut private milik superclass-nya.
3. Alasan Diperbolehkan: Method setX(int x) di ClassA berstatus public. Oleh karena itu, ClassB mewarisi method tersebut dan MainPercobaan2 dapat memanggilnya. Method setX() bertindak sebagai perantara resmi untuk mengubah nilai x.

    Lokasi Penyimpanan: Nilai x tersimpan di dalam memori instans objek hitung (objek dari ClassB), pada bagian variabel yang diwarisi dari ClassA.
4. Perbandingan:

    Perbaikan A (protected): Memberikan akses langsung ke atribut bagi semua subclass dan package yang sama. Encapsulation menjadi lebih lemah karena subclass bisa mengubah variabel secara bebas tanpa validasi.

    Perbaikan B (private + getter/setter): Menjaga encapsulation tetap tinggi dan ketat. Atribut benar-benar tersembunyi dari luar dan hanya bisa diakses via method.

    Pilihan untuk Program Sungguhan: Perbaikan B (private + getter/setter).

    Alasannya: Karena memenuhi prinsip utama OOP (Data Hiding/Encapsulation). Dengan cara ini, kita dapat menambahkan logika validasi data di dalam method setter jika diperlukan, serta mencegah subclass merusak atau mengubah data secara tidak sengaja tanpa melalui kontrol class asal.
5. Atribut protected: Ya, ClassB tetap dapat mengaksesnya. Berdasarkan tabel akses, atribut protected dapat diakses oleh subclass meskipun berada di package yang berbeda.

    Atribut Default (tanpa modifier): Tidak dapat diakses. Atribut bertipe default (package-private) hanya dapat diakses oleh class-class yang berada dalam package yang sama. Jika berada di beda package, subclass tidak akan bisa mengaksesnya.

## Pertanyaan Percobaan 3 
1. Jelaskan fungsi super pada super.phi = phi; dan super.r = r; di method setSuperPhi() dan setSuperR() milik Tabung. 
2. Jelaskan fungsi super dan this pada ekspresi super.phi * super.r * super.r * this.t di method volume(). 
3. Mengapa Tabung tidak mendeklarasikan atribut phi dan r, tetapi tetap dapat mengaksesnya? Apa yang terjadi bila pada Bangun keduanya diubah menjadi private? 
4. Pada Eksperimen 1, apakah output berubah ketika super.phi diganti this.phi? Jelaskan mengapa. 
5. Pada Eksperimen 2, mengapa r, this.r, dan super.r menghasilkan nilai yang berbeda? Pada kondisi apa awalan super. menjadi wajib dipakai? 

### jawaban percobaan 3
1. Fungsi super pada setSuperPhi() dan setSuperR():
Kata kunci super digunakan untuk merujuk secara eksplisit ke atribut milik superclass (Bangun). Pada kode tersebut, super.phi = phi; dan super.r = r; berfungsi untuk mengisi variabel phi dan r yang berada di class induk (Bangun) dengan nilai dari parameter method yang dikirim.
2. super.phi dan super.r: Mengambil nilai atribut phi dan r yang diwarisi dari superclass (Bangun).

    this.t: Mengambil nilai atribut t (tinggi) yang dideklarasikan secara lokal di dalam class itu sendiri (Tabung).
3. Mengapa Tetap Bisa Mengakses: Karena Tabung melakukan inheritance (extends Bangun) dan atribut phi serta r di Bangun berakses protected. Atribut protected otomatis diwariskan dan dapat diakses oleh subclass.

    Jika Diubah Menjadi private: Akan terjadi error kompilasi (compile error). Atribut private hanya bisa diakses di dalam Bangun itu sendiri, sehingga Tabung tidak lagi memiliki akses langsung ke phi dan r.
4. Tidak, output tetap sama.

    Tabung mewarisi phi dari Bangun dan tidak mendeklarasikan ulang atribut phi di dalam dirinya (tidak ada shadowing). Oleh karena itu, this.phi dan super.phi menunjuk ke variabel yang sama di memori.
5. Penyebab Perbedaan Nilai: Hal ini terjadi karena ada Variable Shadowing (class Tabung mendeklarasikan ulang atribut r sendiri).

        r (tanpa kata kunci) merujuk ke atribut terdekat, yaitu r milik Tabung.

        this.r merujuk ke atribut r milik instans class saat ini (Tabung).

        super.r merujuk ke atribut r milik superclass (Bangun).

    Kondisi super. Wajib Dipakai: Awalan super. wajib digunakan saat terjadi shadowing (nama atribut/method di subclass sama persis dengan yang di superclass) dan kita ingin secara khusus mengakses atribut atau method milik superclass tersebut.

## Pertanyaan Percobaan 4 
1. Sebutkan class yang berperan sebagai superclass dan subclass pada percobaan ini beserta alasannya. Mengapa ClassB disebut berperan ganda? 
2. Program hanya membuat satu objek (new ClassC()), tetapi tiga baris tercetak. Jelaskan mengapa konstruktor ClassA dan ClassB ikut dijalankan. 
3. Pada Modifikasi 1, mengapa output tidak berbeda dari sebelumnya meskipun super(); ditambahkan secara eksplisit? 
4. Pada Modifikasi 2 terjadi error. Aturan apa yang dilanggar, dan mengapa Java menetapkan aturan tersebut? 
5. Tuliskan urutan proses (bernomor) yang terjadi ketika new ClassC() dieksekusi, dimulai dari pemanggilan konstruktor ClassC hingga seluruh output tercetak. 

### jawaban
1. Superclass & Subclass:

        ClassA berperan sebagai superclass dari ClassB.

        ClassB berperan sebagai subclass dari ClassA sekaligus superclass dari ClassC.

        ClassC berperan sebagai subclass dari ClassB.

    ClassB Berperan Ganda: Karena ClassB berada di tengah hierarki pewarisan bertingkat (multilevel inheritance). ClassB merupakan subclass yang mewarisi ClassA (extends ClassA), tetapi di saat yang sama juga menjadi superclass bagi ClassC (ClassC extends ClassB).
2. Saat sebuah objek dari subclass dibuat, Java wajib menginisialisasi bagian dari superclass-nya terlebih dahulu. Secara otomatis (implisit), Java akan menyisipkan perintah super() di baris pertama setiap konstruktor subclass untuk memanggil konstruktor milik superclass-nya. Panggilan ini berantai dari ClassC -> ClassB -> ClassA.
3. Karena jika pemrogram tidak menuliskan pemanggilan super() secara eksplisit di baris pertama konstruktor subclass, kompiler Java secara implisit (otomatis) tetap akan menambahkan super() tanpa argumen (konstruktor default). Menulis super(); secara eksplisit hanya memperjelas apa yang sebenarnya sudah dilakukan oleh Java secara otomatis.
4. Aturan yang Dilanggar: Pemanggilan super() harus menjadi baris/pernyataan pertama (first statement) di dalam sebuah konstruktor. Memindahkan super() ke baris setelah System.out.println(...) melanggar aturan ini sehingga menyebabkan compile-time error.

    Alasan Java: Untuk memastikan bahwa superclass (ClassB) sudah terinisialisasi secara utuh dan sempurna sebelum subclass (ClassC) mengeksekusi instruksi kodenya sendiri. Hal ini mencegah terjadinya error akibat subclass mengakses komponen milik superclass yang belum siap.
5. Program memanggil konstruktor ClassC().

    Konstruktor ClassC() memanggil super() secara otomatis untuk menjalankan konstruktor ClassB().

    Konstruktor ClassB() memanggil super() secara otomatis untuk menjalankan konstruktor ClassA().

    Konstruktor ClassA() selesai dieksekusi dan mencetak output:

    konstruktor A dijalankan

    Eksekusi kembali ke konstruktor ClassB(), yang kemudian mencetak output:

    konstruktor B dijalankan

    Eksekusi kembali ke konstruktor ClassC(), yang kemudian mencetak output:

    konstruktor C dijalankan

## Pertanyaan Percobaan 5 
1. Jelaskan fungsi super(merk, memory, cpu) pada konstruktor Desktop. Atribut apa saja yang diisi oleh baris tersebut, dan atribut apa yang diisi oleh baris berikutnya? 
2. Pada Eksperimen 1, mengapa error muncul di sini, padahal pada Percobaan 4 super() juga tidak ditulis tetapi program tetap berjalan? 
3. Method showInfo() ditulis di Komputer sekaligus di Desktop. Apa istilah untuk kondisi ini? Apa yang tercetak bila baris super.showInfo(); pada Desktop dihapus? 
4. Pada Eksperimen 2, jelaskan perbedaan hasil kompilasi dengan dan tanpa @Override. Apa manfaat menuliskan @Override? 
5. Tantangan. Buat class Workstation sebagai turunan Desktop dengan atribut gpu (String). Class ini harus menimpa showInfo() sehingga menampilkan seluruh informasi Desktop ditambah baris GPU. Ketika new Workstation(...) dibuat, konstruktor class apa saja yang terpanggil, dan dalam urutan apa? 

### jawaban percobaan 5
1. Fungsi super(merk, memory, cpu) dan Atribut yang Diisi:

    Fungsi: Memanggil konstruktor berparameter milik superclass (Komputer) untuk menginisialisasi atribut-atribut yang diwarisi.

    Atribut yang Diisi super(...): merk, kapasitasMemory, dan kecepatanCPU (dideklarasikan di Komputer).

    Atribut yang Diisi Baris Berikutnya (this.printer = printer;): Atribut printer (dideklarasikan di Desktop).
2. Pada Percobaan 4, superclass memiliki konstruktor default (tanpa parameter), sehingga Java dapat menyisipkan super() otomatis. Pada Percobaan 5, class Komputer hanya memiliki konstruktor berparameter dan tidak memiliki konstruktor default. Jika super(...) tidak ditulis secara eksplisit, Java akan mencoba memanggil super() tanpa parameter yang tidak ada di Komputer, sehingga terjadi error kompilasi.
3. Istilah: Method Overriding (penimpaan method milik superclass oleh subclass).

    Yang Tercetak Jika super.showInfo() Dihapus: Informasi Merk, Kapasitas memory, dan Kecepatan CPU tidak akan tercetak. Hanya informasi Printer : Canon yang akan tampil di konsol.
4. Perbedaan Hasil Kompilasi: Kode tetap dapat dikompilasi dan berjalan sama baik dengan maupun tanpa @Override (selama nama dan parameter method cocok).

    Manfaat Menulis @Override: Sebagai bentuk compile-time protection. Jika terjadi kesalahan ketik (typo) pada nama method atau parameternya di subclass, kompiler akan langsung memberi peringatan error. Selain itu, anotasi ini memperjelas dokumentasi kode bahwa method tersebut menimpa method milik induk.
5. <img src="Screenshot 2026-10-07 203654.png" width="50%">

    hasil output

    <img src="Screenshot 2026-10-07 203840.png" width="50%">

## Tugas 1

hasil output

<img src="Screenshot 2026-10-07 204420.png" width="50%">

### Jawaban Pertanyaan Analisis
1. Mengapa array Pegawai[] dapat menampung objek Dosen?
Diperbolehkan karena konsep Polimorfisme (Polymorphism) dan hubungan pewarisan (IS-A Relationship). Karena class Dosen adalah subclass (turunan) dari Pegawai (Dosen extends Pegawai), maka secara otomatis objek Dosen dianggap sebagai tipe Pegawai juga. Tipe acuan superclass (Pegawai) selalu dapat menampung referensi dari objek subclass-nya (Dosen).
2. Ketika printSemuaGaji() memanggil getGaji() pada objek Dosen, versi method milik class mana yang dijalankan?
Versi method milik class Dosen yang dijalankan. Hal ini terjadi karena mekanisme Dynamic Method Dispatch (Polimorfisme Runtime). Karena Dosen melakukan override terhadap method getGaji(), Java akan mengeksekusi versi method yang paling spesifik berdasarkan tipe objek asli yang disimpan di memori (runtime type), yaitu Dosen.

## Tugas 2

hasil output

<img src="Screenshot 2026-10-07 205100.png" width="50%">

### Jawaban Uji Tambahan
1. Hasil Saat Memanggil tv.pindahChannel(150):

    Nilai channelAktif tetap 20 (tidak berubah menjadi 150).   
    
    Alasannya: Pada method pindahChannel(int channel), terdapat kondisi validasi if (channel >= 1 && channel <= jumlahChannel). Karena 150 melebihi jumlah channel maksimal (jumlahChannel = 100), perintah pengubahan channel diabaikan. 
2. Mengapa channelAktif Tidak Dapat Diubah Langsung dari MainTugas2?

    Karena atribut channelAktif dideklarasikan dengan access modifier private pada class Televisi.   
    
    Sesuai aturan Encapsulation (pembungkusan data), variabel private hanya dapat diakses atau diubah dari dalam class Televisi itu sendiri. Class luar seperti MainTugas2 maupun subclass TelevisiModern tidak dapat mengubah nilainya secara langsung (tv.channelAktif = 20 akan menyebabkan compile error) dan hanya bisa mengakses/mengubahnya lewat method intermedian seperti pindahChannel() atau getChannelAktif().

## Tugas 3

hasil output

<img src="Screenshot 2026-10-07 205959.png" width="50%">

## Tugas 4
1. Perbedaan Hubungan Is-A dan Has-A

    - Is-A (Inheritance): Hubungan pewarisan di mana sebuah subclass merupakan bentuk spesifik dari superclass-nya (sebuah class "adalah sebuah" class lain). Contoh dari jobsheet: Dosen adalah sebuah Pegawai (Dosen extends Pegawai).   
    
    - Has-A (Aggregation/Composition): Hubungan kepemilikan di mana sebuah class menggunakan atau menyimpan objek dari class lain sebagai komponen/atributnya (sebuah class "memiliki" class lain). Contoh dari jobsheet: DaftarGaji memiliki kumpulan Pegawai (Pegawai[] listPegawai).
2. - Member private milik superclass tidak diwariskan secara langsung dan hanya bisa diakses oleh subclass melalui method perantara seperti getter atau setter.   

    - Member protected otomatis diwariskan dan dapat diakses secara langsung oleh subclass serta seluruh class di dalam package yang sama.   
    
    - Konstruktor tidak diwariskan ke subclass, namun konstruktor superclass harus dipanggil (baik secara otomatis maupun manual memakai perintah super()) sebagai baris/pernyataan pertama di dalam konstruktor subclass. 