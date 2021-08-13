package com.groupproject.boomerang.model.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "itinerary")
public class Itinerary implements Serializable {

    private static final long serialVersionUID = -6571020025726257848L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private ArrayList<TouristAttractions> attractions;
    private ArrayList<Restaurant> restaurants;
    private ArrayList<Hotel> hotels;
    private User user;

    // setter
    public void setId(int id) {
        this.id = id;
    }

    public void setAttractions(ArrayList<TouristAttractions> attractions) {
        this.attractions = attractions;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public void setHotels(ArrayList<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // getter
    @Id
    public int getId() {
        return id;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public ArrayList<TouristAttractions> getAttractions() {
        return attractions;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public ArrayList<Hotel> getHotels() {
        return hotels;
    }

    public User getUser() {
        return user;
    }
}
