<?php

 //Mendefinisikan Konstanta
 define('HOST','mysql.hostinger.co.id');
 define('USER','u406706332_crud');
 define('PASS','admin123');
 define('DB','u406706332_crud');

 //membuat koneksi dengan database
 $con = mysqli_connect(HOST,USER,PASS,DB) or die('Unable to Connect');
 ?>
