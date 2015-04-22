import com.example.festus.myafricanstories.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by festus on 4/22/15.
 */
public class Storyitems {
    String title;
    String introduction;
    int imageId;

    public void storyItems(String title, String introduction, int imageId) {
      this.title=title;
      this.introduction=introduction;
      this.imageId=imageId;
    }
    private List<Storyitems> stories;

    // This method creates an ArrayList that has three Person objects
// Checkout the project associated with this tutorial on Github if
// you want to use the same images.
    private void initializeData(){
        stories = new ArrayList<>();
        stories.add(new Storyitems("Emma Wilson", "23 years old", R.drawable.emma));
        stories.add(new Storyitems("Lavery Maiss", "25 years old", R.drawable.lavery));
        stories.add(new Storyitems("Lillie Watts", "35 years old", R.drawable.lillie));
    }
}