package clients;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {
    private Client client1, client2;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        client1 = new Client("Vasyl", 34, 'm');
        client2 = new Client("Mykyta", 17, 'm');
    }

    @org.junit.jupiter.api.Test
    void getId() {
        assertTrue(client1.getId() >= 1);
        assertFalse(client1.getId() == client2.getId());
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals(client1.getName(), "Vasyl");
    }

    @org.junit.jupiter.api.Test
    void getAge() {
        assertEquals(client2.getAge(), 17);
    }

    @org.junit.jupiter.api.Test
    void getSex() {
        assertEquals(client1.getSex(), 'm');
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }
}