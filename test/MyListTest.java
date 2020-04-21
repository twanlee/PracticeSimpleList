import static org.junit.jupiter.api.Assertions.*;

class MyListTest {

    @org.junit.jupiter.api.Test
    void addAndGet() {
        MyList<?> list = new MyList<String>();
        list.add("Solo1");
        list.add("Solo2");
        list.add("Solo3");
        list.add("Solo4");
        String expected = "Solo1";
        String result = (String) list.get(0);
        assertEquals(expected,result);

    }


}