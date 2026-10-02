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