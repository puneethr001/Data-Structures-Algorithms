package TimeComplexityExamples;

public class Example6 {
    int fun6(int n){
        int i, j, k, m=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                for(k=0;k<n;k++){
                    m+=1;
                }
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example6 a = new Example6();
        System.out.println("N=100, Number of instructions in O(n^3)::"+a.fun6(100));
    }
}
