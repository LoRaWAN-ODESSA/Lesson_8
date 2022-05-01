import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < GlobalRating.data.length; i++) {
            System.out.print("\n" + GlobalRating.categories[i] + ": ");
            for (int j = 0; j < GlobalRating.data[i].statistic.length; j++) {
                if (j == (GlobalRating.data[i].statistic.length - 1)) {
                    System.out.print(GlobalRating.data[i].statistic[j]);
                } else {
                    System.out.print(GlobalRating.data[i].statistic[j] + ", ");
                }
            }
        }
    }
}