import java.util.*;
class ShiftElementsInArray {
    public static void main(String[] args) {    
        int [] arr = new int [10] ;
        Scanner sc=new Scanner(System.in); 
        for(int i=0; i<10; i++)  
       {   
              arr[i]=sc.nextInt();  
         }    
        int n = 1;     
        for(int i = 0; i < n; i++){  
            int j, last;  
            last = arr[arr.length-1];  
          
            for(j = arr.length-1; j > 0; j--){   
                arr[j] = arr[j-1];  
            }  
            arr[0] = last;  
        }  
      
        System.out.println();  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
     
}  

}
