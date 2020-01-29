public class SimpleNode {

    public SimpleNode next;

    public int x;

    public static SimpleNode removeNodes(SimpleNode listHead, int x) {

        if (listHead == null)
            return null;

        while (listHead.x > x) {
            listHead = listHead.next;
        }

        if (listHead.next != null)
            while (listHead.next.x > x) {
                listHead.next = listHead.next.next;
            }

        removeNodes(listHead.next, x);

        return listHead;
    }
}
