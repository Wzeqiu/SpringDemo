package com.demo.config;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by WangZeQiu on 2017/5/9.
 */
public class UserFile {
    private String filename;
    private byte[] bytes;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }
}
