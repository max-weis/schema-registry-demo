package de.maxweis.ba;

import de.maxweis.ba.profile.MyReactiveMessagingApplication;
import io.quarkus.test.junit.QuarkusTest;

import org.eclipse.microprofile.reactive.messaging.Message;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
class MyReactiveMessagingApplicationTest {

    @Inject
    MyReactiveMessagingApplication application;

    @Test
    void test() {
        assertEquals("HELLO", application.toUpperCase(Message.of("Hello")).getPayload());
        assertEquals("BONJOUR", application.toUpperCase(Message.of("bonjour")).getPayload());
    }
}