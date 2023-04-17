package Arrays2DHw;

public class Numbers {
    public static void main(String[] args) {

        int[][] numbers={{12,14,9},
                {6,32,10},
                {7,5,3}
        };
int sum =0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum+=numbers[i][j];
            }

        }
        System.out.println(sum);




    }
}
