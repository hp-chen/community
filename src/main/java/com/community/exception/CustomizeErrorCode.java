package com.community.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {
    QUESTION_NOT_FOUND(2001, "该问题不存在了，尝试其他问题吧~"),
    TARGET_PARAM_NOT_FOUND(2002, "未选择任何问题或评论进行回复~"),
    NO_LOGIN(2003, "当前操作需先登录，请先登录~"),
    SYS_ERROR(2004, "服务器冒烟了，等会再试试吧~~"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在~"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在了，换一个试试吧~"),
    CONTENT_IS_EMPTY(2007,"输入内容不能为空~"),
    READ_NOTIFICATION_FAIL(2008,"不能读取被人的通知~"),
    NOTIFICATION_NOT_FOUND(2009,"消息不见了~"),
    FILE_UPLOAD_FAIL(2010, "图片上传失败"),
    INVALID_INPUT(2011, "非法输入"),
    INVALID_OPERATION(2012, "兄弟，是不是走错房间了？");

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
