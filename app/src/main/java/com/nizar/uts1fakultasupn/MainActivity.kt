package com.nizar.uts1fakultasupn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createFac()
        rv_list_main.layoutManager = LinearLayoutManager(this)
        rv_list_main.setHasFixedSize(true)
        rv_list_main.adapter = FacAdapter(data, { onItem: FacData ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: FacData) {
        val showDetailActivityIntent = Intent(this, FacDetail::class.java)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.imgFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nameFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.descFac)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.descDet)
        startActivity(showDetailActivityIntent)
    }
    private fun createFac(): List<FacData> {
        val rvList = ArrayList<FacData>()
        rvList.add(
                FacData(
                        R.drawable.logo,
                        "Fakultas Ilmu Komputer",
                        "Fakultas Ilmu Komputer\n" +
                                "adalah satu dari dari 7\n" +
                                "program studi di UPN\n" +
                                "VETERAN JATIM",
                        "1. Teknik Informatika\n" +
                                "2. Sistem Informasi"
                )
        )
        rvList.add(
                FacData(
                        R.drawable.logo,
                        "Fakultas Teknik",
                        "Fakultas Teknik\n" +
                                "merupakan salah satu dari 7\n" +
                                "Fakultas 'Veteran' Jawa\n" +
                                "Timur. Yang terdiri dari program\n" +
                                "studi: ",
                        "1. Teknik Kimia\n" +
                                "2. Teknik Industri\n" +
                                "3. Teknik Sipil\n" +
                                "4. Teknik Lingkungan\n" +
                                "5. Teknologi Pangan"
                )
        )
        rvList.add(
                FacData(
                        R.drawable.logo,
                        "Fakultas Ekonomi dan Bisnis",
                        "Fakultas Ekonomi dan Bisnis\n" +
                                "merupakan salah satu dari 7\n" +
                                "Fakultas 'Veteran' Jawa\n" +
                                "Timur. Yang terdiri dari program\n" +
                                "studi: ",
                        "1. Ekonomi Pembangunan\n" +
                                "2. Akuntansi\n" +
                                "3. Manajemen"
                )
        )
        rvList.add(
                FacData(
                        R.drawable.logo,
                        "Fakultas Pertanian",
                        "Fakultas Pertanian\n" +
                                "merupakan salah satu dari 7\n" +
                                "Fakultas 'Veteran' Jawa\n" +
                                "Timur. Yang terdiri dari program\n" +
                                "studi: ",
                        "1. Agroteknologi\n" +
                                "2. Agribisnis"
                )
        )
        rvList.add(
                FacData(
                        R.drawable.nizar,
                        "Profile Singkat saya ",
                        "Nama : Muhammad Nizar Zulmi\n"+
                                "TTL : Surabaya,19 Agustus 1999\n" +
                                "Alamat : Jl.Ketapang Suko gang 2 Baru\n" +
                                "No.Telp : 0895632332675\n" +
                                "Email : nizarspenduta@gmail.com\n" +
                                "Github : https://github.com/NizarZulmi19",
                        "Riwayat Pendidikan:\n" +
                                "\t\t 1. SDN SUKO 363\n" +
                                "\t\t 2. SMPN 2 Taman\n" +
                                "\t\t 3. SMK Antartika 2\n\n" +
                                "Penghargaan: "
                )
        )
        return rvList
    }
}
