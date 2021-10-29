import com.sun.jna.*;

public interface AddWrapper extends Library {
    AddWrapper INSTANCE = Native.load("cpp-pinvoke", AddWrapper.class);
    int add(int a, int b);
}
