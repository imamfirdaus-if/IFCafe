package lat.ppam.IFCafe;

import android.content.Context;

import java.util.ArrayList;

import IFCafe.R;

public class FoodData {
    public static ArrayList<Food> getData(Context context) {
        ArrayList<Food> list = new ArrayList<Food>();
        list.add(new Food("Americano",
                "" + "Kopi ini merupakan campuran dari kopi espresso yang ditambahkan dengan air panas lagi. Awal mula terbentuk kopi Americano adalah saat warga Amerika ingin menikmati espresso yang tidak terlalu kental dan pekat sehingga mereka menambahkan air panas ke dalam espresso. Rasanya tetap pahit tanpa ada tambahan gila dan krimer.",
                25000,
                context.getDrawable(R.drawable.americano)));

        list.add(new Food("cappucino",
                "Untuk kamu yang tidak terlalu suka dengan kopi yang terlalu pahit dan kental, kamu bisa mencoba kopi jenis ini. Cappucino merupakan campuran antara espresso, susu dan busa susu. Tekstur yang dimiliki cappucino ini juga halus dan memiliki rasa sedikit manis.",
                15000,
                context.getDrawable(R.drawable.cappucino)));

        list.add(new Food("Espresso",
                "Kopi ini merupakan kopi hitam yang aromanya sangat kuat dan pekat. Kopi ini dihasilkan dari ekstrak biji kopi yang telah digiling. Secangkir espresso ini bisa kamu nikmati dengan menekan bubuk kopinya di dalam portafilter. Espresso juga disebut dengan 'shot' karena penyajiannya murni dari seduhan kopi giling dan air yang mendidih tanpa ada tambahan susu, pemanis ataupun krimer.",
                20000,
                context.getDrawable(R.drawable.espresso)));

        list.add(new Food("Latte",
                "Perlu diingat jika latte dengan cappucino itu jenis kopi yang berbeda. Komposisi kopi dan susu pada latte yaitu 3:1 dan lapisan busa susunya pun lebih tipis. Cocok untuk kamu yang ingin mencoba kopi dengan rasa yang manis.\n",
                20000,
                context.getDrawable(R.drawable.latte)));
        return list;
    }
}
