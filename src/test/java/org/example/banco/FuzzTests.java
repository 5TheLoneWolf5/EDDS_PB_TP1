package org.example.banco;

import com.code_intelligence.jazzer.api.FuzzedDataProvider;
import com.code_intelligence.jazzer.junit.FuzzTest;
import java.util.Objects;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class FuzzTests {
    @FuzzTest(maxDuration = "10s")
    void crashFuzz(FuzzedDataProvider d) {
        String input = d.consumeRemainingAsString();
        if (Objects.equals(input, "crash")) {
            byte[] bytes =
                    new byte[] {
                            0xa, 0x5c, 0x45, 0x5d, 0x5c, 0x45, 0x5d, 0x5d, 0x5d, 0x5d, 0x5d, 0x5d,
                    };
            String data = new String(bytes, java.nio.charset.StandardCharsets.UTF_8);
            try {
                Pattern.matches("\\Q" + data + "\\E", "foobar");
            } catch (PatternSyntaxException ignored) {
            }
        }
    }
}