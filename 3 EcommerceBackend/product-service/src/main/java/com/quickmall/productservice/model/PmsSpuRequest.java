package com.quickmall.productservice.model;

import com.quickmall.productservice.constant.PublishStatus;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class PmsSpuRequest {

    private Long spuId;

    private Long categoryId;

    private Long brandId;

    private String brandName;

    /**
     * product publish status: ON_SALE; OUT_OF_STOCK
     */
    private PublishStatus publishStatus;

    private String spuName;

    private String spuDescription;

    private Date createTime;

    private Date updateTime;

}
