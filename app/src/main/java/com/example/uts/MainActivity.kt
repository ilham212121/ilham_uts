package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    var data: ArrayList<DataModel>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inisialisasi Array
        data = ArrayList()

        //Simpan data

        data?.add(DataModel(R.drawable.smkanaliskesehatansurakarta,"Smk Analis Kesehatan Nasional, Surakarta","Smk Analis Kesehatan Nasional Surakarta","Smk Analis Kesehatan Nasional Surakarta " +
                "Diawali dengan penutupan Sekolah Asisten Apoteker (SAA) milik negara pada tahun 1973, \n" +
                "Sedangkan SAA swasta dibatasi dengan hanya diperbolehkan menerima 1 kelas dengan kapasitas 36 mahasiswa, maka mjncul gagasan dari Yayasan Pendidikan Farmasi Nasional (YPFN) untuk mendirikan Sekolah Analis Kesehatan. Hal ini dilakukan mengingat pada saat itu tenaga Kesehatan sangat dibutuhkan\nDiawali dengan penutupan Sekolah Asisten Apoteker (SAA) milik negara pada tahun 1973, \n" +
                "Sedangkan SAA swasta dibatasi dengan hanya diperbolehkan menerima 1 kelas dengan kapasitas 36 mahasiswa, maka mjncul gagasan dari Yayasan Pendidikan Farmasi Nasional (YPFN) untuk mendirikan Sekolah Analis Kesehatan. Hal ini dilakukan mengingat pada saat itu tenaga Kesehatan sangat dibutuhkan\n " +
                "Jurusan SMK ANALIS KESEHATAN NASIONAL, SURAKARTA :\n" +
                "-\tTeknologi Laboratorium Medik (Analis Kesehatan)\n" +
                "-\tAnalis Pengujian laboratorium\n"))

        data?.add(DataModel(R.drawable.smknegeri1magelangg,"Smk Negeri 1 Magelang","Smk Negeri 1 Magelang", "Smk Negeri 1 Magelang " +
                "SMK Negeri 1 Magelang merupakan Sekolah Kejuruan Favorit di Kota Magelang. Berdiri pada tanggal 1 Agustus 1965 berdasarkan S.P. Menteri Pendidikan dan Kebudayaan Nomor 136/Dirpt/BI/65 tanggal 8 Oktober 1965 berdiri sebuah Sekolah Teknologi dengan nama STM Negeri Magelang dengan jurusan Bangunan Gedung dan Jurusan Mesin. Tahun 1970 dikukuhkan melalui Surat Keputusan Direktur Jendral Pendidikan dengan Nomor surat 306/Set.DDT/70 tertanggal 13 April 1970.\n" +
                "Tahun 1988 lokasi sekolah dipindah dari Tuguran dan menempati lokasi baru di Jalan Cawang no:02 Jurang Ombo, Kota Magelang. Sejak berdiri SMK Negeri 1 selalu mengalami perkembangan dan pembukaan jurusan baru, diantaranya: Teknik Listrik, Teknik Otomotif, Teknik Elektronika dan Teknik Komputer.\n."))

        data?.add(DataModel(R.drawable.smknegeri1patii,"Smk Negeri 1 Pati","Smk Negeri 1 Pati", "Smk Negeri 1 Pati " +
                "Smk Negeri 1 Pati menjadi satu-satunya SMK di Pati yang menjadi terbaik versi Kemendikbud\n" +
                "\n" +
                "Jurusan Smk Negeri 1 Pati :\n" +
                "-\tAkumtansi\n" +
                "-\tAdministrasi Perkantoran\n" +
                "-\tPemasaran\n."))

        data?.add(DataModel(R.drawable.smknegeri2semarangg,"Smk Negeri 2 Semarang","Smk Negeri 2 Semarang, ", "Smk Negeri 2 Semarang"+
                "SMK Negeri 2 Semarang (dahulu SMEA 1 Semarang) berdiri pada tanggal 26 Juni 1951, berdasarkan SK Menteri Pendidikan dan Kebudayaan No. 2881 / BIII / 51 dengan nama SMEA Negeri Semarang. Pertama kali bertempat di jalan Pattimura Semarang yang sekarang ditempati SMP 6 Semarang."))

        data?.add(DataModel(R.drawable.smknegeri4surakartaa,"Smk Negeri 4 Surakarta","Smk Negeri 4 Surakarta","Smk Negeri 4 Surakarta " +
                "SMK Negeri 4 Surakarta merupakan salah satu sekolah menengah kejuruan (SMK) negeri di Kota Surakarta. Adapun pelajaran yang diberikan disesuaikan dengan jurusan SMK yang diambil. Ada juga kegiatan-kegiatan ekstrakulikuler sekolah seperti karate, basket, futsal, grup belajar dan lainnya.\n" +
                "\n" +
                "SMK Negeri 4 Surakarta memiliki staf pengajar guru yang kompeten pada bidang pelajarannya sehingga berkualitas dan menjadi salah satu SMK terbaik di Kota Surakarta. Tersedia juga berbagai fasilitas SMK seperti ruang kelas yang nyaman, laboratorium praktikum, perpustakaan, lapangan olahraga, kantin dan lainnya.\n" +
                "\n" +
                "Jurusan yang tersedia :\n" +
                "-\tAkomodasi Perhotelan\n" +
                "-\tJasa Boga\n" +
                "-\tPati Seri\n" +
                "-\tKecantikan Kulit\n" +
                "-\tKecantikan Rambut\n" +
                "-\tTata Busana\n."))

        data?.add(DataModel(R.drawable.smknegeriklaten,"smk","smk", "smk negeri 1 klaten" +
                "SMK Negeri 1 Klaten, Atau lebih Dikenal Dengan SMEA N 1 Klaten atau SMERUSAKA. SMK Negeri 1 Klaten adalah salah satu sekolah menengah kejuruan di Klaten. \n" +
                "Lebih lengkapnya berada di Jl. Dr. Wahidin Sudiro Husodo No.22, RT 02/ RW 05, Sekarsuli, Kecamatan Klaten Utara, Kabupaten Klaten, Jawa Tengah, Kode Pos 57432, Lintang -7.6954650, Bujur 110.6050830.\n" +
                "SMK Negeri 1 Klaten berdiri pada tanggal 1 Agustus 1961 dan termasuk salah satu dari 47 SMK tertua yang berada di Jawa Tengah. Bermula bernama SMEA Persiapan/Perintis kemudian berubah menjadi SMEA Negeri Klaten. Berdiri diatas tanah seluas 15.440 meter persegi.\n" +
                "Kegiatan Ekstrakurikuler antara lain Pramuka (khusus kelas X), Organisasi Siswa Intra Sekolah (OSIS), Dewan Ambalan Parang Gupita – Puspita Murti, Palang Merah Remaja (PMR), Rohani Islam (ROSSAKA). Selain itu juga , English Speaking Club (ESC)Rohani Kristen (PERSIK), Paskibra, Basket, Futsal, Sekolah Siaga Bencana (SSB).\n" +
                "\n" +
                "Terdiri dari 6 jurusan :\n" +
                "-\tTeknik Komputer Dan Jaringan (TKJ)\n" +
                "-\tKOmpetensi Keahlian Mulitemedia (MM)\n" +
                "-\tKompetensi Keahlian Produksi Dan Siaran Program Televisi (PSPT)\n" +
                "-\tKOmpetensi Keahlian Akuntansi Dan Keuangan Lembaga (AKL)\n" +
                "-\tKompetensi Keahlian Otomatisasi & Tata Kelola Perkantoran\ni."))


        //Set data to Adapter
        recyclerview.adapter = DataAdapter(data, object : DataAdapter.OnClickListener{
            override fun detail(item: DataModel?) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra("gambar", item?.gambar)
                intent.putExtra("judul", item?.judul)
                intent.putExtra("penjelasansingkat", item?.penjelasansingkat)
                intent.putExtra("keterangan", item?.keterangan)
                startActivity(intent)
                //val intent = Intent(this@MainActivity, DetailActivity::class.java)
            }
        })


    }
}