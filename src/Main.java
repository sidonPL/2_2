public class Main {
    public static void main(String[] args) {
        for (int k = 0;k <= 2; k++) {
                for (int i = 1; i <= 5; i++) {
                    for (int j = 0; j < 5 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }
        }
}
