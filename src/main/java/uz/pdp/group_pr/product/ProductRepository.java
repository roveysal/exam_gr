package uz.pdp.group_pr.product;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepository {
    public List<Product> products = new ArrayList<Product>();

}
