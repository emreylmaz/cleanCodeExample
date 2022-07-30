package adapters;
import entities.Customer;

public interface ICheckPersonService {
    boolean validate(Customer customer);
}
