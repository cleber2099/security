package com.spring.security.costumer;


import java.util.List;
import java.util.Optional;

public interface CustomerDao {
    List<Customer> selectAllCustomers();
    Optional<Customer> selectCustomerById(Integer customerId);
    Optional<Customer> getReferenceById(Integer customerId);
    void insertCustomer(Customer customer);
    boolean existsCustomerWithEmail(String email);
    boolean existsCustomerById(Integer customerId);
    void deleteCustomerById(Integer customerId);
    void updateCustomer(Customer update);
    Optional<Customer> selectUserByEmail(String email);
    //void updateCustomerProfileImageId(String profileImageId, Integer customerId);
}