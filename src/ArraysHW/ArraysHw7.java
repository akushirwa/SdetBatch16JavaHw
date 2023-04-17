package ArraysHW;

public class ArraysHw7 {
    public static void main(String[] args) {
        int [] numbers={5,7,2,3,3,10,1,15,12,6,7};
        int highestNum=0;

        for (int i = 0; i < numbers.length; i++) {
            if (highestNum<numbers[i]){
                highestNum=numbers[i];
            }
        }
        System.out.println("The highest number in the array is "+highestNum);

    }
}
