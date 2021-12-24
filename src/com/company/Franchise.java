package com.company;

import java.util.ArrayList;
import java.util.List;

public class Franchise {

    private float chiffreAffaire;
    private List<Restaurant> restaurants = new ArrayList<Restaurant>();

    public void addRestaurant(Restaurant restaurant) {
        this.restaurants.add(restaurant);
        this.chiffreAffaire += restaurant.getChiffreAffaire();
    }

    public float getChiffreAffaire() {
        return this.chiffreAffaire;
    }

    public Restaurant getAtIndexRestaurant(int j) {
        return this.restaurants.get(j);
    }
}
