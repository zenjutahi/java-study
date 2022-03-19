package com.introto.objectop.customer;

import com.introto.objectop.objectop2.Fan;

public class CustomerRunner {
    public static void main(String[] args) {

        Address homeAddress = new Address("099714990", "Nairobi", "0001-01");
        Customer customer = new Customer("Zenj", homeAddress);
        System.out.println(customer);

        Address workAddress = new Address("77891245", "Karatina", "0001-12");
        customer.setWorkAddress(workAddress);
        System.out.println(customer);

    }
}
