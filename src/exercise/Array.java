package exercise;

public class Array {
    public static void main(String[] args){
        int[] array = new int[11];
        for(int i = 0;i <= 10;i++){
            int j = (int)(Math.random()*100);

            array[i] = j;
            System.out.println(array[i]);
        }
        int maxnumber = 0;
        for(int i = 0;i <= 9;i++){
            maxnumber = array[i];
            if(array[i] <= array[i + 1]){
                maxnumber = array[i + 1];
            }

            else{
                continue;
            }
            continue;




        }
        System.out.println("=============");
        System.out.println("The max number is " + maxnumber);
    }

}
