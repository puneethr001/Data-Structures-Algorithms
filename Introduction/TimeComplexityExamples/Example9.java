package TimeComplexityExamples;

public class Example9 {
    int fun9(int n){
        int i, j, m=0;
        for(i=n;i>0;i/=2){
            for(j=0;j<i;j++){
                m+=1;
            }
        }
        return m;
    }
    //Testing Code
    public static void main(String[] args) {
        Example9 a = new Example9();
        System.out.println("N=100, Number of instructions in O(n)::"+a.fun9(100));
    }
}
