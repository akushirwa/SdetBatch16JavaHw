package Arrays2DHw;

public class OddEven {
    public static void main(String[] args) {
        int[][] numbers={{2,4,6,8},
                         {3,5,7,9},
                         {12,14,16,18}
        };



        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j]%2==0){
                    System.out.print(numbers[i][j]+" ");
                }


            }
            System.out.println();
        }








    }
}
