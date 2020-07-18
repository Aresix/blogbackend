package com.aresix.blogbackend.result;

/**
 * 构造response, 响应码
 */
public class Result {
    // 响应码 400-失败 200-成功
    private int code;

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
