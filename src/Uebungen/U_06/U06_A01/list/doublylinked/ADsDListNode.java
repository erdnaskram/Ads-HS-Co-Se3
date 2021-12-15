package Uebungen.U_06.U06_A01.list.doublylinked;

public class ADsDListNode {
	ADsDListNode next;
	ADsDListNode previous;

	// die zu speichernden Daten
	Object element;

	ADsDListNode(Object element) {
		this.element = element;
	}
}
