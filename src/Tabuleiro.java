import java.util.List;

public class Tabuleiro {

    Posicao[][] posicoes = new Posicao[9][5];
//    List<Posicao[]> posicoesPossiveis = List.of(posicoes);

    public Tabuleiro(){

        System.out.println(posicoes[8][0]+"|"+posicoes[8][1]+"|"+posicoes[8][2]+"|"+posicoes[8][3]+"|"+posicoes[8][4]);
        System.out.println("----------");
        System.out.println(posicoes[7][0]+"|"+posicoes[7][1]+"|"+posicoes[7][2]+"|"+posicoes[7][3]+"|"+posicoes[7][4]);
        System.out.println("----------");
        System.out.println(posicoes[6][0]+"|"+posicoes[6][1]+"|"+posicoes[6][2]+"|"+posicoes[6][3]+"|"+posicoes[6][4]);
        System.out.println("----------");
        System.out.println(posicoes[5][0]+"|"+posicoes[5][1]+"|"+posicoes[5][2]+"|"+posicoes[5][3]+"|"+posicoes[5][4]);
        System.out.println("----------");
        System.out.println(posicoes[4][0]+"|"+posicoes[4][1]+"|"+posicoes[4][2]+"|"+posicoes[4][3]+"|"+posicoes[4][4]);
        System.out.println("----------");
        System.out.println(posicoes[3][0]+"|"+posicoes[3][1]+"|"+posicoes[3][2]+"|"+posicoes[3][3]+"|"+posicoes[3][4]);
        System.out.println("----------");
        System.out.println(posicoes[2][0]+"|"+posicoes[2][1]+"|"+posicoes[2][2]+"|"+posicoes[2][3]+"|"+posicoes[2][4]);
        System.out.println("----------");
        System.out.println(posicoes[1][0]+"|"+posicoes[1][1]+"|"+posicoes[1][2]+"|"+posicoes[1][3]+"|"+posicoes[1][4]);
        System.out.println("----------");
        System.out.println(posicoes[0][0]+"|"+posicoes[0][1]+"|"+posicoes[0][2]+"|"+posicoes[0][3]+"|"+posicoes[0][4]);

        for(int l = 0; l < 9; l++){
            for(int c=0; c<5;c++){
                if (l == 0 && c == 1) {
                    posicoes[l][c].setTropa(new Barbaro("branco"));
                } if (l == 0 && c == 2) {
                    posicoes[l][c].setTropa(new Barbaro("branco"));
                }
                if (l == 0 && c == 3) {
                    posicoes[l][c].setTropa(new Barbaro("branco"));
                }
                if (l == 8 && c == 1) {
                    posicoes[l][c].setTropa(new Barbaro("Vermelhos"));
                }
                if (l == 8 && c == 2) {
                    posicoes[l][c].setTropa(new Barbaro("Vermelhos"));
                }
                if (l == 8 && c == 3) {
                    posicoes[l][c].setTropa(new Barbaro("Vermelhos"));
                }
                else{
                    posicoes[l][c] = new Posicao(" X ");//posicoes livres na matriz
                }
            }
        }
        //a
    }
}
