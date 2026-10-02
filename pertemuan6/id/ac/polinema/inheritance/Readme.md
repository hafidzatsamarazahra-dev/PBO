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