package net.aswerty.sell.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 *
 * @author PowerSun
 * @date 2017/11/14
 */
@Data
public class ResultVO<T> {

    /** 错误码*/
    private Integer code;
    /** 信息 */
    private String msg;
    /** 返回的数据 */
    private T data;
}
