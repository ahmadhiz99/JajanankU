package com.example.localhost.jajananpasar;

import java.util.ArrayList;

public class JajananData {
    public static String[][] data = new String[][]{
            {"Kue Lumpur", "Kue lumpur adalah jajan pasar yang termasuk penganan ringan. Bahan utamanya yaitu santan, kentang, tepung terigu, dan telur. Sebagai pewangi digunakan vanila dan seringkali diberi hiasan kismis dan kelapa muda iris di permukaannya. Kue ini tergolong dalam kue basah sehingga tidak tahan disimpan lama.", "https://upload.wikimedia.org/wikipedia/commons/2/2b/Kue_lumpur_Pj_IMG-20141226-WA0000.jpg"},
            {"Klepon", "Klepon kadang juga disebut onde-onde manis. Makanan ini terbuat dari tepung beras ketan yang dibentuk seperti bola-bola kecil dan diisi dengan gula merah lalu direbus dalam air mendidih.", "https://upload.wikimedia.org/wikipedia/commons/4/4d/Onde-onde.jpg"},
            {"Kerak Telor", "Kerak telor adalah makanan asli daerah Jakarta (Betawi). Bahan-bahan pembuatnya yaitu beras ketan putih, telur bebek, ebi (udang kering yang diasinkan) yang disangrai kering ditambah bawang merah goreng, lalu diberi bumbu yang dihaluskan berupa kelapa sangrai, cabai merah, kencur, jahe, merica butiran, garam dan gula pasir.", "https://upload.wikimedia.org/wikipedia/commons/8/8a/Kerak_Telor.jpg"},
            {"Onde-Onde", "Onde-onde terbuat dari tepung terigu, kadang juga dibuat dari tepung ketan yang digoreng atau direbus dan permukaannya ditaburi/dibalur dengan biji wijen.", "https://upload.wikimedia.org/wikipedia/commons/3/3b/Indonesia_onde-onde.jpg"},
            {"Kue Lapis", "Disebut kue lapis karena biasanya kue ini terdiri dari dua warna yang berlapis-lapis. Kue ini banyak ditemui di daerah-daerah di Indonesia. Kue ini dibuat dari tepung beras, tepung kanji, santan, gula pasir, garam dan pewarna.", "https://upload.wikimedia.org/wikipedia/commons/d/d9/Kue_lapis_-_driekleur_en_rozen.jpg"},
            {"Getuk", "Getuk berbahan utama ketela pohon atau singkong. Getuk merupakan makanan yang mudah ditemukan di Jawa Tengah dan Jawa Timur. Pembuatan getuk dimulai dari singkong di kupas kemudian kukus atau perebusan, setelah matang kemudian ditumbuk atau dihaluskan dengan cara digiling lalu diberi pemanis gula dan pewarna makanan. Untuk penghidangan biasanya ditaburi dengan parutan buah kelapa.", "https://upload.wikimedia.org/wikipedia/commons/a/af/Getuk_lindri.jpg"},
            {"Lumpia", "Lumpia dikenal sebagai makanan khas Semarang. Makanan ini berupa lembaran tipis dari tepung gandum yang dijadikan kulit lalu digunakan sebagai pembungkus isian yang dapat berupa rebung, telur, sayuran segar, daging, atau makanan laut. Makanan ini dibuat dengan cara digoreng dan biasanya disajikan bersama saus atau cabai.", "https://upload.wikimedia.org/wikipedia/commons/b/b6/Lumpia.JPG"},
            {"Kue Putu", "Kue putu merupakan kue yang berisi gula jawa dan parutan kelapa, tepung beras butiran kasar. Kue ini di kukus dengan diletakkan di dalam tabung bambu yang sedikit dipadatkan dan dijual pada saat matahari terbenam sampai larut malam. Suara khas uap yang keluar dari alat suitan ini sekaligus menjadi alat promosi bagi pedagang yang berjualan. Kebanyakan warna dari kue putu ini adalah putih dan hijau.", "https://upload.wikimedia.org/wikipedia/commons/4/4e/Kue_putu_klepon_keliling.JPG"},
            {"Lemper", "Lemper terbuat dari ketan yang dikukus dan biasanya berisi abon atau cincangan daging ayam, dan dibungkus menggunakan daun pisang. Jajanan ini terkenal di seluruh Indonesia sebagai pengganjal perut sebelum memasuki tahap makan besar.", "https://upload.wikimedia.org/wikipedia/commons/2/26/Lemper.jpg"},
            {"Wajik", "Kue wajik memiliki beberapa sebutan yang berbeda-beda di setiap tempat. Nama wajik sendiri lebih terkenal di daerah Jawa Tengah dan sekitarnya. Kue wajik di Sumatera disebut pulut manis. Wajik memiliki beberapa varian, namun yang terkenal adalah wajik ketan.", "https://upload.wikimedia.org/wikipedia/id/2/2f/Wajik-ketan.jpg"},
    };
    public static ArrayList<Jajanan> getListData(){
        ArrayList<Jajanan> list = new ArrayList<>();
        for (String[] aData : data) {
            Jajanan jajanan = new Jajanan();
            jajanan.setNama(aData[0]);
            jajanan.setDetail(aData[1]);
            jajanan.setFoto(aData[2]);
            list.add(jajanan);
        }
        return list;
    }
}
