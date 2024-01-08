package TimeComplexityExamples;

public class Example2 {
    public int fun2(int n){
    int m = 0;
    for(int i=0;i<n;i++){
        for (int j=0;j<n;j++){
            m += 1;
        }
    }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example2 a = new Example2();
        System.out.println("N=100, Number of instructions in O(n^2)::"+a.fun2(100));
    }
}
