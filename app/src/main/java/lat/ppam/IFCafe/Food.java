package lat.ppam.IFCafe;

import android.graphics.drawable.Drawable;

public class Food {
    String judul;
    String deskripsi;
    int harga;
    Drawable image;

    Food(String judul, String deskripsi, int harga, Drawable image) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.harga = harga;
        this.image = image;
    }
}
