public class hollow_rectangular {
    public static void hollo(int col,int row) {
        for(int i =1; i<=row;i++){
            for(int j =1;j<=col;j++){
                if(i==1||i==row||j==1||j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        
    }

    public static void main(String[] args) {
        int col = 5;
        int row = 5;
        hollo(col, row);
    }
}