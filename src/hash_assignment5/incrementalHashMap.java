/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_assignment5;

/**
 *
 * @author imperio2494
 */
public class incrementalHashMap {
  private  int table_size=0 ;

       
      HashMap incrementalMap,temp;
       incrementalHashMap(int tableSize){
      table_size=tableSize;
      
      incrementalMap=new HashMap(table_size);
      }
      private boolean threadStarted=false;
      public int get(int key){
      return incrementalMap.get(key);
      }
      
      public void put(int key, int value){
      if(!threadStarted && incrementalMap.getSize()>=0.7*table_size){
          
          threadStarted=true;
          populateAndSwitch();
          
      }
      
      
          
           
            
          
        incrementalMap.put(key,value);
//        System.out.print(incrementalMap.table.length +"\n");

         
            
      }  

    public boolean isThreadStarted() {
        return threadStarted;
    }
      public void populateAndSwitch( ) {
    
    new Thread(new Runnable() {
        public void run(){
            System.out.println("New thread is created ");
            temp=new HashMap(table_size*5);
           while(incrementalMap.getSize()>0){
               for(int i=0;i<incrementalMap.table.length;i++)
               {
               if(incrementalMap.table[i]!=null)
               {
               temp.put(incrementalMap.table[i].getKey(),incrementalMap.table[i].getValue());
               incrementalMap.table[i]=null;
               incrementalMap.setSize(incrementalMap.getSize()-1);
               
               }
               }
           
           
           }
//           System.out.print(threadStarted+"switched to second hashtable");
           
           incrementalMap=temp;
           System.out.println("New thread is switched as primary thread");
           threadStarted=false;
           table_size=5*table_size;
      
           
           
           }
    }).start();
}
}
