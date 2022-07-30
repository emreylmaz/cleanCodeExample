package adapters;

import entities.Customer;
import entities.Person;
import services.KpsService;

public class jKPSAdapter implements  ICheckPersonService {
    @Override
    public boolean validate(Customer customer) {

        KpsService kpsService = new KpsService();
        kpsService.checkPerson(customer.getIdentityNumber(),
                customer.getFirstName(),customer.getLastName(),
                customer.getYearOfBirth());
        return true;
    }


}
