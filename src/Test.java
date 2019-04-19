
public class Test
{

    public static void main(String[] args) {
        int[] array = { 10, 20, 30 };
        System.out.println(array[0]); // 10
        System.out.println(array[1]); // 20
        System.out.println(array[2]); // 30
        System.out.println("====================");

        change(array);

        System.out.println("====================");
        System.out.println(array[0]); // 100
        System.out.println(array[1]); // 200
        System.out.println(array[2]); // 300
    }

    public static void change(int[] arr) {
        arr[0] *= 10;
        arr[1] *= 10;
        arr[2] *= 10;
        System.out.println(arr[0]); // 100
        System.out.println(arr[1]); // 200
        System.out.println(arr[2]); // 300
    }

}
