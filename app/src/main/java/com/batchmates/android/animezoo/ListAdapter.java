package com.batchmates.android.animezoo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Android on 6/27/2017.
 */

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    List<Anime> contactList=new ArrayList<>();

    public ListAdapter(List<Anime> contactList) {
        this.contactList = contactList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        ImageView pic;
        TextView genre;

        public ViewHolder(View itemView) {
            super(itemView);
            name=(TextView) itemView.findViewById(R.id.tvtNameAnime);
            pic=(ImageView)itemView.findViewById(R.id.animeImage);
            genre=(TextView)itemView.findViewById(R.id.tvGenre);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.anime_choices,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Anime anime=contactList.get(position);

        holder.name.setText(anime.getAnimeName());
        holder.pic.setBackgroundResource(anime.getAnimePicture());
        holder.genre.setText(anime.getAnimeGenre());

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }



}
