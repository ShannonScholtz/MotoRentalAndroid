package com.example.sscholtz.motorental.services.Impl;

import com.example.sscholtz.motorental.model.User;
import com.example.sscholtz.motorental.repositories.rest.RestCustomerDetailsAPI;

/**
 * Created by sscholtz on 2015/09/23.
 */
public class CustomerDetailsServiceImpl implements CustomerDetailsService  {
    final RestCustomerDetailsAPI rest = new RestCustomerDetailsAPI();

    @Override
    public String customer_details(User entity)
    {
        return rest.customer_details(entity);
    }
}
