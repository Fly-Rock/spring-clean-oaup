package com.oaup.model.bo.product;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by lichuanjie on 2018/4/22.
 */
@Data
public class ProductTableRowBo implements Serializable {
    private String title;
    private String routerData;
}
