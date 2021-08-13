package com.groupproject.boomerang.service;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupproject.boomerang.Constants;
import com.groupproject.boomerang.model.ResponseBody.RestaurantResponse.RestaurantResponse;
import com.groupproject.boomerang.model.ResponseBody.RestaurantResponse.RestaurantResponseBody;
import com.groupproject.boomerang.model.ResponseBody.YelpTextSearchAPIResponse.YelpTextSearchResponse;
import com.groupproject.boomerang.model.ResponseBody.YelpTextSearchAPIResponse.YelpTextSearchResult;
import com.groupproject.boomerang.model.entity.Restaurant;
import com.groupproject.boomerang.utils.BoomerangException;
import com.groupproject.boomerang.utils.HTTPRequest;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

@Service
public class RestaurantService {

    private static final String Get_Recommended_Restaurant = "https://api.yelp.com/v3/businesses/search?term=%s&location=%s";

    public void getRestaurant (String term, String location, String limit) throws UnsupportedEncodingException {
        //RestaurantResponse restaurantResponse = new RestaurantResponse();

        term  = encode(term);
        location = encode(location);
        String url = String.format(Get_Recommended_Restaurant, term, location);
        System.out.println("This url is " + url);
        HttpGet httpGet = new HttpGet(url);
        httpGet.setHeader("Authorization", Constants.Yelp_API_Key);


        int limitCount =Integer.parseInt(limit);


        System.out.println("This url is " + url);




        CloseableHttpClient httpclient = HttpClients.createDefault();
        //ObjectMapper mapper = new ObjectMapper();

        ResponseHandler<String> responseHandler = response -> {
            int responseCode = response.getStatusLine().getStatusCode();
            if (responseCode != 200) {
                System.out.println("Response status: " + response.getStatusLine().getReasonPhrase());
                throw new BoomerangException("Failed to get result from Twitch API");
            }
            HttpEntity entity = response.getEntity();
            if (entity == null) {
                throw new BoomerangException("Failed to get result from Twitch API");
            }
            System.out.println(EntityUtils.toString(entity));
            //JSONObject object = new JSONObject(EntityUtils.toString(entity));
//            JSONPObject obj = new JSONObject(EntityUtils.toString(entity));
//            return obj.getJSONArray("data").toString();

            return null;
        };

        try {
            HttpGet request = new HttpGet(url);

            httpclient.execute(request, responseHandler);

            // return             httpclient.execute(request, responseHandler);
        } catch (IOException e) {
            e.printStackTrace();
            throw new BoomerangException("Failed to get result from Twitch API");
        } finally {
            try {
                httpclient.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




//        YelpTextSearchResponse yelpTextSearchResponse = requestHelper.makeRequest(YelpTextSearchResponse.class, url, new YelpTextSearchResponse());
//        System.out.println("This response is " + yelpTextSearchResponse);
//
//        System.out.println("The result is" + yelpTextSearchResponse.results[0].name);
//
//        if (yelpTextSearchResponse == null) {
//            restaurantResponse.statusCode = HttpStatus.SC_INTERNAL_SERVER_ERROR;
//            return restaurantResponse;
//        }
//        System.out.println("The result is" + yelpTextSearchResponse.results[0].name);

//        RestaurantResponseBody body = new RestaurantResponseBody();
//
//        YelpTextSearchResult[] results = yelpTextSearchResponse.results;
//        limitCount = Math.min(limitCount, results.length);
//        Restaurant[] frontEndResults = new Restaurant[limitCount];
//
//
//        for(int i = 0; i < limitCount; i++) {
//            YelpTextSearchResult result = results[i];
//            Restaurant eachFrontEndNeeds = new Restaurant();
//
//            eachFrontEndNeeds.coordinate = result.coordinate;
//            eachFrontEndNeeds.name = result.name;
//            eachFrontEndNeeds.restaurant_id = result.restaurantID;
//            eachFrontEndNeeds.rating = result.rating;
//            eachFrontEndNeeds.review_count = result.reviewCount;
//            eachFrontEndNeeds.is_closed = result.isClosed;
//
//            frontEndResults[i] = eachFrontEndNeeds;
//        }
//
//        body.result = frontEndResults;
//        restaurantResponse.responsebody = body;
//        restaurantResponse.statusCode = HttpStatus.SC_OK;
        //System.out.println("This url is " + url);
        //CloseableHttpClient httpclient = HttpClients.createDefault();
        //ObjectMapper mapper = new ObjectMapper();

        //return restaurantResponse;
        //return null;

    }


    private String encode(String param) throws UnsupportedEncodingException
    {
        return URLEncoder.encode(param, "UTF-8");
    }
}
