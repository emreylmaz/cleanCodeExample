package dataAccess.abstracts;

import entities.Customer;

public interface CustomerDao {
    void add(Customer customer);
    boolean customerExists(Customer customer);
}
