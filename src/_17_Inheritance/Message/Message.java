package _17_Inheritance.Message;

public class Message {
    String text;

    public Message(String text) {
        this.text = text;
    }

    protected String makePreFix() {
        return "[MSG] ";
    }

    public String format() {
        return makePreFix()+text;
    }

    public void print() {
        System.out.println(format());
    }
}
