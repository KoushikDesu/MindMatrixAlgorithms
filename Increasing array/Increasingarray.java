class Increasingarray{
    public static void main(String[] args) {
        try(java.util.Scanner sc = new java.util.Scanner(System.in)){
            int n = sc.nextInt();
            long[] arr = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            long count = 0;
            for(int i=1;i<n;i++){
                if(arr[i]<arr[i-1]){
                    count += arr[i-1]-arr[i];
                    arr[i] = arr[i-1];
                }
            }
            sc.close();
            System.out.println(count);
        }
    }
}