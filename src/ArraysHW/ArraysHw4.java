package ArraysHW;

public class ArraysHw4 {
    public static void main(String[] args) {
        String [] cars={"BMW","Audi","Kia","Volvo","Toyota","Honda"};

        for (String car : cars) {
            System.out.print(car+" ");
        }
        System.out.println();
        System.out.println("----------------------------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.print(cars[i]+" ");
        }




    }
}
