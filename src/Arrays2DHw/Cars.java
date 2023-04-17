package Arrays2DHw;

public class Cars {
    public static void main(String[] args) {
        String [][] cars={{"American","German","Korean","Italian"},
                               {"Ford","BMW","KIA","Ferrari"}
        };

        for (int rows = 0; rows < cars.length; rows++) {
            for (int coulm = 0; coulm < cars[rows].length; coulm++) {
                System.out.print(cars[rows][coulm]+" ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------");

        for(String [] car:cars){
            for (String caR:car){
                System.out.print(caR+" ");
            }
            System.out.println();
        }







    }
}
