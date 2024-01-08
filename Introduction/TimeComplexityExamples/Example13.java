package TimeComplexityExamples;

public class Example13 {
    int fun13(int n){
        int i, j, m = 0;
        for(i=1;i<n;i*=2){
            for(j=0;j<i;j++){
                m+=1;
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example13 a = new Example13();
        System.out.println("N = 100, Number of instructions in O(n)::"+a.fun13(100));
    }
}
