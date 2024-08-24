public class code_3 {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for(int i = 2; i <= 100; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.println(j);
                if(i % j == 0) {

                    count++;
                }
                if(count == 2) {
                    System.out.println(i);
                    sum = sum + i;
                }
            }

        }
        System.out.println("The sum: " + sum);
    }
}