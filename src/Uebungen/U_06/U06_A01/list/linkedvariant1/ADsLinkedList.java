package Uebungen.U_06.U06_A01.list.linkedvariant1;

import Uebungen.U_06.U06_A01.list.ADsList;

public class ADsLinkedList implements ADsList {

    private ADsListNode head;

    public ADsLinkedList() {
        // intentionally left blank
    }
    
    public ADsLinkedList(Object... elements) {
        ADsListNode node = null;
        for( int i = 0; i < elements.length; i++ ) {
            if( i == 0 ) {
                head = new ADsListNode(elements[i]);
                node = head;
            } else {
                ADsListNode next = new ADsListNode(elements[i]);
                node.next = next;
                node = next;
            }
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
