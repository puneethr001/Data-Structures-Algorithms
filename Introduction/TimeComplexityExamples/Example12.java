package TimeComplexityExamples;

public class Example12 {
    int fun12(int n){
        int i, j, m = 0;
        for(i = 0;i<n;i++){
            for(j=0;j<n;j++){
                m+=1;
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example12 a = new Example12();
        System.out.println("N = 100, Number of instructions in O(n)::"+a.fun12(100));
    }
}
