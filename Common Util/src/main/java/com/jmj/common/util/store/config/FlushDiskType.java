package com.jmj.common.util.store.config;

/**
 * 刷盘方式
 * Created by ryao on 2017/7/11.
 */
public enum FlushDiskType {
    /**
     * 将数据刷到操作系统的缓存，性能较高
     */
    ASYNC_FLUSH,

    /**
     * 将数据写到磁盘，性能最低
     */
    SYNC_FLUSH
}
