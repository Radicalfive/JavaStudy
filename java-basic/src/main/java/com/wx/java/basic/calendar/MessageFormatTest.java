package com.wx.java.basic.calendar;

import java.text.MessageFormat;
import java.util.Date;

/**
 * @author radical
 * @date 2021/11/2
 */
public class MessageFormatTest {
    public static void main(String[] args) {
        int planet = 7;
        String event = "a disturbance in the Force";

        String result = MessageFormat.format(
                //planet对应0处，new Date()对应1，event对应2
                "At {1,time} on {1,date}, there was {2} on planet {0,number,integer}.",
                planet, new Date(), event);

        System.out.println(result);

        int fileCount = 1273;
        String diskName = "MyDisk";
        Object[] testArgs = {new Long(fileCount), diskName};

        MessageFormat form = new MessageFormat(
                // 转义
                "The disk \"{1}\" contains {0} file(s).");

        System.out.println(form.format(testArgs));


        MessageFormat mf = new MessageFormat("{0,number,#.##}, {0,number,#.#}");
        Object[] objs = {new Double(3.1415)};
        String result1 = mf.format( objs );
        System.out.println(result1);


        String message = "{0}{1}{2}{3}{4}{5}{6}{7}{8}{9}{10}{11}{12}{13}{14}{15}{16}";
        Object[] array = new Object[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q"};
        String value = MessageFormat.format(message, array);
        System.out.println(value);

        message = "oh, {0,number,#.##} is a good number";
        array = new Object[]{new Double(3.1415)};
        value = MessageFormat.format(message, array);
        System.out.println(value);

    }
}
