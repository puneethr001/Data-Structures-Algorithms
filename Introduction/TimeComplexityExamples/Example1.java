package TimeComplexityExamples;
public class Example1 {
    int fun1(int n){
        int m = 0;
        for (int i=0;i<n;i++){
            m += 1;
        }
        return m;
    }
   //Testing Code
public static void main(String[] args) {
    Example1 a = new Example1();
    a.fun1(1);
    System.out.println("N=100, Number Of Instructions in O(n) :: "+ a.fun1(100));
}
}