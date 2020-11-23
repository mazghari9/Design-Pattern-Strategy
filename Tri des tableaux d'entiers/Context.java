class Context {
    private final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void arrange(int[] input,int a, int b) {
        strategy.sort(input,a,b);
    }
}
