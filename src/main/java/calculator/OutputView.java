package calculator;

public class OutputView {
    
    private static final String RESULT_MESSAGE = "연산 결과: ";
    
    public static void printResult(int result) {
        System.out.println(RESULT_MESSAGE + result);
    }
}
