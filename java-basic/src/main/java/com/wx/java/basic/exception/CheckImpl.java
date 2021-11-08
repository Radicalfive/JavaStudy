package com.wx.java.basic.exception;

import lombok.extern.slf4j.Slf4j;

import java.io.File;
import java.util.List;

/**
 * @program: java-basic
 * @description
 * @author: radical
 * @create: 2021-11-07
 **/
@Slf4j
public class CheckImpl implements CheckBlog {
    private static final int MAX_LENGTH=20;
    private static final int MIN_LENGTH=0;
    private static final String[] arr={"暴力","恐怖","残忍","去死","艹","恶心"};
    @Override
    public boolean send(Blog blog) throws BlogException {
        //判断标题
        if(blog.getTitle().length() == MIN_LENGTH) {
            log.info("标题为空");
        }
        if(blog.getTitle().length() > MAX_LENGTH){
            log.info("标题超过20个字符");
        }
        //判断内容
        for (int i=0,len=arr.length;i<len;i++){
            if (blog.getContent().contains(arr[i])){
                log.info("内容有禁词");
            }
        }
        List<Img> imgList = blog.getImgList();
        imgList.forEach(img -> {
            //对集合imgList进行遍历
            File file=new File(img.getUrl());
            String filename=file.toString().substring(file.toString().lastIndexOf("."));
            System.out.println(filename);

            if (file.length()>1024*1024*2){
                log.info("图片过大");
            }
            if ( filename.equals(".png")==false  && filename.equals(".jpg")==false ){
                log.info("文件名格式错误");
            }
        });

        return true;
    }
}
