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
            determineFunction(function);
        } while (!function.equals(Function.QUIT.getFunction()));
    }

    private void determineFunction(String function) {
        if (function.equals(Function.PAIR_MATCHING.getFunction())) {
            pairMatcher.pairMatch();
            return;
        }
        if (function.equals(Function.PAIR_CHECK.getFunction())) {
            pairMatcher.pairCheck();
            return;
        }
        if (function.equals(Function.PAIR_INIT.getFunction())) {
            pairMatcher.pairInit();
        }
    }
}
