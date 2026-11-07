public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int summandsNum = Integer.parseInt(args[0]);
        for (int i = 0; i < summandsNum; i++){
            double sign = (i % 2 == 0) ? 1.0 : -1.0;
            double currAdd = sign * (1.0 / (1 + (2 * i)));
            approxPi += currAdd;
        }
        approxPi = 4 * approxPi;
        
        System.out.println(approxPi + " " + actualPi);
    }
}
