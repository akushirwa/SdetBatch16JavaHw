package Arrays2DHw;

public class NamesGrade {
    public static void main(String[] args) {
        String[][] namesGrade = {
                {"Akrem", "Sam", "John", "Mike"},
                {"A", "C", "B", "C"}
        };

        for (int i = 0; i < namesGrade[1].length; i++) {
            if (namesGrade[1][i].equals("A") || namesGrade[1][i].equals("B")) {
                System.out.println(namesGrade[0][i] + " has a grade of " + namesGrade[1][i] + " in the class.");
            }
        }
    }

}
