package com.example.localhost.jajananpasar;

import android.app.Activity;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.support.v7.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.squareup.picasso.Picasso;

public class details extends AppCompatActivity {

    public static final String EXTRA_AGE = "extra_age";
    public static final String EXTRA_NAME = "extra_name";
    public static final String EXTRA_DETAIL = "extra_detail";
    public static final String EXTRA_FOTO = "extra_foto";

    private TextView tvJudul, tvDetail;
    private ImageView imgFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        tvJudul = findViewById(R.id.tv_judulDetail);
        tvDetail = findViewById(R.id.tv_detail);
        imgFoto = findViewById(R.id.img_detail);

        //judul
        String name = getIntent().getStringExtra(EXTRA_NAME);
       // int age = getIntent().getIntExtra(EXTRA_AGE, 0);
        String textjudul = name ;
        tvJudul.setText(textjudul);

        //detail
        String detail = getIntent().getStringExtra(EXTRA_DETAIL);
        String textdetail = detail ;
        tvDetail.setText(textdetail);

        //foto
        String foto = getIntent().getStringExtra(EXTRA_FOTO);
        String imgfoto = foto ;

//        for (imgfoto == jajanan.){

//        }
//        imgFoto.setTex

//        Bundle extras = getIntent().getExtras();
//        Bitmap bmp = (Bitmap) extras.getParcelable("imagebitmap");

//        imgFoto.setImageBitmap(imgfoto);


        Glide.with(this)
                .load(imgfoto)
//                .apply(new RequestOptions().override(55, 55))
                .into(imgFoto);


       // Picasso.with(details.this).load(imgfoto).into(imgFoto);

    }
}