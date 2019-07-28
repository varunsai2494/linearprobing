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
public class resizableHashMap {
    private  int table_size=0 ;

       
      HashMap resizableMap;
       resizableHashMap(int tableSize){
      table_size=tableSize;
      resizableMap=new HashMap(tableSize);
      }
      
      public int get(int key){
      return resizableMap.get(key);
      }
      
      public void put(int key, int value){
      if(resizableMap.getSize()>=0.5*table_size){
          
          table_size*=2;
           
            HashMap temp=new HashMap(table_size);
            
            for(HashEntry h:resizableMap.table){
                if (h!=null){
               temp.put(h.getKey(),h.getValue());}}
      this.resizableMap=temp;
      }
      
            resizableMap.put(key,value);
            
            
      }
}
