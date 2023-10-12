package br.com.rcurvo.dao;

import br.com.rcurvo.dao.generic.GenericDAO;
import br.com.rcurvo.domain.Product;

public class ProductDAO  extends GenericDAO<Product, Long> implements IProductDAO {
    public ProductDAO() {
        super(Product.class);
    }
}
