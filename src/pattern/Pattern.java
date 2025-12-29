package pattern;
public class Pattern {

    public static void starPrint(){
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void hollowSquare(){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n){
                    System.out.print("* ");
                }else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void diagonal(){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if ( i == j ){
                    System.out.print("* ");
                }else
                {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }

    public static void plusSymbol(){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == (n/2)+1 || j == (n/2)+1){
                    System.out.print("x ");
                }else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void crossSymbol(){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if ( i == j || i+j == n + 1 ){
                    System.out.print("x ");
                }else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void sandTimer(){
        int n = 5;
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if ( i == 1 || i == n || i == j || i+j == n+1 ){
                    System.out.print("* ");
                }else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void fullBreath(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if ( i == 1 || i == n || j == 1 || j == n|| i == j || i+j == n+1 ){
                    System.out.print("o ");
                }else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void asterisk(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if (i == (n/2)+1 || j == (n/2)+1 || i == j || i+j == n + 1 ){
                    System.out.print("* ");
                }else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        starPrint();
        hollowSquare();
        diagonal();
        plusSymbol();
        crossSymbol();
        sandTimer();
        fullBreath(7);
        asterisk(7);
    }
}
