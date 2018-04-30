package com.oaup.service;


import com.oaup.model.dto.request.product.ProductDetailReq;
import com.oaup.model.dto.response.product.ProductDetailResp;

/**
 * Created by lichuanjie on 2018/4/22.
 */
public interface IProductService {
    ProductDetailResp queryProductDetail(ProductDetailReq req);
}
