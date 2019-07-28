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
public class HashMap {

      private static int TABLE_SIZE ;

      public  int itemssize; 

      HashEntry[] table;

      

      HashMap(int tableSize) {
            TABLE_SIZE=tableSize;
            table = new HashEntry[TABLE_SIZE];

            for (int i = 0; i < TABLE_SIZE; i++)

                  table[i] = null;

      }

 
      public int getSize(){
      return itemssize; 
              }
      
      public void setSize(int size){
          itemssize=size;
      }
      public int get(int key) {

            int hash = (key % TABLE_SIZE);

            while (table[hash] != null && table[hash].getKey() != key)

                  hash = (hash + 1) % TABLE_SIZE;

            if (table[hash] == null)

                  return -1;

            else

                  return table[hash].getValue();

      }

 

      public void put(int key, int value) {

            int hash = (key % TABLE_SIZE);

            while (table[hash] != null && table[hash].getKey() != key)
                  
                  hash = (hash + 1) % TABLE_SIZE;
                  
            if(table[hash] == null || (table[hash]!=null && table[hash].getKey() != key )){
            itemssize+=1;
            }
            table[hash] = new HashEntry(key, value);
            
      }

}
