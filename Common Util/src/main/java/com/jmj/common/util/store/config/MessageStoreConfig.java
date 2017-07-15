package com.jmj.common.util.store.config;

import com.jmj.common.annotation.ImportantField;

/**
 * Created by ryao on 2017/7/11.
 */
public class MessageStoreConfig {
    @ImportantField
    private boolean transientStorePoolEnable = false;
    @ImportantField
    private FlushDiskType flushDiskType = FlushDiskType.ASYNC_FLUSH;
    // CommitLog file size,default is 1G
    private int mapedFileSizeCommitLog = 1024 * 1024 * 1024;
    //活动存储池大小，默认为5
    private int transientStorePoolSize = 5;

    public FlushDiskType getFlushDiskType() {
        return flushDiskType;
    }

    public int getTransientStorePoolSize() {
        return transientStorePoolSize;
    }

    public void setTransientStorePoolSize(final int transientStorePoolSize) {
        this.transientStorePoolSize = transientStorePoolSize;
    }

    public int getMapedFileSizeCommitLog() {
        return mapedFileSizeCommitLog;
    }

    public void setMapedFileSizeCommitLog(int mapedFileSizeCommitLog) {
        this.mapedFileSizeCommitLog = mapedFileSizeCommitLog;
    }

    /**
     * Enable transient commitLog store poll only if transientStorePoolEnable is true and the FlushDiskType is ASYNC_FLUSH
     *
     * @return <tt>true</tt> or <tt>false</tt>
     */
    public boolean isTransientStorePoolEnable() {
        return transientStorePoolEnable && FlushDiskType.ASYNC_FLUSH == getFlushDiskType();
    }

    public void setTransientStorePoolEnable(final boolean transientStorePoolEnable) {
        this.transientStorePoolEnable = transientStorePoolEnable;
    }
}
