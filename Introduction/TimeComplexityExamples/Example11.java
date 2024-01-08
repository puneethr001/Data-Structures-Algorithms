package TimeComplexityExamples;

public class Example11 {
    int fun11(int n){
        int i, j, k, m = 0;
        for(i = 0;i<n;i++){
            for(j=i;j<n;j++){
                for(k=j+1;k<n;k++){
                    m+=1;
                }
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example11 a = new Example11();
        System.out.println("N = 100, Number of instructions in O(n^3)::"+a.fun11(100));
    }
}
