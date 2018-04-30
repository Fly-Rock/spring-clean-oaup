package com.oaup.model.bo.product;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.List;

/**
 * Created by lichuanjie on 2018/4/22.
 */
@Data
public class ProductDetailTableBo extends ProductContentBaseBo {

    @JSONField(name = "table_style")
    private String tableStyle;
    private List<ProductContentListRowTableBo> contentListRowTable;
}
