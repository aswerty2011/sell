package net.aswerty.sell.repository;

import lombok.extern.slf4j.Slf4j;
import net.aswerty.sell.bean.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

/**
 * @author admin
 * @date 2017/11/14
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() throws Exception {
        ProductCategory productCategory = repository.findOne(1);
        log.info(productCategory.toString());
    }

    @Test
    @Transactional
    public void saveTest() throws Exception {
        ProductCategory productCategory = new ProductCategory("男生最爱",4);
        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
    }

    @Test
    public void updateTest() throws Exception {
        ProductCategory productCategory = repository.findOne(2);
        productCategory.setCategoryType(3);
        repository.save(productCategory);
    }

    @Test
    public void findByCategoryTypeInTest() throws Exception {
        List<Integer> list = Arrays.asList(2, 3, 4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        Assert.assertNotEquals(0, result.size());
    }
}