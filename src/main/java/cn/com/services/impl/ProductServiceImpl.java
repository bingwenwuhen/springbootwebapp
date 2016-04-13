package cn.com.services.impl;

import cn.com.domain.Product;
import cn.com.services.ProductService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2016/4/12.
 */
@Service
public class ProductServiceImpl implements ProductService {


    @Override
    public Iterable<Product> listAllProducts() {
        return null;
    }

    @Override
    public Product getProductById(Integer id) {
        return null;
    }

    @Override
    public Product saveProduct(Product product) {
        return null;
    }
}
