import adapters.jKPSAdapter;
import business.concretes.CustomerManager;
import business.utils.concretes.CustomerValidator;
import dataAccess.concretes.HibernateCustomerDao;
import entities.Customer;

public class Main {
    public static void main(String[] args) throws Exception {
        Customer customer1 = new Customer();
        customer1.setFirstName("emre");
        customer1.setLastName("yılmaz");
        customer1.setCityId(35);
        customer1.setIdentityNumber("784129471241041312");

        Customer customer2 = new Customer();
        customer2.setFirstName("ata");
        customer2.setLastName("yeşilyurt");
        customer2.setCityId(34);
        customer2.setIdentityNumber("712985012851912051");

        CustomerValidator customerValidator = new CustomerValidator(new jKPSAdapter());
        CustomerManager customerManager = new CustomerManager(new HibernateCustomerDao(), customerValidator);
        customerManager.add(customer1);
        customerManager.add(customer2);


    }
}