/**
 * Пользовательский итератор/курсор
 */


public interface MyIterator {

    boolean hasNext();

    Object next();

    boolean hasPrevious();

    Object previous();

    int getIteratorPosition();

    Object getItem(int id);

    int setIteratorPosition(int position);

    boolean removItem(int id);


}
