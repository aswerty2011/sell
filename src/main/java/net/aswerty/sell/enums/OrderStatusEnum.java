package net.aswerty.sell.enums;

import lombok.Getter;

/**
 * 订单状态
 *
 * @author sunquan
 * @create 2017-11-16
 **/
@Getter
public enum OrderStatusEnum {
    NEW(0,"新订单"),
    FINISHED(1,"完结"),
    CANCEL(2,"已取消");

    private Integer code;
    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
