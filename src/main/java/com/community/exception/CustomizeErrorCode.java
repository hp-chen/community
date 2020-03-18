package com.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001, "该问题不存在了，尝试其他问题吧~"),
    TARGET_PARAM_NOT_FOUND(2002, "未选择任何问题或评论进行回复~"),
    NO_LOGIN(2003, "当前操作需先登录，请先登录~"),
    SYS_ERROR(2004, "服务器冒烟了，等会再试试吧~~"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在~"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在了，换一个试试吧~");

    private Integer code;
    private String message;


    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return null;
    }
}
