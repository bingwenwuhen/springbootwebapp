package cn.com.repositories;

import cn.com.domain.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Administrator on 2016/4/12.
 */
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
