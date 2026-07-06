public class recursion2 {
    public static void name(int i){
        if(i<1) return;
        int sum = 0;
        name(i-1);
        
        sum =sum + i;
        System.out.println(sum);
        
       


    }
    
    public static void main(String[] args) {
        
        name(5);
    }
}
