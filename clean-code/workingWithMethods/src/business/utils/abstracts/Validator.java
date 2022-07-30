package business.utils.abstracts;

import entities.Customer;
import entities.Person;

public interface Validator {
    boolean validate(Customer customer) throws Exception;
}
