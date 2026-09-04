# Pengantar Konsep Pemrograman Berorientasi Objek

<h4>Nama : Hafidza Tsamara Z.<br>
NIM : 254107020034<br>
Kelas : TI-2G<br>
Repository [link] : https://github.com/hafidzatsamarazahra-dev/PBO.git <h4>

## Hasil percobaan 1
<img src="Screenshot 2026-08-28 100313.png" width="50%">

## Hasil percobaan 2
<img src="Screenshot 2026-08-28 100921.png" width="50%">

## Pertanyan
1. Jelaskan perbedaan antara object dengan class!
2. Jelaskan alasan gear dan brand dapat menjadi atribut dari object Bike!
3. Sebutkan salah satu kelebihan utama dari pemrograman berorientasi objek dibandingkan
dengan pemrograman prosedural!
4. Apakah diperbolehkan melakukan pendefinisian dua buah atribut dalam satu baris kode seperti
“public String nama, alamat;”?
5. Pada class RoadBike, jelaskan alasan atribut brand, speed, dan gear tidak lagi ditulis di dalam
class tersebut! 

### Jawaban
1. Class adalah blueprint atau rancangan yang digunakan untuk membuat object. Sedangkan object adalah hasil atau bentuk nyata dari class yang memiliki atribut dan dapat menjalankan method.
2. Karena gear dan brand merupakan informasi yang dimiliki oleh sebuah sepeda. Pada class Bike, brand digunakan untuk menyimpan merek sepeda, sedangkan gear digunakan untuk menyimpan posisi gigi sepeda. Jadi, keduanya cocok dijadikan atribut dari object Bike.
3. Salah satu kelebihannya adalah kode dapat digunakan kembali melalui konsep seperti inheritance. Contohnya pada program ini, class RoadBike bisa menggunakan atribut dan method yang ada di class Bike tanpa harus menulisnya ulang.
4. Ya boleh. Dua atribut dengan tipe data yang sama bisa ditulis dalam satu baris. Contohnya 

        public String nama,alamat; 

    sama seperti menuliskan 

        public String nama;
        public String alamat; 

    secara terpisah.
5. Karena RoadBike merupakan turunan dari class Bike dengan menggunakan extends Bike. Jadi, RoadBike bisa menggunakan method dari Bike, seperti setBrand(), speedAcceleration(), gearChanges(), dan printInfo(). Atribut brand, speed, dan gear juga berasal dari class Bike, sehingga tidak perlu dibuat ulang di RoadBike.

## Tugas Praktikum

### objek yang dipilih
1. Handphone

<img src="hp.jpeg" width="50%">

2. Tas

<img src="tas.jpeg" width="50%">

3. Pulpen

<img src="pulpen.jpeg" width="50%">

4. Pensil

<img src="pensil.jpeg" width="50%">

### class HP.java

<img src="classHP.png" width="50%">

### class tas.java

<img src="classTas.png" width="50%">

### class alatTulis.java

<img src="classAlatTulis.png" width="50%">

### class pensil.java

<img src="classPensil.png" width="50%">

### class pulpen.java

<img src="classPulpen.png" width="50%">

### class demo.java

<img src="classDemo.png" width="50%">

<img src="ClassDemo (2).png" width="50%">

### Hasil output

<img src="hasilOutput.png" width="50%">