/*public class Searching {    
public static void main(String[] args){ 
    int[] arr={5,6,7,8,9};
    int item=9; 
    int temp=0;  
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == item){    
                System.out.println("element is present at "+i+ "index position"); 
            }    
        }    
       if(temp==0){
        System.out.println("item not found");
       }
    }    
   
}  */  //linear(sequential) and binary search

  class Searching{
    public static void main(String args[]){
        String[] arr={"Ketan","Kartik","Ayush","Depesh","Amit"};
        String item="Kartik";
         int temp=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==item){
                System.out.println("element is found at index position"  +i+"");
                temp=temp+1;
            }
        }
        if(temp==0){
            System.out.println("element is no found");
        }
    }
  }  

