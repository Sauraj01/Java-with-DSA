package pattern;

public class Pattern2 {

    public static void trianglePattern(){
        for (int i=1; i<=5; i++){
            for (int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseTrianglePattern(){
        for (int i=5; i>=1; i--){
            for (int j=5; j>=i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        //trianglePattern();
        //reverseTrianglePattern();
        System.out.println(11+22);
    }
}
