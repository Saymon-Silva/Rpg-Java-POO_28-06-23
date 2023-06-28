public class Tabuleiro {

    private int tabuleiro[][] = new int[9][5];

    public Tabuleiro(int[][] tabuleioro[][]){
        int x[][] = tabuleioro[9][5];

        System.out.println(x[8][0]+"|"+x[8][1]+"|"+x[8][2]+"|"+x[8][3]+"|"+x[8][4]);
        System.out.println("----------");
        System.out.println(x[7][0]+"|"+x[7][1]+"|"+x[7][2]+"|"+x[7][3]+"|"+x[7][4]);
        System.out.println("----------");
        System.out.println(x[6][0]+"|"+x[6][1]+"|"+x[6][2]+"|"+x[6][3]+"|"+x[6][4]);
        System.out.println("----------");
        System.out.println(x[5][0]+"|"+x[5][1]+"|"+x[5][2]+"|"+x[5][3]+"|"+x[5][4]);
        System.out.println("----------");
        System.out.println(x[4][0]+"|"+x[4][1]+"|"+x[4][2]+"|"+x[4][3]+"|"+x[4][4]);
        System.out.println("----------");
        System.out.println(x[3][0]+"|"+x[3][1]+"|"+x[3][2]+"|"+x[3][3]+"|"+x[3][4]);
        System.out.println("----------");
        System.out.println(x[2][0]+"|"+x[2][1]+"|"+x[2][2]+"|"+x[2][3]+"|"+x[2][4]);
        System.out.println("----------");
        System.out.println(x[1][0]+"|"+x[1][1]+"|"+x[1][2]+"|"+x[1][3]+"|"+x[1][4]);
        System.out.println("----------");
        System.out.println(x[0][0]+"|"+x[0][1]+"|"+x[0][2]+"|"+x[0][3]+"|"+x[0][4]);
    }
}
