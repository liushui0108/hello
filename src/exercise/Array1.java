package exercise;

public class Array1 {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("========================");
        print(array);
        System.out.println(sum(array));

        printCount(array,10);
    }

public static void print(int[] arr1){
        for(int i = 0;i <= 8;i++){
            System.out.print(arr1[i] + " ");
        }
    System.out.println();
}

public static void printCount(int[] arr1,int counter){
        for(int j = 0;j <= counter - 1;j++){

            for(int i = 0;i <= 8;i++){
                System.out.print(arr1[i] + " ");
            }
        System.out.println();
        }

}
public static int sum(int[] arr1){
        int sum = 0;
    for(int i = 0;i <= 8;i++){
        sum = sum + arr1[i];


    }
return sum;
    }

}

