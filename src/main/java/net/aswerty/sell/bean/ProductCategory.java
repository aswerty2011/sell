package net.aswerty.sell.bean;

import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * 类目
 *
 * @author PowerSun
 * @date 2017/11/14
 */
@Entity
@Data
//自动判断更新update时间配合数据库
@DynamicUpdate
@Table(name = "product_category")
public class ProductCategory {

    /** 类目id */
    @Id
    @GeneratedValue
    private Integer categoryId;
    /** 类目名称 */
    private String categoryName;
    /** 类目编号 */
    private Integer categoryType;
    /** 创建时间 */
    private Date createTime;
    /** 修改时间 */
    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
