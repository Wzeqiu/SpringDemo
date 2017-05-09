package com.demo.controller;


import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Created by WangZeQiu on 2017/5/9.
 */
@Controller
public class FileUploadController {

    @RequestMapping("/upload")
    public String fileUpload(MultipartFile file) throws IllegalStateException, IOException {
        try {
            FileUtils.writeByteArrayToFile(new File("/home/sang/workspace/" + file.getOriginalFilename()), file.getBytes());
            return "上传成功";
        } catch (IOException e) {
            e.printStackTrace();
            return "上传失败";
        }
    }

    @RequestMapping("/fileupload")
    public String up() {
        return "fileupload";
    }

}
