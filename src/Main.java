import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> rankData = summarize(new double[]{0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1});
        for(Double data: rankData){
            System.out.println(data);
        }
    }

    private static double findRank(double[] sortedData, double p){
        int i;
        i = (int) Math.ceil(p * (sortedData.length - 1));
        return sortedData[i];
    }

    private static ArrayList<Double> summarize(double[] sortedData){
        ArrayList<Double> rankData = new ArrayList<>();
        double p[] = {0, 0.25, 0.5, 0.75, 1};
        int i;

        for(i = 0 ; i <= p.length - 1 ; i++){
            rankData.add(findRank(sortedData, p[i]));
        }
        return rankData;
    }
}