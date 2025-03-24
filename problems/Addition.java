public class Addition {
    public static int Sum(int [] arr,int n){
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

}
