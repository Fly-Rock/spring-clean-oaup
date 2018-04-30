package com.oaup.service.impl;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Optional;
import com.google.common.collect.Lists;
import com.google.common.collect.ObjectArrays;
import com.oaup.dao.ProductDescriptionDao;
import com.oaup.model.bo.product.ProductDetailCompositiveBo;
import com.oaup.model.bo.product.ProductDetailTableBo;
import com.oaup.model.dto.request.product.ProductDetailReq;
import com.oaup.model.dto.response.product.ProductDetailResp;
import com.oaup.model.po.ProductDescription;
import com.oaup.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * Created by lichuanjie on 2018/4/22.
 */
@Service
@Slf4j
public class ProductService implements IProductService {
    @Autowired
    private ProductDescriptionDao descriptionBiz;

    public ProductDetailResp queryProductDetail(ProductDetailReq req) {
        ProductDetailResp resp = new ProductDetailResp();
        if (!Optional.fromNullable(req.getProductId()).isPresent()) {
            return resp;
        }
        List<Object> detailList = Lists.newArrayList();
        ProductDescription queryProduct = new ProductDescription();
        queryProduct.setProductId(req.getProductId());
        List<ProductDescription> productList = descriptionBiz.query(queryProduct);
        if (CollectionUtils.isEmpty(productList)) {
            return resp;
        }

        for (ProductDescription m : productList) {
            if (m.getContentStyle().equals("detail_table")) {
                log.info(m.getContent());
                ProductDetailTableBo detailTableBo = JSON.parseObject(m.getContent(), ProductDetailTableBo.class);
                detailList.add(detailTableBo);
            }
            if (m.getContentStyle().equals("detail_zonghe")) {
                log.info(m.getContent());
                ProductDetailCompositiveBo list = JSON.parseObject(m.getContent(), ProductDetailCompositiveBo.class);
                detailList.add(list);
            }
        }
        resp.setDetail(detailList);
        return resp;
    }
}

