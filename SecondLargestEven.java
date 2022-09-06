import java.util.Scanner;

public class SecondLargestEven {
    public static void main(String[] args) {
        int[] arr=new int[1000];
        int temp=0;
        Scanner kb=new Scanner(System.in);
        int size=kb.nextInt();
        for(int i=0;i<size;i++) {
            arr[i]=kb.nextInt();
        }
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(arr[i]>arr[j]) {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(arr[size-3]);
        kb.close();
    }
}
