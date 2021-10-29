

public class Program {
    public static void main(String args[])
    {
        AddWrapper wrapper = AddWrapper.INSTANCE;
        int r = wrapper.add(1, 3);
        System.out.println(r);
    }
}
