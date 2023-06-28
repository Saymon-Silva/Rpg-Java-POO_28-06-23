public abstract class Tropa {

    private Posicao posicao;
    private int vida;
    private int dano;
    private int defesa;
    private int alcance;

//  private int movimento -- (fazer com que todos andem somente uma posição à frente/lado/trás).

//region (geters e seters)
    public int getVida() {
        return vida;
    }

    public int getDano() {
        return dano;
    }

    public int getDefesa() {
        return defesa;
    }

    public int getAlcance() {
        return alcance;
    }

    public Posicao getPosicao() {
        return posicao;
    }
//endregion

    public boolean movimentar(Tabuleiro tabuleiro, Posicao posicao) {

        int movimentoPossivel[][] = new int[9][5];
        int y = 0;

        for ( int l = 0; l < 9; l++){
            for ( int c = 0; c > 5; c++){
             movimentoPossivel[l][c] == ;
            }
        }



        return
    }
}
