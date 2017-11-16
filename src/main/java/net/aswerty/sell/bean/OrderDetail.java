package net.aswerty.sell.bean;

import lombok.Data;

import javax.persistence.Id;

/**
 * 订单详情
 *
 * @author SunQuan
 * @create 2017/11/16
 **/
@Data
public class OrderDetail {

    @Id
    private String detailId;

    /** 订单id */
    private String orderId;
    6-1 7min处
}
