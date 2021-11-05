package com.wx.java.basic.lesson.exception;
import io.vavr.collection.List;
import java.io.File;

/**
 * @author radical
 * @date 2021/11/4
 */
 public class Checkimpl implements Check{

    private static final int MAX_LENGTH = 20;
    private static final String[] arr = {"死","艹","血","去死","残忍","恶心"};
    private static final int one = 1024;
     @Override
     public boolean check(Blog blog) throws BlogException {
         if (blog.getTitle().length() > MAX_LENGTH ||blog.getTitle()==null) {
             throw new BlogException("标题异常");
         }
         for (int i = 0; i < arr.length ; i++) {
             if (blog.getText().contains(arr[i])) {
                 throw new BlogException("文本中含有违禁词，请修改！");
            }
         }

         List<Img> imgList = (List<Img>) blog.getImgList();

         imgList.forEach(img -> {
             File file = new File(img.getUrl());
             int length = (int) file.length();
             if (length > one * one * 2) {
                 throw new BlogException("上传图片太大，请重新上传");
             }
             String fileType = file.getName().substring(file.getAbsoluteFile()
                     .toString().lastIndexOf("."));
             if (fileType!= "jpg" || fileType != "png") {
                 throw new BlogException("图片不对");
             }
         });
         return true;
     }
 }
