public class Main {
    public static void main(String[] args) {
        int []a={3, 0, 2, -5, 0};
        System.out.println(sumFactor(a));
    }
    static int sumFactor(int []a){
        int sum=0,count=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        for (int i = 0; i <a.length ; i++) {
            if (sum==a[i])count++;

        }
        return count;
    }
}