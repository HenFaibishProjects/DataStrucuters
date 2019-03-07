package string;

import java.util.Arrays;

public class MyOwnString {

    public char[] chars;

    public  MyOwnString() {
    }

    public MyOwnString(char[] chars) {
        this.chars = Arrays.copyOf(chars, chars.length);
    }

    public char[] getChars() {
        return chars;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("MyOwnString{");
        sb.append("chars=").append(Arrays.toString(chars));
        sb.append('}');
        return sb.toString();
    }
}
