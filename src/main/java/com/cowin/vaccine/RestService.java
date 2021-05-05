package com.cowin.vaccine;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;




@Service
public class RestService {

    private final RestTemplate restTemplate;

    public RestService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public String  getPostsPlainJSON() {
    	String id="845401";
    	SimpleDateFormat f= new SimpleDateFormat("dd-MM-yyyy");
    	Date d= new Date();
    	String Date=f.format(d);
    	
        String url = "https://cdn-api.co-vin.in/api/v2/appointment/sessions/public/calendarByPin?pincode="+id+"&date="+Date+"&vaccine=COVAXIN";
        return this.restTemplate.getForObject(url, String.class);
    }
}
