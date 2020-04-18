public class Perimeter_Area {
    public static void main(String[] args) {
        int a=2;
        int b=6;

        System.out.println("Периметърът на правоъгълника е:" + parameter(a,b));
        System.out.println("Лицето на правоъгълника е:" + area(a,b));
    }
    public static int parameter(int a, int b){
      return 2*a+2*b;

    }
    public static int area(int a, int b){
        return a*b;
    }
}
