import java.util.Date;
public class TestArray {
    public static void main(String[] args) {
    double[] myList = {1.9,2.9,3.4,3.5};
    for (double element:myList){
        System.out.println(element);
    }
    int[] myListint = {1,2,4,3,5};
    printArray(myListint);
        Date now = new Date();
        System.out.println(now.toString());
    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+" ");
        }
    }

}
