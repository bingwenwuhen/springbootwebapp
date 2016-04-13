package cn.com.mapper;

import cn.com.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by xiaxuan on 16/4/12.
 */
public interface ProductMapper {

    /**
     * 获取所有产品
     * @return
     */
    @Select("select * from product")
    List<Product> listAll();

    /**
     * 获取某一个产品
     * @param id
     * @return
     */
    @Select("select * from product where id = #{id}")
    Product getProductById(@Param("id") Integer id);

    /**
     * 保存某一个产品
     * @param product
     */
    @Insert("insert into product(version,productId,description,imageUrl,price) values(#{version},#{productId},#{description},#{imageUrl},#{price})")
    void saveProduct(Product product);
}
