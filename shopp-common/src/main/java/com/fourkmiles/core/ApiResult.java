package com.fourkmiles.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 统一前端响应
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiResult implements Serializable {
    /** 响应码 */
    private int flag;
    /** 响应信息 */
    private String message;
    /** 数据 */
    private Object data;
}