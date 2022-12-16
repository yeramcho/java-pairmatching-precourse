package pairmatching.model;

public enum Table {
    LINE("#############################################"),
    COURSE("과정"),
    MISSION("미션"),
    DELIMITER(" | "),
    LIST("  - "),
    DEFINE(": ");

    private final String sign;

    Table(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return this.sign;
    }
}
