package adt;

public interface ADT<E> {


    void add(E item);     //  This method will add the item in the list.

    void remove();       //  This method will remove the item in the list.

    int search(E item);
    /*
       This method will search an item in the list.

       @param item the item to be searched inside the list.
     */
    void sort();                 //This method will sort the list based on their nodes' data in ascending order.

    void print();              //This method will print all the item in the list.
}
