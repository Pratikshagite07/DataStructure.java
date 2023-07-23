public class insertation {
    public static void main(String[]args){
        int pos=3;
        int element=100;
        int a[]={10,20,30,40,50};
        for(int i=4;i>pos-1;i--){
            a[i]=a[i-1];
        }
        a[pos-1]=element;
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+"");
        }
    }
    
}
