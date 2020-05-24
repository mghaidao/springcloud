package com.xyz.springcloud.entity;

import java.util.HashMap;

public class Result<T> extends HashMap {

    public static <T> Result<T> ok(String msg, T data) {
        Result r = new Result<>();
        r.put("code", 200);
        r.put("msg", msg);
        r.put("data", data);
        return r;
    }

    public static Result ok(String msg) {
        Result r = new Result<>();
        r.put("code", 200);
        r.put("msg", msg);
        return r;
    }
}
