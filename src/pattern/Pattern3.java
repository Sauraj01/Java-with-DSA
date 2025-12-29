package pattern;

public class Pattern3 {
    public static void main(String[] args) {

        pattern9();

    }
     static void pattern9(){
         for (int i=1; i<=5; i++) {
             for (int j = 4; j >= i; j--) {
                 System.out.print(" ");
             }
             for (int k = 1; k <=(2*i-1); k++) {
                 System.out.print("*");
             }
             System.out.println();
         }
     }


    static void pattern8(){
        for (int i=1; i<=5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            for (int l = 2; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern7(){
        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern6(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5-i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern5(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i=1; i<=6; i++){
            for (int j=1; j<=6-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    static void pattern3(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=5-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern2(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern1(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
