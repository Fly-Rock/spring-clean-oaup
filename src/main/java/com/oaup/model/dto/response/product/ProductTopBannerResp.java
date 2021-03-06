package com.oaup.model.dto.response.product;

import com.oaup.model.bo.product.ProductDetailBannerBo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * Created by lichuanjie on 2018/4/22.
 */
@Data
public class ProductTopBannerResp implements Serializable {
    private Integer moduleType;
    private String moduleName;
    private List<ProductDetailBannerBo> bannerList;
}
