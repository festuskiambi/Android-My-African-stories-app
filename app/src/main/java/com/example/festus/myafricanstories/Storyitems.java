package com.example.festus.myafricanstories;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by festus on 4/22/15.
 */
public class Storyitems {
    String title;
    String introduction;
    int imageId;

    Storyitems(String title, String introduction, int imageId) {
        this.title = title;
        this.introduction = introduction;
        this.imageId = imageId;

    }

    private List<Storyitems> stories;

    private void initializeAdapter() {
        stories = new ArrayList<>();
        stories.add(new Storyitems("mystory", "this story", R.drawable.images));
        stories.add(new Storyitems("mystory", "this story", R.drawable.images));
        stories.add(new Storyitems("Lillie Watts", "35 years old", R.drawable.images));
    }
}
