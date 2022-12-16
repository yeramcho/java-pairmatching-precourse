package pairmatching.controller;

import pairmatching.model.PairMatcher;
import pairmatching.view.OutputView;

public class PairMatchingController {
    private final PairMatcher pairMatcher;

    public PairMatchingController(PairMatcher pairMatcher) {
        this.pairMatcher = pairMatcher;
    }

    public void run() {
        OutputView.selectFunction();
    }
}
