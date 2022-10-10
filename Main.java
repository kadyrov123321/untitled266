public class Main {
    public static void main(String[] args) {
        double [] word = {8.1, 6.3, 2.3, 5.1, 3.4, 4.4, 1.3, 3.7, -9.3, 1.8, 4.2, 1.7, -4.9, -6.3, -1.7, 7.8};
        double num = 0;
        int SUM= 0;
        boolean enter = false;
        for (double address: word) {
            if (SUM < 0) {
                enter = true;
            } else if(SUM > 0 && enter){
                System.out.println(SUM);
                if (SUM > 0) {
                    num = num + SUM;
                    SUM++;
                    System.out.println(word);
                    System.out.println();
                    System.out.println("SUM =" + num);
                    System.out.println("средння арифметическая положительных чисел" + num / SUM);


                }
            }
        }