/*
 *  Copyright 2014-2015 snakerflow.com
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package cn.dongyeshengzhen.framework.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author yuqs
 * @since 0.1
 */
public class DateUtils {
    public static final String DATE_FORMAT_DEFAULT = "yyyy-MM-dd HH:mm:ss";
    public static final String DATE_FORMAT_YMDHM = "yyyy-MM-dd HH:mm";
    public static final String DATE_FORMAT_YMD = "yyyy-MM-dd";
    public static final String DATE_FORMAT_YMDHMSS = "yyyyMMddHHmmssSSS";

    public static String getCurrentTime() {
        SimpleDateFormat sFormat = new SimpleDateFormat(DATE_FORMAT_DEFAULT);
        Calendar c1 = Calendar.getInstance();
        return sFormat.format(c1.getTime());
    }

    public static String getCurrentDay() {
        SimpleDateFormat sFormat = new SimpleDateFormat(DATE_FORMAT_YMD);
        Calendar c1 = Calendar.getInstance();
        return sFormat.format(c1.getTime());
    }

    public static Date stringToDate(String dateStr) throws ParseException {
        SimpleDateFormat sFormat = new SimpleDateFormat(DATE_FORMAT_YMD);
        return sFormat.parse(dateStr);
    }

    public static Date stringToDate(String dateStr, String format) throws ParseException {
        SimpleDateFormat sFormat = new SimpleDateFormat(format);
        return sFormat.parse(dateStr);
    }

    public static Date stringToDateTime(String dateStr) throws ParseException {
        SimpleDateFormat sFormat = new SimpleDateFormat(DATE_FORMAT_DEFAULT);
        return sFormat.parse(dateStr);
    }

    public static Date getCurrentDayDate() {
        try {
            return stringToDate(getCurrentDay());
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * yyyy-mm-dd
     *
     * @param appointBeginDate
     * @return
     */
    public static String dateToString(Date appointBeginDate) {
        SimpleDateFormat sFormat = new SimpleDateFormat(DATE_FORMAT_YMD);
        return sFormat.format(appointBeginDate);
    }

    /**
     * yyyy-mm-dd
     *
     * @param appointBeginDate
     * @return
     */
    public static String dateToString(Date appointBeginDate, String format) {
        SimpleDateFormat sFormat = new SimpleDateFormat(format);
        return sFormat.format(appointBeginDate);
    }
}
