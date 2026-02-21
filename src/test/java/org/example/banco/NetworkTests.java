package org.example.banco;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class NetworkTests {
    @BeforeAll
    public static void setUp() {
        mockHttpURLConnection = new MockHttpURLConnection(null);
        URL.setURLStreamHandlerFactory(new MockURLStreamHandlerFactory(mockHttpURLConnection));
    }

    @Test
    void givenMockedUrl_whenRequestSent_thenIsUrlAvailableTrue() throws Exception {
        mockHttpURLConnection.setResponseCode(HttpURLConnection.HTTP_OK);
        URL url = new URL("localhost:5173");

        UrlFetcher fetcher = new UrlFetcher(url);
        assertTrue(fetcher.isUrlAvailable(), "Url should be available: ");
    }
}
