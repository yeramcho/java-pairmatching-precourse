package pairmatching.controller;

import pairmatching.model.Function;
import pairmatching.model.PairMatcher;
import pairmatching.view.InputView;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private final PairMatcher pairMatcher;

    public PairMatchingController(PairMatcher pairMatcher) {
        this.pairMatcher = pairMatcher;
    }

    public void run() {
        String function;
        do {
            OutputView.selectFunction();
            function = InputView.readFunction();
        } while (!function.equals(Function.QUIT.getFunction()));
    }
}
