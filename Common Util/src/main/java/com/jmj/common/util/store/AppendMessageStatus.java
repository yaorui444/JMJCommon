package com.jmj.common.util.store;

/**
 * When write a message to the commit log, returns code
 * Created by yaorui on 2017/7/13.
 */
public enum AppendMessageStatus {
    /**
     * 插入成功
     */
    PUT_OK,
    END_OF_FILE,
    MESSAGE_SIZE_EXCEEDED,
    PROPERTIES_SIZE_EXCEEDED,

    /**
     * 未知错误
     */
    UNKNOWN_ERROR,
}
