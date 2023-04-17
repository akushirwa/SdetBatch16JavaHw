package Arrays2DHw;

public class Groceries {
    public static void main(String[] args) {
        String [][] groceries={{"carrots","kale","broccoli","peas"},
                               {"Apple","Kiwi","Orange","Grapes"},
                                {"Milk","Yogurt","Kefir","Eggs"},
                                 {"Candy","Chocolate","Pastry","Poptart"}
        };

        for (int i = 0; i < groceries.length; i++) {
            for (int j = 0; j < groceries[i].length; j++) {
                System.out.print(groceries[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");

        for (String[] grocery : groceries) {
            for (String s : grocery) {
                System.out.print(s+" ");
            }
            System.out.println();
        }



    }
}
