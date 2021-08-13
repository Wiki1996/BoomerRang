package com.groupproject.boomerang.model.entity;

// Entity  if need Hibernate framework

import com.groupproject.boomerang.model.GoogleCoordinate;

/**
 * hotel entity and its functions
 */

public class Hotel {


    public long hotelId;
    public String name;
    public String formatted_address;
    //public Double price;
    //public String phoneNumber;
    //public String review;
    //public String website;
    //public String checkInTime;
    //public String checkOutTime;
    public GoogleCoordinate location;
    public String photo_reference;

    public String business_status;
    //public Double lat;
    //public Double lng;
    //public String types;
    //public String city;
    //public String pageToken;
    //public Boolean openNow;
    public String place_id;
    public float rating;
    public int user_ratings_total;

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return formatted_address;
    }

    public void setAddress(String address) {
        this.formatted_address = address;
    }
//
//    public Double getPrice() {
//        return price;
//    }
//
//    public void setPrice(Double price) {
//        this.price = price;
//    }
//
//    public String getPhoneNumber() {
//        return phoneNumber;
//    }
//
//    public void setPhoneNumber(String phoneNumber) {
//        this.phoneNumber = phoneNumber;
//    }
//
//    public String getReview() {
//        return review;
//    }
//
//    public void setReview(String review) {
//        this.review = review;
//    }
//
//    public String getWebsite() {
//        return website;
//    }
//
//    public void setWebsite(String website) {
//        this.website = website;
//    }
//
//    public String getCheckInTime() {
//        return checkInTime;
//    }
//
//    public void setCheckInTime(String checkInTime) {
//        this.checkInTime = checkInTime;
//    }
//
//    public String getCheckOutTime() {
//        return checkOutTime;
//    }
//
//    public void setCheckOutTime(String checkOutTime) {
//        this.checkOutTime = checkOutTime;
//    }

    public String getBusiness_status() {
        return business_status;
    }

    public void setBusiness_status(String business_status) {
        this.business_status = business_status;
    }

//    public Double getLat() {
//        return lat;
//    }
//
//    public void setLat(Double lat) {
//        this.lat = lat;
//    }
//
//    public Double getLng() {
//        return lng;
//    }
//
//    public void setLng(Double lng) {
//        this.lng = lng;
//    }
//
//    public String getTypes() {
//        return types;
//    }
//
//    public void setTypes(String types) {
//        this.types = types;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getPageToken() {
//        return pageToken;
//    }
//
//    public void setPageToken(String pageToken) {
//        this.pageToken = pageToken;
//    }
//
//    public Boolean getOpenNow() {
//        return openNow;
//    }
//
//    public void setOpenNow(Boolean openNow) {
//        this.openNow = openNow;
//    }

    public String getPlaceId() {
        return place_id;
    }

    public void setPlaceId(String placeId) {
        this.place_id = placeId;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getUser_ratings_total() {
        return user_ratings_total;
    }

    public void setUser_ratings_total(int user_ratings_total) {
        this.user_ratings_total = user_ratings_total;
    }

//    <result>
//    <name>Millennium Knickerbocker Hotel Chicago</name>
//        <type>lodging</type>
//        <type>point_of_interest</type>
//        <type>establishment</type>
//        <formatted_address>163 E Walton Pl, Chicago, IL 60611, United States</formatted_address>
//        <geometry>
//            <location>
//                <lat>41.8998058</lat>
//                <lng>-87.6226078</lng>
//            </location>
//            <viewport>
//                <southwest>
//                    <lat>41.8985664</lat>
//                    <lng>-87.6240136</lng>
//                </southwest>
//                <northeast>
//                    <lat>41.9012661</lat>
//                    <lng>-87.6213139</lng>
//                </northeast>
//            </viewport>
//        </geometry>
//        <rating>4.0</rating>
//        <icon>https://maps.gstatic.com/mapfiles/place_api/icons/v1/png_71/lodging-71.png</icon>
//        <reference>ChIJm7gkHFTTD4gRJuVzxWP95u4</reference>
//        <opening_hours>
//            <open_now>true</open_now>
//        </opening_hours>
//        <photo>
//            <photo_reference>Aap_uEBCFDJYp-K_zE7jJYGtwJpHaUAOeNr5nuqECJlkaHTxDHom_7lUD_qgJedxMZeejvxTTymi1tPDw3Vht7sdcVoX-XWbXBrBZT2qH5YZhmXB3i6zQfOa2qCn2TSzFwgszbaA_Dn-mA-y-8dBBDnmuQJkYOuZgwu7Apl5lpaKIhrE6KSH</photo_reference>
//            <width>1024</width>
//            <height>576</height>
//            <html_attribution>&lt;a href=&quot;https://maps.google.com/maps/contrib/101274922578469854089&quot;&gt;Millennium Knickerbocker Hotel Chicago&lt;/a&gt;</html_attribution>
//        </photo>
//        <user_ratings_total>1839</user_ratings_total>
//        <place_id>ChIJm7gkHFTTD4gRJuVzxWP95u4</place_id>
//        <plus_code>
//            <global_code>86HJV9XG+WX</global_code>
//            <compound_code>V9XG+WX Chicago, Illinois</compound_code>
//        </plus_code>
//        <icon_background_color>#909CE1</icon_background_color>
//        <business_status>OPERATIONAL</business_status>
//        <icon_mask_base_uri>https://maps.gstatic.com/mapfiles/place_api/icons/v2/hotel_pinlet</icon_mask_base_uri>
//    </result>


}
