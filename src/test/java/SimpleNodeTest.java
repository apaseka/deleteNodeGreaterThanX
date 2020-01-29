import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleNodeTest {

    @org.junit.jupiter.api.Test
    void removeNodesTest() {
        SimpleNode simpleNode = new SimpleNode();
        SimpleNode simpleNode2 = new SimpleNode();
        SimpleNode simpleNode3 = new SimpleNode();
        SimpleNode simpleNode4 = new SimpleNode();
        SimpleNode simpleNode5 = new SimpleNode();
        SimpleNode simpleNode6 = new SimpleNode();
        SimpleNode simpleNode7 = new SimpleNode();
        SimpleNode simpleNode8 = new SimpleNode();
        SimpleNode simpleNode9 = new SimpleNode();

        simpleNode.x = 123;
        simpleNode2.x = 324;
        simpleNode3.x = 456;
        simpleNode4.x = 25;
        simpleNode5.x = 325;
        simpleNode6.x = 345;
        simpleNode7.x = 547;
        simpleNode8.x = 15;
        simpleNode9.x = 36;

        simpleNode.next = simpleNode2;
        simpleNode2.next = simpleNode3;
        simpleNode3.next = simpleNode4;
        simpleNode4.next = simpleNode5;
        simpleNode5.next = simpleNode6;
        simpleNode6.next = simpleNode7;
        simpleNode7.next = simpleNode8;
        simpleNode8.next = simpleNode9;

        SimpleNode node = SimpleNode.removeNodes(simpleNode, 100);

        assertEquals(25, node.x);
        assertEquals(15, node.next.x);
        assertEquals(36, node.next.next.x);


    }
}
