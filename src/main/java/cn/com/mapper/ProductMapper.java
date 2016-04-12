package cn.com.mapper;

import cn.com.domain.Product;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaxuan on 16/4/12.
 */
public interface ProductMapper {

    @Select("select * from product")
    List<Product> listAll();
}
