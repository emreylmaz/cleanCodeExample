package adapters;

import entities.Customer;
import services.KpsService;

public class jKPSAdapter {
    public  boolean personValidate(Customer customer){
        KpsService kpsService = new KpsService();
        kpsService.checkPerson(customer.getIdentityNumber(),customer.getFirstName(),customer.getLastName(),customer.getYearOfBirth());
        return true;
    }
}
