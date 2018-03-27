package com.androstock.newsapp;

import java.util.ArrayList;

/**
 * Created by xxm on 15/03/18.
 */


// each card contians the a hot topic
// do your algorithms here inside this class

// better using inheritance here i.e. card inherits NewsArray class
// will have to change this later
public class Card {
   private String topic;
   private Integer pic;
   private int numView;
   private MainActivity.NewsArray newslist;


    public Card(String topic, Integer pic, int numView) {
        this.topic = topic;
        this.pic = pic;
        this.numView = numView;
        MainActivity m = new MainActivity();
        MainActivity.NewsArray newslist = m.new NewsArray();

        this.newslist = newslist;

    }

    public int getNumView() {
        return numView;
    }

    public void setNumView(int numView) {
        this.numView = numView;
    }

    public Integer getPic() {
        return pic;
    }

    public void setPic(Integer pic) {
        this.pic = pic;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public MainActivity.NewsArray getNewslist() {
        return newslist;
    }
}
