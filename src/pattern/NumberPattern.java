package pattern;

public class NumberPattern {
    public static void Number1(){
        for(int i = 1; i <= 7; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void Number2(){
        for (int i = 6; i >= 1; i--){
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void Number3(){
        for (int i = 7; i >= 1; i--){
            for (int j = 7; j >= i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void Number4(){
        for (int i = 1; i <= 7; i++){
            for (int j = 7; j >= i; j--) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Number1();
        Number2();
        Number3();
        Number4();
    }
}
