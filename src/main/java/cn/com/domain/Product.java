package cn.com.domain;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Created by Administrator on 2016/4/12.
 */
@Data
public class Product {

    /**
     * id
     */
    private Integer id;

    /**
     * version
     */
    private Integer version;

    /**
     * 产品id
     */
    private String productId;

    /**
     * 描述
     */
    private String description;

    /**
     * 图片地址
     */
    private String imageUrl;

    /**
     * 价钱
     */
    private BigDecimal price;

}
