package ohm.softa.a02;

import java.util.Iterator;

/**
 * @author Peter Kurfer
 * Created on 10/6/17.
 */
public class SimpleListImpl implements SimpleList, Iterable {
    Element head;
    int size = 0;
    @Override
    public void add(Object o) {
        if(head == null){
            head = (Element) o;
        } else {
            while (head.next != null){
                head.next = head;
                this.size++;
            }
            head = (Element) o;
        }
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public SimpleList filter(SimpleFilter filter) {
        return null;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    private class IteratorImpl implements Iterator{

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }

    private static class Element{
        Object item;
        Element next;
    }

}
