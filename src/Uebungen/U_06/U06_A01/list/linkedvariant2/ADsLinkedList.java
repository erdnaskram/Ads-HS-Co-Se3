package Uebungen.U_06.U06_A01.list.linkedvariant2;

import Uebungen.U_06.U06_A01.list.ADsList;

public class ADsLinkedList implements ADsList {

    private ADsListNode head;

    public ADsLinkedList() {
        head = new ADsListNode(null);
    }
    
    public ADsLinkedList(Object... elements) {
        this();
        ADsListNode node = head;
        for( int i = 0; i < elements.length; i++ ) {
            ADsListNode next = new ADsListNode(elements[i]);
            node.next = next;
            node = next;
        }
    }
    
    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void insert(int pos, Object elem) {
        // TODO Auto-generated method stub
    }

    @Override
    public void remove(int pos) {
        // TODO Auto-generated method stub
    }

    @Override
    public Object elementAt(int pos) {
        // TODO Auto-generated method stub
    }

    @Override
    public int find(Object element) {
        // TODO Auto-generated method stub
		return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
		return false;
    }
}
