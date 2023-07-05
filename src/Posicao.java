public class Posicao {

    private Tropa tropa;
//    private String olhoNoOlho;//serve pra colocar nas posicoes vazias da matriz.

    public Posicao(String olhoNoOlho){

    }

    //region(get/setter)
    public Tropa getTropa() {
        return tropa;
    }

    public void setTropa(Tropa tropa) {
        this.tropa = tropa;
    }

    public String toString() {
        return  "Posicao " +
                "Tropa=" + tropa;
    }
    //endregion

}

