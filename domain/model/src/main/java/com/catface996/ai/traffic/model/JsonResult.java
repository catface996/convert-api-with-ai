package com.catface996.ai.traffic.model;


import lombok.Data;

@Data
public class JsonResult<T> {

    private static final String SUCCESS = "SUCCESS";
    private static final String SUCCESS_MSG = "success";
    private static final String FAIL = "FAIL";
    private static final String FAIL_MSG = "fail";

    private String code;
    private String msg;
    private T data;

    public JsonResult(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> JsonResult<T> success(T data) {
        return new JsonResult<>(SUCCESS, SUCCESS_MSG, data);
    }

    public static <T> JsonResult<T> fail() {
        return new JsonResult<>(FAIL, FAIL_MSG, null);
    }

}
