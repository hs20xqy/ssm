package com.common.entity.api;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hs on 2017/3/22.
 */
public final class ApiResultUtil {

    /* disable construct */
    private ApiResultUtil(){}

    /**
     * 构造一个包含数据的成功结果
     *
     * @param data 数据
     * @return
     */
    public static ApiResult newSuccessResult(Object data) {
        ApiSuccessResult result = new ApiSuccessResult();
        result.setData(data);
        return result;
    }

    /**
     * 构造一个包含数据的成功结果
     *
     * @param data 数据
     * @return
     */
    public static <T> ApiResult newListResult(List<T> data) {
        ApiResult result;
        if (data == null || data.isEmpty()) {
            result = new ApiEmptyResult();
            result.setData(new ArrayList<T>());
        }else {
            result = new ApiSuccessResult();
            result.setData(data);

        }
        return result;
    }
}
