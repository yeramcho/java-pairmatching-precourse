package pairmatching.model;

public enum Function {
    PAIR_MATCHING("1"),
    PAIR_CHECK("2"),
    PAIR_INIT("3"),
    QUIT("Q");

    private final String function;
    Function(String function) {
        this.function = function;
    }
    public String getFunction() {
        return this.function;
    }
}
