package com.introto.objectop.blog;

public class Rating {
    private int id;
    private String description;
    private int rating;

    public Rating(int id, String description, int rating) {
        this.id = id;
        this.description = description;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Rating{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", rating=" + rating +
                '}';
    }
}
