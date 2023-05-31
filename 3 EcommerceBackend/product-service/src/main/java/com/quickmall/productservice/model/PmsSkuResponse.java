package com.quickmall.productservice.model;

import com.quickmall.productservice.constant.ApprovedStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class PmsSkuResponse {

    private Long skuId;

    private String skuName;

    private Long spuId;

    private Long brandId;

    private Long categoryId;

    private BigDecimal price;

    private Long saleCount;

    /**
     * the stock number of sku product
     * new skuStock = old skuStock - sales
     */
    private Integer skuStock;

    private String skuDefaultImage;

    private String skuTitle;

    private String skuSubTitle;

    private String skuDescription;

    private Date createTime;

}
