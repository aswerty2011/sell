package net.aswerty.sell.service;

import net.aswerty.sell.bean.ProductCategory;

import java.util.List;

/**
 * 类目
 *
 * @author PowerSun
 * @date 2017/11/14
 */
public interface ProductCategoryService {

    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);
}
