package com.introto.objectop.blog;

import java.util.ArrayList;

public class Blog {
    // state
    private int id;
    private String name;
    private String author;
    private ArrayList<Rating> rating = new ArrayList<>();

    // create
    public Blog(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    // actions

    public void addRating(Rating rating){
        this.rating.add(rating);
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", rating=" + rating +
                '}';
    }
}
