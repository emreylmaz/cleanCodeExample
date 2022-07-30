package business.utils.concretes;

import business.utils.abstracts.Validator;
import dataAccess.abstracts.CustomerDao;
import entities.Customer;

public class CustomerValidator implements Validator {




    //biz validator içerisinde neden dao istiyoruz ki olmaması lazım
    //buradaki methodların farklı olması lazım dao olmadan
    @Override
    public boolean validate(Customer customer) throws Exception {

        validateFirstNameIfEmpty(customer);
        validateFirstNameLength(customer);
        validateLastNameIfEmpty(customer);
        validateIdentityNumberIfEmpty(customer);

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
