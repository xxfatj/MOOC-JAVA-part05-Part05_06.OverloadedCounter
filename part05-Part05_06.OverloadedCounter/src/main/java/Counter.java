/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ajarir
 */
public class Counter {
    
    private int startValue;
     private int count;
    //private int stepValue;
    
    
    public Counter(int startValue) {
        
        this.startValue=startValue;
    }
    
    
    public Counter() {
        startValue=0;
    }
    
    public int value() {
        return startValue;
       
    }
    
    
    public void increase() {
        
        startValue++;
        
    }
    
    public void decrease() {
        
        startValue--;
    }
    
    
    public void increase(int increaseBy) {
        
        //this.increaseBy=increaseBy;
        
        count = count + startValue;
        
        
         if (count>1) {
            //continue;
            //break;
        
        }
        
        
    }
    
    
    public void decrease(int decreaseBy){
        
        count = count - startValue;
        //count =   startValue - count;
        
       if (count>1)
             startValue++;
             
            
        
    }
    
  
    
}
