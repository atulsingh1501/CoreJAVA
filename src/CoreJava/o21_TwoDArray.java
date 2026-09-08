package CoreJava;

public class o21_TwoDArray {

    public static void main(String[] args) {

        // 2D array = An array where each element is an array
        // Useful for storing a matrix of data

        String[][] groceries = {
                {"apple", "orange", "banana"},
                {"potato", "onion", "carrot"},
                {"chicken", "pork", "beef", "fish"}
        };

        groceries[0][0] = "pineapple";
        groceries[1][2] = "egg";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
