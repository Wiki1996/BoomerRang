package com.groupproject.boomerang.controller;

import com.groupproject.boomerang.model.Response;
import com.groupproject.boomerang.model.ResponseBody.HotelResponse.hotelResponse;
import com.groupproject.boomerang.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * 1. control search hotel

 */

@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    HotelService hotelService; // 注入servcie 真正干活的小弟

    @RequestMapping(value= "/hotel/getHotel", method = RequestMethod.GET)
    public hotelResponse getHotel(
            @RequestParam(value ="option", defaultValue = "", required = false) String[] options,
            @RequestParam(value ="partySize", defaultValue = "1") int partySize,
            @RequestParam(value ="zipcode", defaultValue = "60606") int zipCode,
            @RequestParam(value ="withPet", defaultValue = "0") int withPet,
            @RequestParam(value ="withKid", defaultValue = "0") int withKid,
//            @RequestParam(value ="departure", defaultValue = "Jan. 7, 2022")Date departureDate,
//            @RequestParam(value ="return", defaultValue = "Jan. 10, 2022")Date returnDate,
            @RequestParam(value ="type", defaultValue = "romantic") String type,
            @RequestParam(value ="city", defaultValue = "new york") String city,
            @RequestParam(value ="pagetoken", required = false ) String pageToken,
            @RequestParam(value ="limit", defaultValue = "5") String limit
    ) throws UnsupportedEncodingException {
        System.out.println("收到");
        //System.out.println(hotelService.getHotel(type , city,pageToken, limit));
        //System.out.println(hotelService.getHotel(partySize, zipcode, withPet, withKid, departureDate, returnDate, type,price, style,area, city,pageToken, limit));

        return hotelService.getHotel(type, options, partySize,withKid, withPet, zipCode, pageToken, limit);

    }


//    @RequestMapping(value = "/place/detail", method = RequestMethod.GET)
//    public Response<String[]> getPlaceDetail(@RequestParam(value = "placeId") String placeId) throws UnsupportedEncodingException
//    {
//        Response response = new Response<String[]>(){};
//        response.statusCode = HttpStatus.OK.value();
//        //response.body = placeService.getOpenHours(placeId);
//        return response;
//    }

//    @RequestMapping(value= "/hotel/swapHotel", method = RequestMethod.PUT)
//    public hotelResponse swapHotel(
//
//            @RequestParam(value ="type", defaultValue = "romantic") String type,
//            @RequestParam(value ="price", defaultValue = "budget") String price,
//            @RequestParam(value ="style", defaultValue = "family") String style,
//            @RequestParam(value ="area", defaultValue = "Manhattan") String area,
//            @RequestParam(value ="city", defaultValue = "new york") String city,
//            @RequestParam(value ="pagetoken", required = false ) String pageToken,
//            @RequestParam(value ="limit", defaultValue = "5") String limit
//    ) throws UnsupportedEncodingException {
//        System.out.println("收到");
//        System.out.println(hotelService.getHotel(partySize, zipcode, withPet, withKid, departureDate, returnDate, type,price, style,area, city,pageToken, limit));
//
//        return hotelService.getHotel(partySize, zipcode, withPet, withKid, departureDate, returnDate, type,price, style,area, city,pageToken, limit);
//
//    }


//    @RequestMapping(value= "/hotel/getHotel", method = RequestMethod.GET)
//    public hotelResponse getHotel(
//            @RequestParam(value ="partySize", defaultValue = "3") int partySize,
//            @RequestParam(value ="zipcode", defaultValue = "60606") int zipcode,
//            @RequestParam(value ="withPet", defaultValue = "0") int withPet,
//            @RequestParam(value ="withKid", defaultValue = "0") int withKid,
//            @RequestParam(value ="departure", defaultValue = "Jan. 7, 2022") String departureDate,
//            @RequestParam(value ="return", defaultValue = "Jan. 10, 2022") String returnDate,
//            @RequestParam(value ="type", defaultValue = "romantic") String type,
//            @RequestParam(value ="price", defaultValue = "budget") String price,
//            @RequestParam(value ="style", defaultValue = "family") String style,
//            @RequestParam(value ="area", defaultValue = "Manhattan") String area,
//            @RequestParam(value ="city", defaultValue = "new york") String city,
//            @RequestParam(value ="pagetoken", required = false ) String pageToken,
//            @RequestParam(value ="limit", defaultValue = "5") String limit
//    ) throws UnsupportedEncodingException {
//        System.out.println("收到");
//        System.out.println(hotelService.getHotel(partySize, zipcode, withPet, withKid, departureDate, returnDate, type,price, style,area, city,pageToken, limit));
//
//        return hotelService.getHotel(partySize, zipcode, withPet, withKid, departureDate, returnDate, type,price, style,area, city,pageToken, limit);
//
//    }
}
