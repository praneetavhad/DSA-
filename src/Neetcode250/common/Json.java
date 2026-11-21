package Neetcode250.common;

import java.util.ArrayList;
import java.util.List;

/**
 * Tiny parser for LeetCode-style values: [1,2,[3]], "abc", 1.5, true, null.
 * Lists become List&lt;Object&gt;, numbers become Long or Double, strings become String.
 */
public final class Json {
    private final String s;
    private int i;

    private Json(String s) { this.s = s; }

    public static Object parse(String text) {
        Json p = new Json(text.trim());
        Object v = p.value();
        p.ws();
        if (p.i != p.s.length()) throw new IllegalArgumentException("Unexpected text after value: " + text);
        return v;
    }

    private void ws() { while (i < s.length() && Character.isWhitespace(s.charAt(i))) i++; }

    private Object value() {
        ws();
        if (i >= s.length()) throw new IllegalArgumentException("Unexpected end of input: " + s);
        char c = s.charAt(i);
        if (c == '[') return list();
        if (c == '"') return string();
        if (s.startsWith("null", i)) { i += 4; return null; }
        if (s.startsWith("true", i)) { i += 4; return Boolean.TRUE; }
        if (s.startsWith("false", i)) { i += 5; return Boolean.FALSE; }
        return number();
    }

    private List<Object> list() {
        List<Object> out = new ArrayList<>();
        i++; // [
        ws();
        if (s.charAt(i) == ']') { i++; return out; }
        while (true) {
            out.add(value());
            ws();
            char c = s.charAt(i++);
            if (c == ']') return out;
            if (c != ',') throw new IllegalArgumentException("Expected , or ] at " + (i - 1) + " in " + s);
        }
    }

    private String string() {
        StringBuilder sb = new StringBuilder();
        i++; // opening quote
        while (true) {
            char c = s.charAt(i++);
            if (c == '"') return sb.toString();
            if (c == '\\') {
                char e = s.charAt(i++);
                switch (e) {
                    case 'n': sb.append('\n'); break;
                    case 't': sb.append('\t'); break;
                    case 'r': sb.append('\r'); break;
                    case 'u': sb.append((char) Integer.parseInt(s.substring(i, i + 4), 16)); i += 4; break;
                    default: sb.append(e);
                }
            } else {
                sb.append(c);
            }
        }
    }

    private Object number() {
        int start = i;
        while (i < s.length() && "+-0123456789.eE".indexOf(s.charAt(i)) >= 0) i++;
        String t = s.substring(start, i);
        if (t.isEmpty()) throw new IllegalArgumentException("Bad value at " + start + " in " + s);
        if (t.contains(".") || t.contains("e") || t.contains("E")) return Double.parseDouble(t);
        return Long.parseLong(t);
    }
}
