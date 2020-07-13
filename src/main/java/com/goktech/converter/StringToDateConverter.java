package com.goktech.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by kingwan on 2020/6/17.
 * 说明：
 */
@Controller
public class StringToDateConverter implements Converter<String,Date> {

    @Override
    public Date convert(String s) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date result = format.parse(s);
            return result;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
