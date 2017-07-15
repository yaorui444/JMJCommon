package com.jmj.common.util.store;

import java.nio.ByteBuffer;

/**
 * Created by ryao on 2017/7/14.
 */
public class SelectMappedBufferResult {
    private final long startOffset;
    private final ByteBuffer byteBuffer;
    private int size;
    private MappedFile mappedFile;

    public SelectMappedBufferResult(long startOffset, ByteBuffer byteBuffer, int size, MappedFile mappedFile) {
        this.startOffset = startOffset;
        this.byteBuffer = byteBuffer;
        this.size = size;
        this.mappedFile = mappedFile;
    }

    public ByteBuffer getByteBuffer() {
        return byteBuffer;
    }

    public int getSize() {
        return size;
    }

    public void setSize(final int s) {
        this.size = s;
        this.byteBuffer.limit(this.size);
    }

    public MappedFile getMappedFile() {
        return mappedFile;
    }

    public long getStartOffset() {
        return startOffset;
    }

    public synchronized void release() {
        if (this.mappedFile != null) {
            this.mappedFile.release();
            this.mappedFile = null;
        }
    }
}
