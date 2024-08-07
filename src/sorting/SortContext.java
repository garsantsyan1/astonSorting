package sorting;

public class SortContext{
    private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public SortStrategy getStrategy() {
        return strategy;
    }

    public void executeStrategy(Integer[] array) {
        strategy.sort(array);
    }

}
