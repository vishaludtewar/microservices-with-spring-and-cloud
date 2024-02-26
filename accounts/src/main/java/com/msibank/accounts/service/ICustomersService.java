package com.msibank.accounts.service;

import com.msibank.accounts.dto.CustomerDetailsDto;

public interface ICustomersService {


    /**
     * @param mobileNumber - Input Mobile Number
     * @return Customer Details based on  given Number
     */
    CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}
