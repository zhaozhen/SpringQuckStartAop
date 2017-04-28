package com.aop.AspectJ;

/**
 * Created by root on 2017/4/28.
 */
public interface  ICustomerBo {
    void addCustomer();

    void deleteCustomer();

    String AddCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
