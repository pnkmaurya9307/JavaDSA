public class reversearray{

    public static int[] reversearray(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] =temp;
            left += 1;
            right -=2;
        }
        return arr;
    }
    public static void main(String[] args) {
        
}