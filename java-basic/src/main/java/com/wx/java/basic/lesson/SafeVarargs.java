package com.wx.java.basic.lesson;
import java.lang.annotation.*;
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.CONSTRUCTOR , ElementType.METHOD})
public @interface SafeVarargs {
}
