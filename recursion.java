public class recursion {
    public static void name(int count){
        
        if(count==0) return; 
        System.out.println("pankaj");
        name(count-1);
       


    }
    
    public static void main(String[] args) {
        
        name(5);
    }
}
