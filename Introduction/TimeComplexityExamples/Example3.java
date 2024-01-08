package TimeComplexityExamples;

public class Example3 {
    int fun3(int n){
        int m =0;
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                m+=1;
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
    Example3 a = new Example3();
    System.out.println("N = 100, Number of instructions in O(n^2)::"+a.fun3(100));
    }
}
