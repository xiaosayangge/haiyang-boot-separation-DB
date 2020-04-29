package com.hy.util;
/**
 * ResultBody
 * Created by xuzhuo on 2018/8/22.
 */
public class ResultBody {
	
    private int code;
    private String uuid;
    private String msg;
    private Object body;

    public ResultBody() {
    }
    public ResultBody(Object body) {
        this.body = body;
    }

    public ResultBody(int code, String msg, Object body) {
        this.code = code;
        this.msg = msg;
        this.body = body;
    }

    public ResultBody(int code, String uuid, String msg, Object body) {
        this.code = code;
        this.uuid = uuid;
        this.msg = msg;
        this.body = body;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

	public Object getBody() {
		return body;
	}

	public void setBody(Object body) {
		this.body = body;
	}

    public static ResultBody success(Object data){
        return new ResultBody(200, "success", data);
    }
    

    public static ResultBody fail(String msg){
        return new ResultBody(500, msg, null);
    }
}
