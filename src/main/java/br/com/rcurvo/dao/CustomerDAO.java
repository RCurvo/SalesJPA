package br.com.rcurvo.dao;

import br.com.rcurvo.dao.generic.GenericDAO;
import br.com.rcurvo.domain.Customer;

public class CustomerDAO extends GenericDAO<Customer, Long> implements ICustomerDAO {

    public CustomerDAO(){
        super(Customer.class);
    }

}
