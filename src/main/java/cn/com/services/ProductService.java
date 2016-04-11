package cn.com.services;

import cn.com.domain.Product;

/**
 * Created by Administrator on 2016/4/12.
 */
public interface ProductService {

    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);
}
