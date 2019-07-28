/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hash_assignment5;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author imperio2494
 */
public class loadTesting {
    public static void loadPerformance(){
     ArrayList<Integer> nums=new ArrayList<Integer>();
        int n=1000000;
        for(int i =0; i<n; i++){
     double randomDouble = Math.random();
        nums.add((int)(randomDouble*n*100));
}
//        for(int i:nums)System.out.println(i);
        double loadfactorInc=4;
        ArrayList<Double> a= new ArrayList<Double>();
        ArrayList<Double> b= new ArrayList<Double>();
        ArrayList<Double> c= new ArrayList<Double>();
        for(double lf=0;lf<=100;lf+=loadfactorInc){
            
            int lfnumsIndex=(int)(lf*n)/100;
            
//            System.out.println(lfnumsIndex);
        HashMap s=new HashMap(n);
        
        Instant start = Instant.now();
        for(int i=0;i<lfnumsIndex;i++){  
            s.put(nums.get(i),Integer.MAX_VALUE);               
        }
        Instant finish = Instant.now();
        
        
        Instant startget = Instant.now();
        for(int i=0;i<lfnumsIndex;i++){  
            s.get(nums.get(i));               
        }
        Instant finishget = Instant.now();
        double timeElapsed = Duration.between(start, finish).toNanos();
        double timeElapsedget = Duration.between(startget, finishget).toNanos();
        
//        System.out.println(lfnumsIndex+" : "+lf+" : "+timeElapsed/n +" : "+timeElapsedget/n);
        a.add(lf);
        b.add(timeElapsed/lfnumsIndex);
        c.add(timeElapsedget/lfnumsIndex);
        
//        System.out.println("adfjsdf"+k/n);
        
//        Instant start1 = Instant.now();
//        for(int i:nums){  
//            s.get(i);   
//        }
//        Instant finish1 = Instant.now();
//        int timeElapsed1 = Duration.between(start1, finish1).toNanos();
//        System.out.println("adfjsdf"+timeElapsed1/n);


        }
//        for(Double i:a)System.out.println(i);
//        System.out.print("######");
//        for(Double i:b)System.out.println(i);
//        System.out.print("######");
//        for(Double i:c)System.out.println(Math.round(i));
for(int i=0;i<a.size();i++){
System.out.print(a.get(i)+" : "+ c.get(i));

}
}
    
    public static void resizableLoadPerformance(){
     ArrayList<Integer> nums=new ArrayList<Integer>();
        int n=1000;
        for(int i =0; i<5*n; i++){
     double randomDouble = Math.random();
        nums.add((int)(randomDouble*n*100));
}       
        
        ArrayList<Double> a= new ArrayList<Double>();
        ArrayList<Double> b= new ArrayList<Double>();
        ArrayList<Double> c= new ArrayList<Double>();
        double loadfactorInc=4;
        for(double lf=1;lf<100;lf+=loadfactorInc){
        int lfnumsIndex=(int)(lf*n*5)/100;
//        System.out.print(lfnumsIndex);
        double timeElapsed=0;
        double timeElapsedget=0;
        for(int j=0;j<3;j++){
//            Instant sta = Instant.now();
            
        resizableHashMap s=new resizableHashMap(n);
//        Instant fta = Instant.now();
//        System.out.println("*()"+Duration.between(sta, fta).toNanos());
        
//        Instant start = Instant.now();
//        for(int i=0;i<lfnumsIndex;i++){  
//            s.put(nums.get(i),Integer.MAX_VALUE);               
//        }

Instant start = Instant.now();
            for(int i=0;i<lfnumsIndex;i++){
//               if( i==700 || i==1000 || i==1200||i==4500){
//               System.out.println("@@@"+s.resizableMap.table.length);
//               }
            s.put(nums.get(i), Integer.MAX_VALUE);
            int hjk=9;
            }
            Instant finish = Instant.now();
            
            Instant startget = Instant.now();
             for(int i=0;i<lfnumsIndex;i++){
               
            s.get(nums.get(i));
            
            }
             Instant finishget = Instant.now();
//            System.out.println(Duration.between(startget, finishget).toNanos());
            timeElapsed+= Duration.between(start, finish).toNanos();
            
            timeElapsedget+= Duration.between(startget, finishget).toNanos();
        
        }
            a.add(lf);
            b.add((timeElapsed/lfnumsIndex)/3);
            c.add((timeElapsedget/lfnumsIndex)/3);
            System.out.println(lf);
        }
        
//    for(Double i:a)System.out.println(i);
//        System.out.print("######");
//        for(Double i:b)System.out.println(i);
//System.out.print("######");
//for(Double i:a)System.out.println(Math.round(i));
//        System.out.print("######");
//        for(Double i:c)System.out.println(Math.round(i));
System.out.println("load factor Percent: time");
        
        for(int i=0;i<a.size();i++){
System.out.println(a.get(i)+" : "+ c.get(i));

}
}
    
    
public static void incrementalHashLoadTesting(){
     ArrayList<Integer> nums=new ArrayList<Integer>();
        int n=1000;
        for(int i =0; i<5*n; i++){
     double randomDouble = Math.random();
        nums.add((int)(randomDouble*n*100));
}       
        
        ArrayList<Double> a= new ArrayList<Double>();
        ArrayList<Double> b= new ArrayList<Double>();
        ArrayList<Double> c= new ArrayList<Double>();
        double loadfactorInc=2;
        for(double lf=1;lf<100;lf+=loadfactorInc){
            System.out.println(lf);
        int lfnumsIndex=(int)(lf*n*5)/100;
//        System.out.print(lfnumsIndex);
        double timeElapsed=0;
        double timeElapsedget=0;
        for(int j=0;j<2;j++){
//            Instant sta = Instant.now();
            
        incrementalHashMap s=new incrementalHashMap(n);
//        Instant fta = Instant.now();
//        System.out.println("*()"+Duration.between(sta, fta).toNanos());
        
//        Instant start = Instant.now();
//        for(int i=0;i<lfnumsIndex;i++){  
//            s.put(nums.get(i),Integer.MAX_VALUE);               
//        }

Instant start = Instant.now();
            for(int i=0;i<lfnumsIndex;i++){
                
//               if( i==700 || i==1000 || i==1200||i==4500){
//               System.out.println("@@@"+s.resizableMap.table.length);
//               }
try{
            TimeUnit.MILLISECONDS.sleep(5);}
catch(Exception e){}
            s.put(nums.get(i), Integer.MAX_VALUE);
            
            }
            Instant finish = Instant.now();
            
            Instant startget = Instant.now();
             for(int i=0;i<lfnumsIndex;i++){
               
            s.get(nums.get(i));
            
            }
             Instant finishget = Instant.now();
//            System.out.println(Duration.between(startget, finishget).toNanos());
            timeElapsed+= Duration.between(start, finish).toNanos();
            
            timeElapsedget+= Duration.between(startget, finishget).toNanos();
        
        }
            a.add(lf);
            b.add((timeElapsed/lfnumsIndex)/2);
            c.add((timeElapsedget/lfnumsIndex)/2);
//            System.out.println(lf);
        }
        
//    for(Double i:a)System.out.println(i);
//        System.out.print("######");
//        for(Double i:b)System.out.println(i);
System.out.print("######");
for(Double i:a)System.out.println(Math.round(i));
        System.out.print("######");
        for(Double i:c)System.out.println(Math.round(i));
     System.out.println("RESULT");  
System.out.println("load factor Percent: time");
       
        for(int i=0;i<a.size();i++){
        System.out.println(a.get(i)+" : "+ c.get(i));
        }  

}

}
