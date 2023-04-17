package Arrays2DHw;

public class Countries {
    public static void main(String[] args) {

        String [][] countries={{"USA","Canada","Mexico","Cuba"},
                               {"Brazil","Peru","Colombia","Uruguay"},
                               {"Italy","UK","France","Germany"},
                               {"Japan","China","India","Hong Kong"},
                               {"Ethiopia","Egypt","Somali","Nigeria"}
        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("----------------------------------------------");

        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s+" ");
            }
            System.out.println();

        }

        System.out.println("---------------------------------------------");

        int counter=0;
        while (counter<countries.length){
            int colum=0;

            while (colum<countries[counter].length){
                System.out.print(countries[counter][colum]+" ");
                colum++;
            }
            System.out.println();
            counter++;

        }


        System.out.println("-----------------------------------------");

int total=0;

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                total++;
            }
        }

        System.out.println(total);






    }
}
