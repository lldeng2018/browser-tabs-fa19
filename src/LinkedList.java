/*
 * Copyright 2014, Michael T. Goodrich, Roberto Tamassia, Michael H. Goldwasser
 *
 * Developed for use with the book:
 *
 *    Data Structures and Algorithms in Java, Sixth Edition
 *    Michael T. Goodrich, Roberto Tamassia, and Michael H. Goldwasser
 *    John Wiley & Sons, 2014
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Realization of a list by means of a dynamic array. This is a simplified version
 * of the java.util.LinkedList class.
 *
 * @author Michael T. Goodrich
 * @author Roberto Tamassia
 * @author Michael H. Goldwasser
 */
public class LinkedList implements List {
  // instance variables

  /* your private instance variables go here.
   * It is recommended that you use a "sentinel node" at the front of the list
   *  to make the methods easier to implement. However, using a sentinel node is not required.
   */

  /* The current number of elements in the list */

  /** Current number of elements in the list. */
  private int size = 0;                    // current number of elements

  // constructors
  /* Part 1:
   * create an empty list
   */
  public LinkedList() {
    // solution here
  }

  // public methods
  /**
   * Returns the number of elements in the list.
   * @return number of elements in the list
   */
  public int size() { return size; }

  /**
   * Tests whether the array list is empty.
   * @return true if the array list is empty, false otherwise
   */
  public boolean isEmpty() { return size == 0; }


  /* Part 1: toArray
   * Example
   * before: [ 100, 200, 300 ]
   * toArray()
   * after: [ 100, 200, 300 ]
   * returns { 100, 200, 300 }
   */

  /**
   * Returns an array containing the elements of this List in order
   * @return an array containing the elements of this List in order
   */
  @Override
  public Object[] toArray() {
    int sizeOfThisList = size();
    Object[] r = new Object[sizeOfThisList];

    /* copy the references in the list in order into the array r */

    // solution here

    return r;
  }

  /* Part 1: add
   * add d to the end of the list
   *
   * Example
   * before: [ 100, 200 ]
   * add(2, 300)
   * after:  [ 100, 200, 300 ]
   */
  /**
   * Inserts the given element at the specified index of the list, shifting all
   * subsequent elements in the list one position further to make room.
   * @param  i   the index at which the new element should be stored
   * @param  e   the new element to be stored
   * @throws IndexOutOfBoundsException if the index is negative or greater than size()
   */


  /* Part 2: get
   * Example
   * before: [ 100, 200, 300 ]
   * get(2)
   * after:  [ 100, 200, 300 ]
   * returns 300
   */
  /**
   * Returns (but does not remove) the element at index i.
   * @param  i   the index of the element to return
   * @return the element at the specified index
   * @throws IndexOutOfBoundsException if the index is negative or greater than size()-1
   */


  /* Part 3: set
   * Example
   * before: [ 100, 200, 300 ]
   * set(1, 400)
   * after:  [ 100, 400, 300 ]
   * returns 200
   */
  /**
   * Replaces the element at the specified index, and returns the element previously stored.
   * @param  i   the index of the element to replace
   * @param  e   the new element to be stored
   * @return the previously stored element
   * @throws IndexOutOfBoundsException if the index is negative or greater than size()-1
   */


  /* Part 4: remove
   * Example
   * before: [ 100, 200, 300 ]
   * remove(1)
   * after:  [ 100, 300 ]
   * returns 200
   */
  /**
   * Removes and returns the element at the given index, shifting all subsequent
   * elements in the list one position closer to the front.
   * @param  i   the index of the element to be removed
   * @return the element that had be stored at the given index
   * @throws IndexOutOfBoundsException if the index is negative or greater than size()-1
   */



  /* Part 5: move
   * Example
   * before: [ 100, 200, 300 ]
   * move(1, 0)
   * after:  [ 200, 100, 300 ]
   *
   * Example
   * before: [ 100, 200, 300, 400 ]
   * move(1,3)
   * after: [ 100, 300, 400, 200 ]
   */
  /**
   * Moves the element at the given index to the other index
   * @param from the index of the element to be moved
   * @param to the index to move that element to
   * @throws IndexOutOfBoundsException if either index is negative or greater than size()-1
   */



  // utility methods
  /** Checks whether the given index is in the range [0, n-1]. */
  protected void checkIndex(int i, int n) throws IndexOutOfBoundsException {
    if (i < 0 || i >= n)
      throw new IndexOutOfBoundsException("Illegal index: " + i);
  }


  /**
   * Node of a singly linked list, which stores a reference to its
   * element and to the subsequent node in the list (or null if this
   * is the last node).
   *
   * You do not need to modify the Node class
   */
  private static class Node {

    /** The element stored at this node */
    private Object element;            // reference to the element stored at this node

    /** A reference to the subsequent node in the list */
    private Node next;         // reference to the subsequent node in the list

    /**
     * Creates a node with the given element and next node.
     *
     * @param e  the element to be stored
     * @param n  reference to a node that should follow the new node
     */
    public Node(Object e, Node n) {
      element = e;
      next = n;
    }

    // Accessor methods
    /**
     * Returns the element stored at the node.
     * @return the element stored at the node
     */
    public Object getElement() { return element; }

    /**
     * Returns the node that follows this one (or null if no such node).
     * @return the following node
     */
    public Node getNext() { return next; }

    // Modifier methods
    /**
     * Sets the node's next reference to point to Node n.
     * @param n    the node that should follow this one
     */
    public void setNext(Node n) { next = n; }
  } //----------- end of nested Node class -----------

}
