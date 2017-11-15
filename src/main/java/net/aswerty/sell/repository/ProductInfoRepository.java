package net.aswerty.sell.repository;

import net.aswerty.sell.bean.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品
 *
 * @author PowerSun
 * @date 2017/11/14
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
