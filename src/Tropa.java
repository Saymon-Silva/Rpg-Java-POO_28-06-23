import java.util.List;

public abstract class Tropa {

    Posicao[][] tabuleiro = new Posicao[9][5];
    List<Posicao[]> posicoesPossiveis = List.of(tabuleiro);

    private Posicao posicao;
    private String cor;
    private int vida;
    private int dano;
    private int defesa;
    private int alcance;

    public Tropa(String cor){
        this.cor = cor;
    }
//    private boolean movimento;

//  private int movimento -- (fazer com que todos andem somente uma posição à frente/lado/trás).

//region (geters e seters)

    public String getCor() {
        return cor;
    }

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

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAlcance(int alcance) {
        this.alcance = alcance;
    }

    public void setDano(int dano) {
        this.dano = dano;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public void setPosicao(Posicao posicao) {
        this.posicao = posicao;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    //endregion


    public int possiveisMovimentos() {
//        posicoesPossiveis.get(0)[2].
        Posicao[][] possiveisMovimentos = new Posicao[9][5];

        //region (comentarios de desenvolvimento)
        //mp tá, tu vai precisar fazer com que uma outra matriz receba o valor do (l,c)
        // pra poder gfazer a validação da posição.
        //agora como caralhos vou fazer isso?
        //endregion

        for( int l = 0; l < 9; l++){
            for( int c = 0; c < 5; c++){
                if( tabuleiro[l][c].getTropa() == null){
                    posicoesPossiveis.get(l)[c] = possiveisMovimentos[l][c];
                }
            }
        }
        return posicoesPossiveis.toArray().length;
        //retorna todas as posicoes do array(creio que vai
        // retornar todasas possiveis posicoes de movimento
    }

    public abstract int mover();

}
