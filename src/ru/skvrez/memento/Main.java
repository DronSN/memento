package ru.skvrez.memento;

public class Main {

    public static void main(String[] args) {

        Editor editor = new Editor("123", new Position(1,2));
        CareTaker careTaker = new CareTaker();
        careTaker.takeSnapShoot(editor);
        editor.setText("456");
        editor.setCursorPosition(new Position(3,4));
        System.out.println(editor);
        careTaker.undo(editor);
        System.out.println(editor);
        careTaker.undo(editor);
    }
}
