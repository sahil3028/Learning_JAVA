public class Sum {
    public static int Add(int []arr, int n){
        int sum=0;
        for(int i=0;i<n;i++) {
            sum += arr[i];
        }
        return sum;
    }
}
