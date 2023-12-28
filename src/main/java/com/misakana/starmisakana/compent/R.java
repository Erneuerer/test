package com.misakana.starmisakana.compent;

public class R<T> {
    private Integer code;
    private String msg;
    private T data;

    public R(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public R(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public R() {

    }


    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "R{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }
    public static<T> R success(T t)
    {
        R r=new R(Status.SUCCESS.getCode(),Status.SUCCESS.getMsg());
        r.setData(t);
        return r;
    }
    public static<T> R fail(T t)
    {
        R r=new R(Status.FILED.getCode(),Status.FILED.getMsg());
        r.setData(t);
        return r;

    }
}
