package TimeComplexityExamples;

public class Example5 {
    int fun5(int n){
        int m=0,i=n;
        while(i>0){
            m+=1;
            i=i/2;
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example5 a = new Example5();
        System.out.println("N = 100, Number of instructions in O(log(n))::"+a.fun5(100));
    }
}
