import com.optivem.sandbox.application.HeightGateway;
import com.optivem.sandbox.adapters.ThirdPartyHeightGateway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ThirdPartyHeightGatewayTest {

    private HeightGateway heightGateway;

    @BeforeEach
    void setup() {
        this.heightGateway = new ThirdPartyHeightGateway();
    }

    @Test
    void should_return_height_for_existent_ssn() {
        // NOTE: In real applications, we wouldn't be hardcoding values for third party systems
        // instead we would be using techniques such as contract testing
        var ssn = "247582352";
        var height = heightGateway.getHeight(ssn);
        assertThat(height).isEqualTo(40);
    }
}
