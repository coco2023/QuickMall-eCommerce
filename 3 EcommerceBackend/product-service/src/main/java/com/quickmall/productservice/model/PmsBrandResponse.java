package com.quickmall.productservice.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder

public class PmsBrandResponse {

    private Long brandId;

    private String brandName;

    private String logo;

    private String description;

    private Integer showStatus;

    private String firstLetter;

    private Integer sort;

}