package com.oaup.dao;



import com.oaup.model.po.ProductDescription;

import java.util.List;

public interface ProductDescriptionDao {

	int insert(ProductDescription object);
    
    int insertBatch(List<ProductDescription> objects);  
      
    ProductDescription load(Long id);  
      
    int update(ProductDescription object);  
      
    int delete(Long id);  
    
    int deleteBatch(List<ProductDescription> objects);  
    
    List<ProductDescription> query(ProductDescription object);
    
}