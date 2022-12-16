package pairmatching.view;

public enum ProgramMessage {
    SELECT_FUNCTION("기능을 선택하세요."),
    OPTIONS("1. 페어 매칭\n" +
            "2. 페어 조회\n" +
            "3. 페어 초기화\n" +
            "Q. 종료");

    private final String message;

    ProgramMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
