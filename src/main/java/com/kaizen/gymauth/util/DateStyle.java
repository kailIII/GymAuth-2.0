package com.kaizen.gymauth.util;

/**
 *
 * @author VakSF
 */
public enum DateStyle {
    
    YYYY_MM("yyyy-MM"),
    YYYY_MM_DD("yyyy-MM-dd"), 
    DD_MM_YYYY("dd-MM-yyyy"),  
    YYYY_MM_DD_HH_MM("yyyy-MM-dd HH:mm"),  
    YYYY_MM_DD_HH_MM_SS("yyyy-MM-dd HH:mm:ss"),
    HH_mm_ss("HH:mm:ss"),
    EEEE_dd_MMMM_yyyy("EEEE, dd MMMM, yyyy");
    
    private final String value;  

    private DateStyle(String value) {  
        this.value = value;  
    }
    
    public String getValue() {  
        return value;  
    }  
      
    
}
