/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.dto;

/**
 *
 * @author sakuni
 */
public class CustomerDto {
    private String id;
    private String name;
    private String address;
    private double salary;
    private String customerTitle;
    private String DOB;
    private String City;
     private String Province;
    private String PostalCode;

    public CustomerDto() {
    }
    
    

    public CustomerDto(String id, String name, String address, double salary, String customerTitle, String DOB, String City, String Province, String PostalCode) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.customerTitle = customerTitle;
        this.DOB = DOB;
        this.City = City;
        this.Province = Province;
        this.PostalCode = PostalCode;
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the customerTitle
     */
    public String getCustomerTitle() {
        return customerTitle;
    }

    /**
     * @param customerTitle the customerTitle to set
     */
    public void setCustomerTitle(String customerTitle) {
        this.customerTitle = customerTitle;
    }

    /**
     * @return the DOB
     */
    public String getDOB() {
        return DOB;
    }

    /**
     * @param DOB the DOB to set
     */
    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }

    /**
     * @param City the City to set
     */
    public void setCity(String City) {
        this.City = City;
    }

    /**
     * @return the Province
     */
    public String getProvince() {
        return Province;
    }

    /**
     * @param Province the Province to set
     */
    public void setProvince(String Province) {
        this.Province = Province;
    }

    /**
     * @return the PostalCode
     */
    public String getPostalCode() {
        return PostalCode;
    }

    /**
     * @param PostalCode the PostalCode to set
     */
    public void setPostalCode(String PostalCode) {
        this.PostalCode = PostalCode;
    }

    @Override
    public String toString() {
        return "CustomerDto{" + "id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + ", customerTitle=" + customerTitle + ", DOB=" + DOB + ", City=" + City + ", Province=" + Province + ", PostalCode=" + PostalCode + '}';
    }
    
   
    
}
