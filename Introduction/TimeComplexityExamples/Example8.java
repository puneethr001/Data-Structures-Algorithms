package TimeComplexityExamples;

public class Example8 {
    int fun8(int n){
        int i, j, m =0;
        for(i=0;i<n;i++){
            for(j=0;j<Math.sqrt(n);j++){
                m+=1;
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example8 a = new Example8();
        System.out.println("N=100, Number of instructions in O(n^(3/2))::"+a.fun8(100));
    }
}
