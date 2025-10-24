package _17_Inheritance.Message;

public class FancyMessage extends Message{
    public FancyMessage(String text) {
        super(text);
    }

    @Override
    protected String makePreFix() {
        return "[FANCY] ";
    }

    @Override
    public String format() {
        return makePreFix()+"★ "+super.text+" ★";
    }
}
