public class App {
    public static void main(String[] args) {
        Context context=new Context();
        context.setStrategy(new StrategyImpl1());
        context.strategyApply();

        context.setStrategy(new StrategyImpl2());
        context.strategyApply();

        context.setStrategy(new StrategyImpl3());
        context.strategyApply();

    }
}
