package com.example.festus.myafricanstories;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class recylerview extends Activity {

    private RecyclerView rv;
    private ArrayList<Storyitems> stories;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recylerview);
        rv=(RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);


        initializeData();
        initializeAdapter();
    }

    private void initializeAdapter() {
        RVAdapter adapter;
        adapter = new RVAdapter(stories );
        rv.setAdapter(adapter);
    }


    private void initializeData() {
        stories = new ArrayList<>();
            stories.add(new Storyitems("The tortoise", "This story is about ...", R.drawable.img2));
        stories.add(new Storyitems("The three sisters", "IN the village of Kinga there ...", R.drawable.img3));
        stories.add(new Storyitems("Cinderella", "A story is told of a fare lady ...", R.drawable.img4));
        stories.add(new Storyitems("The tortoise", "This story is about ...", R.drawable.img2));
        stories.add(new Storyitems("The three sisters", "IN the village of Kinga there ..", R.drawable.img3));
        stories.add(new Storyitems("Cinderella", "A story is told of a fare lady ...", R.drawable.img4));

        stories.add(new Storyitems("The tortoise", "This story is about ...", R.drawable.img2));
        stories.add(new Storyitems("The three sisters", "IN the village of Kinga there ..", R.drawable.img3));
        stories.add(new Storyitems("Cinderella", "A story is told of a fare lady ...", R.drawable.img4));

        stories.add(new Storyitems("The tortoise", "This story is about ...", R.drawable.img2));
        stories.add(new Storyitems("The three sisters", "IN the village of Kinga there ..", R.drawable.img3));
        stories.add(new Storyitems("Cinderella", "A story is told of a fare lady ...", R.drawable.img4));
        }
        



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_recylerview, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
