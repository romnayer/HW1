public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int sign = 1;
        int n = Integer.parseInt(args[0]);
        for (int i = 0; i < n; i++){
            int Mone = i*2+1;
            approxPi += sign*(1.0 / Mone);
            sign = -sign;
        }
        approxPi *= 4;
       
        
        
        System.out.println(approxPi + " " + actualPi);
    }
}
