package com.example.localhost.jajananpasar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvJajanan;
    private ArrayList<Jajanan> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvJajanan = findViewById(R.id.rv_Jajananes);
        rvJajanan.setHasFixedSize(true);

        list.addAll(JajananData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvJajanan.setLayoutManager(new LinearLayoutManager(this));
        ListJajananAdapter listHeroAdapter = new ListJajananAdapter(list);
        rvJajanan.setAdapter(listHeroAdapter);
    }
}
