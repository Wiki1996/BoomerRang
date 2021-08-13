package com.groupproject.boomerang.controller;


import com.groupproject.boomerang.model.Response;
import com.groupproject.boomerang.model.ResponseBody.RestaurantResponse.RestaurantResponse;
import com.groupproject.boomerang.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;

@RestController
@RequestMapping("/api")
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService; // 注入servcie 真正干活的小弟

    @RequestMapping(value= "/restaurant", method = RequestMethod.GET)
    public RestaurantResponse getRestaurant(
            @RequestParam(value ="term", defaultValue = "food") String term,
            @RequestParam(value ="location", defaultValue = "New York") String location,
            @RequestParam(value ="limit", defaultValue = "5") String limit
    ) throws UnsupportedEncodingException {
      //return  restaurantService.getRestaurant(term, location, limit);
        return null;
    }

    @RequestMapping(value = "/restaurant/detail", method = RequestMethod.GET)
    public Response<String[]> getRestaurantDetail(@RequestParam(value = "restaurantId") String restaurantId) throws UnsupportedEncodingException
    {
        Response response = new Response<String[]>(){};
        response.statusCode = HttpStatus.OK.value();
        //response.body = placeService.getOpenHours(placeId);
        return response;
    }
}
