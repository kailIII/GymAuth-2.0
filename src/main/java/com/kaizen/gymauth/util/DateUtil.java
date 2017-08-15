package com.kaizen.gymauth.util;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import static com.kaizen.gymauth.util.DateStyle.*;
import java.util.Locale;

/**
 *
 * @author VakSF
 */
public class DateUtil {
    
    public static String toStringDate(LocalDate localDate) {
            return localDate.format(DateTimeFormatter.ofPattern(DD_MM_YYYY.getValue()));
    }
    
    public static String toStringTime(LocalDateTime localDateTime) {
        return localDateTime.format(DateTimeFormatter.ofPattern(HH_mm_ss.getValue()));
    }
    
    public static String getSpanishDate() {
        
        Locale spanishLocale = new Locale("es", "ES");
        
        return LocalDate.now().format(
                DateTimeFormatter.ofPattern(
                        EEEE_dd_MMMM_yyyy.getValue(), spanishLocale
                )
        );
    }
    
}
