public class Posicao {

    private Tropa tropa;

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
}

