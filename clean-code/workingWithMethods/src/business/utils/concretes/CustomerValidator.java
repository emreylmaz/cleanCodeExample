package business.utils.concretes;

import business.utils.abstracts.Validator;
import entities.Customer;
import adapters.jKPSAdapter;
import entities.Person;

public class CustomerValidator implements Validator {


    private jKPSAdapter kpsAdapter;

    public CustomerValidator(jKPSAdapter kpsAdapter) {
        this.kpsAdapter = kpsAdapter;
    }

    @Override
    public boolean validate(Customer customer) throws Exception {

        validateFirstNameIfEmpty(customer);
        validateFirstNameLength(customer);
        validateLastNameIfEmpty(customer);
        validateIdentityNumberIfEmpty(customer);
        kpsAdapter.validate(customer);



        return true;
    }



    private void validateFirstNameIfEmpty(Customer customer) throws Exception
    {
        if (String.valueOf(customer.getFirstName()).isEmpty()
        )
        {
            throw new Exception("Validasyon hatası oldu!");
        }
    }

    private void validateLastNameIfEmpty(Customer customer) throws Exception
    {
        if (String.valueOf(customer.getLastName()).isEmpty()
        )
        {
            throw new Exception("Validasyon hatası oldu!");
        }
    }

    private void validateIdentityNumberIfEmpty(Customer customer) throws Exception
    {
        if (String.valueOf(customer.getIdentityNumber()).isEmpty()
        )
        {
            throw new Exception("Validasyon hatası oldu!");
        }
    }
    private void validateFirstNameLength(Customer customer) throws Exception
    {
        if (String.valueOf(customer.getFirstName()).length()<2)
        {
            throw new Exception("Validasyon hatası oldu!");
        }
    }
}
