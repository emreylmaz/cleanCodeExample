package dataAccess.concretes;

import dataAccess.abstracts.CustomerDao;
import entities.Customer;

public class HibernateCustomerDao implements CustomerDao {
    @Override
    public void add(Customer customer) {
        System.out.println("Hibernate ile eklendi: " + customer.getFirstName());
    }

    @Override
    public boolean customerExists(Customer customer) {
        return true;
    }
}
