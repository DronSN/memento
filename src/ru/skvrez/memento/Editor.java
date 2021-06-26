package ru.skvrez.memento;

import java.time.LocalDateTime;

public class Editor {

    private String text;
    private Position cursorPosition;

    class EditorSnapShoot {
        private String text;
        private Position cursorPosition;

        private EditorSnapShoot(String text, Position cursorPosition) {
            this.text = text;
            this.cursorPosition = cursorPosition;
        }

        private String getText() {
            return text;
        }

        private Position getCursorPosition() {
            return cursorPosition;
        }
    }

    public Editor(String text, Position cursorPosition) {
        this.text = text;
        this.cursorPosition = cursorPosition;
    }

    public Editor(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Position getCursorPosition() {
        return cursorPosition;
    }

    public void setCursorPosition(Position cursorPosition) {
        this.cursorPosition = cursorPosition;
    }

    public EditorSnapShoot makeSnapShoot() {
        return new EditorSnapShoot(getText(), getCursorPosition());
    }

    public void restore(EditorSnapShoot editorSnapShoot) {
        if (editorSnapShoot != null) {
            setText(editorSnapShoot.getText());
            setCursorPosition(editorSnapShoot.getCursorPosition());
        }
    }

    @Override
    public String toString() {
        return "Editor{" +
                "text='" + text + '\'' +
                ", cursorPosition=" + cursorPosition +
                '}';
    }
}
