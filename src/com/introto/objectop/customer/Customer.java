package com.introto.objectop.customer;

public class Customer {

    // state
    private String name;
    private Address homeAddress;
    private Address workAddress;

    // creating
    public Customer(String name, Address homeAddress){
        this.name = name;
        this.homeAddress = homeAddress;
    }

    // operations
    public void setName(String name){
        this.name = name;
    }
    public  void setHomeAddress(Address homeAddress){
        this.homeAddress = homeAddress;
    }
    public  void setWorkAddress(Address workAddress){
        this.workAddress = workAddress;
    }

    public String getName() {
        return name;
    }

    public Address getHomeAddress() {
        return homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", homeAddress=" + homeAddress +
                ", workAddress=" + workAddress +
                '}';
    }
}
