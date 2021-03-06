package com.example.sscholtz.motorental.repositories.rest;

import com.example.sscholtz.motorental.model.User;
import com.example.sscholtz.motorental.repositories.RestAPICustomerDetails;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Created by sscholtz on 2015/09/23.
 */
public class RestCustomerDetailsAPI implements RestAPICustomerDetails {

    final String BASE_URL="http://motorental-lefty93.rhcloud.com/api/";

    final HttpHeaders requestHeaders = RestMethods.getHeaders();
    final RestTemplate restTemplate = RestMethods.getRestTemplate();

    @Override
    public String customer_details(User entity) {
        final String url = BASE_URL+"customer/";
        HttpEntity<User> requestEntity = new HttpEntity<User>(entity, requestHeaders);
        try {
            ResponseEntity<String> responseEntity = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
            String result = responseEntity.getBody();
            return result;
        }catch (Exception e)
        {
            return "Exists";
        }
    }
}
