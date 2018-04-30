package com.oaup.controller.webapi;

import com.oaup.model.dto.request.product.ProductDetailReq;
import com.oaup.model.dto.response.DataResult;
import com.oaup.model.dto.response.product.ProductDetailResp;
import com.oaup.service.IProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by lichuanjie on 2018/4/29.
 */
@Slf4j
@Controller
@RequestMapping(value = "/cms/v1/product/")
public class ProductController {

    @Autowired
    private IProductService productService;

    @ResponseBody
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    // @SessionVerify(verifyMode = SessionVerifyMode.BOTH, autoBinder = true, allowAnonymous = false)
    public DataResult<ProductDetailResp> queryOrganizationsInfo(ProductDetailReq req) {
        return DataResult.ok(0,"",productService.queryProductDetail(req));
    }

}
