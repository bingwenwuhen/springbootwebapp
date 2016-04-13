package cn.com.services.impl;

import cn.com.domain.Product;
import cn.com.mapper.ProductMapper;
import cn.com.services.ProductService;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by Administrator on 2016/4/12.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Inject
    private ProductMapper productMapper;

    @Override
    public Iterable<Product> listAllProducts() {
        return productMapper.listAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return productMapper.getProductById(id);
    }

    @Override
    public Product saveProduct(Product product) {
        productMapper.saveProduct(product);
        return product;
    }
}
