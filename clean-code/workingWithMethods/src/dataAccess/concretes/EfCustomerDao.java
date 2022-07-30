package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;

public class EfCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Entityframework ile eklendi.");
    }

    @Override
    public boolean customerExists(Customer customer) {
        return false;

    }
}
