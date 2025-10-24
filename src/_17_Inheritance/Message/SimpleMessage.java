package _17_Inheritance.Message;

public class SimpleMessage extends Message{
    public SimpleMessage(String text) {
        super(text);
    }

    @Override
    protected String makePreFix() {
        return "[SIMPLE] ";
    }

    @Override
    public String format() {
        return makePreFix()+"내용 : "+super.text;
    }
}
