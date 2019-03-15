package com.mrenesinau.crudmysql.Class;

/**
 * Created by adipu on 07/01/2018.
 */

public class konfigurasi {

    public static final String URL_ADD = "https://mrenesinau.web.id/android/Jsoncrud/tambahPgw.php";
    public static final String URL_GET_ALL = "https://mrenesinau.web.id/android/Jsoncrud/tampilSemuaPgw.php";
    public static final String URL_GET_EMP = "https://mrenesinau.web.id/android/Jsoncrud/tampilPgw.php?id=";
    public static final String URL_UPDATE_EMP = "https://mrenesinau.web.id/android/Jsoncrud/updatePgw.php";
    public static final String URL_DELETE_EMP = "https://mrenesinau.web.id/android/Jsoncrud/hapusPgw.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_POSISI = "desg"; //desg itu variabel untuk posisi
    public static final String KEY_EMP_GAJIH = "salary"; //salary itu variabel untuk gajih

    //JSON Tags
    public static final String TAG_JSON_ARRAY = "result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_POSISI = "desg";
    public static final String TAG_GAJIH = "salary";

    //ID karyawan
    //emp itu singkatan dari Employee
    public static final String EMP_ID = "emp_id";
}