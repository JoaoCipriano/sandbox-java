package com.optivem.sandbox.adapters;

import com.optivem.sandbox.core.HeightGateway;

import java.math.BigDecimal;
import java.util.HashMap;

public class ThirdPartyHeightGateway implements HeightGateway {

    // NOTE: This is for demo purposes only, it would not exist in the real implementation
    private final HashMap<String, BigDecimal> heights = new HashMap<>() {{
        put("835839506", BigDecimal.valueOf(20));
        put("247582352", BigDecimal.valueOf(40));
        put("568496963", BigDecimal.valueOf(60));
    }};

    @Override
    public BigDecimal getHeight(String ssn) {
        // NOTE: In the real implementation, we would make a here a call to some third party system (e.g. via REST API)
        // to retrieve a height for some person via their SSN
        return heights.get(ssn);
    }
}
