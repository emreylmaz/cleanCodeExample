package business.concretes;

import business.abstracts.CustomerService;
import business.utils.abstracts.Validator;
import dataAccess.abstracts.CustomerDao;
import entities.Customer;

public class CustomerManager implements CustomerService {

    private CustomerDao customerDao;
    private Validator validator;


    public CustomerManager(CustomerDao customerDao, Validator validator) {
        this.customerDao = customerDao;
        this.validator = validator;
    }

    @Override
    public void add(Customer customer) throws Exception {
        this.validator.validate(customer);
        this.customerDao.add(customer);

    }

}
