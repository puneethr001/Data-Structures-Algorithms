package TimeComplexityExamples;

public class Example10 {
    int fun10(int n){
        int i, j, m=0;
        for(i=0;i<n;i++){
            for(j=i;j>0;j--){
                m+=1;
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example10 a = new Example10();
        System.out.println("N=100, Number of instructions in O(n^2)"+a.fun10(100));
    }
}
