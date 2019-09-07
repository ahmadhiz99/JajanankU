package com.example.localhost.jajananpasar;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class ListJajananAdapter extends RecyclerView.Adapter<ListJajananAdapter.ListViewHolder> {
    private ArrayList<Jajanan> listJajanan;




    public ListJajananAdapter(ArrayList<Jajanan> list) {
        this.listJajanan = list;
    }

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_jajanan, viewGroup, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {


        final Jajanan jajanan = listJajanan.get(position);

        Glide.with(holder.itemView.getContext())
                .load(jajanan.getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(jajanan.getNama());
        holder.tvFrom.setText(jajanan.getDetail());

        //
//        holder.tvjudulDetail.setText(jajanan.getNama());
//        holder.tvDetail.setText(jajanan.getDetail());

        //click recycle item
        holder.itemView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(), "Kamu memilih " + listJajanan.get(holder.getAdapterPosition()).getNama(), Toast.LENGTH_SHORT).show();
                Context context = v.getContext();
                Intent intent = new Intent(context, details.class);

                intent.putExtra(details.EXTRA_NAME, listJajanan.get(holder.getAdapterPosition()).getNama());
                intent.putExtra(details.EXTRA_DETAIL, listJajanan.get(holder.getAdapterPosition()).getDetail());
                intent.putExtra(details.EXTRA_FOTO, listJajanan.get(holder.getAdapterPosition()).getFoto());

//                holder.imageView.buildDrawingCache();
//                Bitmap image= holder.imageView.getDrawingCache();

//                Bundle extras = new Bundle();
//                extras.putParcelable("imagebitmap", listJajanan.get(holder.getAdapterPosition()).getFoto() );
//                intent.putExtras(extras);

              //  intent.putExtra(details.EXTRA_AGE, 5);


//                listJajanan.get(holder.getAdapterPosition()).getNama()
//                Intent ki = new Intent(holder.tvjudulDetail.setText(listJajanan.get(holder.getAdapterPosition()).getNama()), detail);
//                holder.tvjudulDetail.setText(listJajanan.get(holder.getAdapterPosition()).getNama());
//                holder.tvDetail.setText(listJajanan.get(holder.getAdapterPosition()).getDetail());
                context.startActivity(intent);

//                holder.tvjudulDetail.setText(jajanan.getNama());
//                holder.tvDetail.setText(jajanan.getDetail());




            }
        });
    }

    @Override
    public int getItemCount() {
        return listJajanan.size();
    }

    class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto, imgPhotoDetail, imageView;
        TextView tvName, tvFrom, tvDetail, tvjudulDetail;
        ListViewHolder(View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvFrom = itemView.findViewById(R.id.tv_item_from);

            //
            tvDetail = itemView.findViewById(R.id.tv_detail);
            tvjudulDetail = itemView.findViewById(R.id.tv_judulDetail);
//            imgPhotoDetail =  itemView.findViewById(R.id.img_detail);
            imageView = itemView.findViewById(R.id.img_detail);

        }
    }


}