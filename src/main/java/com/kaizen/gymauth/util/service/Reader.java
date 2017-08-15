package com.kaizen.gymauth.util.service;

import com.digitalpersona.onetouch.DPFPSample;
import javafx.concurrent.Service;
import javafx.concurrent.Task;

/**
 *
 * @author Arturh
 */
public class Reader extends Service<DPFPSample> {
        
    private final DPFPReader myReader;
    private DPFPSample sample;
    
    public Reader(DPFPReader myReader) {
        this.myReader = myReader;
    }

    @Override
    protected Task<DPFPSample> createTask() {
        
        return new Task<DPFPSample>() {
            
            @Override
            protected DPFPSample call() throws Exception {
                
                while (!isCancelled()) {
                    
                    myReader.findReader();
                    
                    if (!myReader.getActiveReader().equals("empty")) {
                        
                        DPFPSample sample = myReader.getSample();
                        
                        updateValue(sample);
                        
                    }
                    
                }
                
                return null;
            }
            
        };
        
    }

}
