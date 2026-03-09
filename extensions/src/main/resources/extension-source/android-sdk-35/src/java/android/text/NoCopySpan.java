package android.text;

public interface NoCopySpan
{
    public static class Concrete implements NoCopySpan
    {
        public Concrete() {
            throw new RuntimeException("Stub!");
        }
    }
}
