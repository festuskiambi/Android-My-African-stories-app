package com.example.festus.myafricanstories;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.internal.widget.AdapterViewCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import static  android.support.v7.widget.RecyclerView.*;


    public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonViewHolder> {

        List<Storyitems> stories;
        public  class PersonViewHolder extends ViewHolder {
            CardView cv;
            TextView textView;
            TextView textView2;
            ImageView imageView;

            PersonViewHolder(View itemView) {
                super(itemView);
                cv = (CardView) itemView.findViewById(R.id.cv);
                textView = (TextView) itemView.findViewById(R.id.textView);
                textView2 = (TextView) itemView.findViewById(R.id.textView2);
                imageView = (ImageView) itemView.findViewById(R.id.imageView);



            }
        }



        RVAdapter(List<Storyitems> stories) {
            this.stories = stories;

        }

        @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
        }


        @Override
        public RVAdapter.PersonViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

            View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, viewGroup, false);
            PersonViewHolder pvh = new PersonViewHolder(v);



            return pvh;
        }

        @Override
        public void onBindViewHolder(RVAdapter.PersonViewHolder holder, int i) {

            holder.textView.setText(stories.get(i).title);
            holder.textView2.setText(stories.get(i).introduction);
            holder.imageView.setImageResource(stories.get(i).imageId);
        final Context   context=  holder.cv.getContext();
            final String name = String.valueOf(i);
            holder.cv.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(final View v) {

                    Toast.makeText(context,"you selected cardview at index:"+ name, Toast.LENGTH_SHORT).show();

                }
            });
        }




        @Override
        public int getItemCount() {
            return stories.size();
        }
    }

