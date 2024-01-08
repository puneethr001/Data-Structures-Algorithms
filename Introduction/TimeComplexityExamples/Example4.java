package TimeComplexityExamples;

public class Example4 {
    int fun4(int n){
        int m = 0;
        for(int i = 0;i <n;i++){
            m+= 1;
            i=i*2;
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example4 a = new Example4();
        System.out.println("N=100, Number of instructions in O(log(n))::"+a.fun4(100));
    }
}
