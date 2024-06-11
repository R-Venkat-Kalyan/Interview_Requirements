public class JaggedArrays {

    private static void printJaggedArray(){
        int jagarr[][] = new int[5][];
        jagarr[0] = new int[1];
        jagarr[1] = new int[2];
        jagarr[2] = new int[3];
        jagarr[3] = new int[4];
        jagarr[4] = new int[5];
        int val = 1;
        for(int i = 0;i < jagarr.length;i++){
            for(int j = 0;j < jagarr[i].length;j++){
                jagarr[i][j] = val++;
            }
        }

        for(int i = 0;i < jagarr.length;i++){
            for(int j = 0;j < jagarr[i].length;j++){
                System.out.print(jagarr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Java Jagged Arrays: ");
        System.out.println("This are similar to 2D Arrays with varying number of columns in each row");
        printJaggedArray();
    }
    
}
