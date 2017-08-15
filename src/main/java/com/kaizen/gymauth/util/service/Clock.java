package com.kaizen.gymauth.util.service;

import com.kaizen.gymauth.util.DateUtil;
import java.time.LocalDateTime;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author Arturh
 */
public class Clock extends Service<Void> {
    
    @Override
    protected Task<Void> createTask() {
        
        return new Task<Void>() {
            
            @Override
            protected Void call() throws Exception {
                
                while (!isCancelled()) {
                    
                    String hour = DateUtil.toStringTime(
                            LocalDateTime.now()).concat(" hrs");
                    
                    super.updateMessage(hour);
                    
                    Thread.sleep(1000);
                    
                }
                
                return null;
            }
        };
    }
}
