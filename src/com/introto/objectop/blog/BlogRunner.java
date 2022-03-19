package com.introto.objectop.blog;

import com.introto.objectop.customer.Address;
import com.introto.objectop.customer.Customer;

public class BlogRunner {
    public static void main(String[] args) {
        Blog blog = new Blog(110, "Why Should you Save", "Zenjy");
        System.out.println(blog);

        Rating rating = new Rating(12, "Very educative", 5);
        blog.addRating(rating);
        System.out.println(blog);

        Rating rating2 = new Rating(13, "I'm impressed", 5);
        blog.addRating(rating2);
        System.out.println(blog);
    }
}
