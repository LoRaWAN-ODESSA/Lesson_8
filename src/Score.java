public class Score {
    String category;
    double[] statistic = new double[10];
    {
        for (int i = 0; i < statistic.length; i++) {
            statistic[i] = (Math.round(Math.random() * 60.0) - 25.0);

        }
    }
}
