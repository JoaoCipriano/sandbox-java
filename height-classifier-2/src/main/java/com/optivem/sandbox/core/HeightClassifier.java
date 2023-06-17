package com.optivem.sandbox.core;

import java.math.BigDecimal;
import java.math.MathContext;

public class HeightClassifier {
    private static final Height TALL_THRESHOLD = new Height(BigDecimal.valueOf(180));
    private static final Height SHORT_THRESHOLD = new Height(BigDecimal.valueOf(160));

    private HeightGateway heightGateway;

    public HeightClassifier(HeightGateway heightGateway) {
        this.heightGateway = heightGateway;
    }

    public HeightClassification classify(String ssn) {
        var height = heightGateway.getHeight(ssn);

        if(height.isGreaterThan(TALL_THRESHOLD)) {
            return HeightClassification.Tall;
        }

        if(height.isLessThan(SHORT_THRESHOLD)) {
            return HeightClassification.Short;
        }

        return HeightClassification.Medium;
    }
}
