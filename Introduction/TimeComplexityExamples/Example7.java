package TimeComplexityExamples;

public class Example7 {
    int fun7(int n){
        int i, j, k, m = 0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                m+=1;
            }
        }
        for(i=0;i<n;i++){
            for(k=0;k<n;k++){
                m+=1;
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example7 a = new Example7();
        System.out.println("N=100, Number of instructions in O(n^2)::"+a.fun7(100));
    }
}
