public class VarArg {
    //static void show(int[] arr)
    static void show(int ... arr){
        for(int i: arr){
            System.out.println(i);
        }
    }
    public static void main(String[] args){
        //int a[]={10,20,30,40};
        show(10,20,30,40,50);
    }
}
