package business.utils.abstracts;

import entities.Customer;

public interface Validator {
    boolean validate(Customer customer) throws Exception;
}
