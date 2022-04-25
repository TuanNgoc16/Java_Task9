// Sesson 6
// 1.1

public class NativeModifier {
    native void nativeMethod();
    static {
        System.loadLibrary("NativeMethod Definition");
    }
    public static void main ( String [] args) {
        NativeModifier objNative = new NativeModifier();
        objNative.nativeMethod();
    }
}
