package ru.skvrez.memento;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class CareTaker {
    private LinkedList<Editor.EditorSnapShoot> snapShoots = new LinkedList<>();

    public void takeSnapShoot(Editor editor) {
        if (editor != null) {
            snapShoots.push(editor.makeSnapShoot());
        }
    }

    public void undo(Editor editor) {
        if (editor != null) {
            try {
                editor.restore(snapShoots.pop());
            } catch (NoSuchElementException e) {
                System.out.println("Undo list is empty");
            }
        }
    }

}
