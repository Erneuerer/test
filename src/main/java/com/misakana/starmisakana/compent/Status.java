package com.misakana.starmisakana.compent;

public enum Status {
    SUCCESS(Compent.SUCCESS_CODE, Compent.SUCCESS_MSG),
    FILED(Compent.ERROR_CODE, Compent.ERROR_MSG);

    private Integer code;
    private String msg;

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

    Status(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
