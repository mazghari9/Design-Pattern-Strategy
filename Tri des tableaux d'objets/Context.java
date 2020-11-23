import java.util.ArrayList;

class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(ArrayList<Produit> prods,int a, int b) {
        strategy.sort(prods,a,b);
    }
}
