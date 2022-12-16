package pairmatching;

import pairmatching.controller.PairMatchingController;
import pairmatching.model.PairMatcher;

public class Application {
    public static void main(String[] args) {
        PairMatcher pairMatcher = new PairMatcher();
        PairMatchingController pairMatchingController = new PairMatchingController(pairMatcher);
        pairMatchingController.run();
    }
}
