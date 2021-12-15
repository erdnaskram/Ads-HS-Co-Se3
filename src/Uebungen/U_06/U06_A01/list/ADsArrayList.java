package Uebungen.U_06.U06_A01.list;

import java.util.Arrays;

public class ADsArrayList implements ADsList {

    private Object[] array;
    private int numElems;
    
    
    public ADsArrayList(int capacity, Object... elements) {
        this.array = Arrays.copyOf(elements, capacity);
        this.numElems = elements.length;
    }
    
    @Override
    public int size() {
        return numElems;
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
		return null;
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
