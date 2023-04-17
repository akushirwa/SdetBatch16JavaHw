package ArraysHW;

public class ArraysHw5 {
    public static void main(String[] args) {
        String [] animals={"Dog","Cat","Bird","Fox","Dolphins"};

        for (int i = 0; i < animals.length; i++) {
            System.out.print(animals[i]+" ");
        }
        System.out.println();

        for (String animal : animals) {
            System.out.print(animal+" ");
        }



    }
}
