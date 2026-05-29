package basicRevision;

public class basic1 {
    public static void main(String[] args) {
        int a=1234,b=0;
        //reverse
        while(a>0){
            b*=10;
            b+=a%10;
            a/=10;
        }
        System.out.println(b);

        //palindrome
        a=11211;b=0;
        int        c=a;
        while(a>0){
            b*=10;
            b+=a%10;
            a/=10;
        }
        if(c==b) System.out.println("palindrome");
        else System.out.println("naahhh");

        //largest in array
        int max=0;
        int[] arr={1,234,43,2342,46,124,345,6,232,5423,5,534,21,2345,3546,21};
        for (int i : arr) if (i > max) max = i;
        System.out.println(max);
        //FIBONACCI SERIES
        int user_input=9,z=0,zz=1,zzz=0;
        if(user_input==1) System.out.println(zzz);
        else if (user_input==2) System.out.println(zz);
        else {
            System.out.printf("%d %d",zzz,zz);
            for(int i=3;i<=user_input;i++){
                z=zzz+zz;
                System.out.print(" "+z);
                zzz=zz;
                zz=z;
            }
        }
        //COUNT VOWELS IN STRING
        String s="akjmhdsasuikeytriuastgmndbcvjsluiedghawsdgvbn";
        char []vowel={'a','e','i','o','u'};
        int counterr=0;
        for(char i :s.toCharArray()){
            for (char v:vowel) if(Character.toLowerCase(i)==v) counterr++;
        }
        System.out.print(counterr);
    }
}
