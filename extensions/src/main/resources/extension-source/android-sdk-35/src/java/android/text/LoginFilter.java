package android.text;

@Deprecated
public abstract class LoginFilter implements InputFilter
{
    LoginFilter() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    @Override
    public CharSequence filter(final CharSequence source, final int start, final int end, final Spanned dest, final int dstart, final int dend) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onStart() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onInvalidCharacter(final char c) {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public void onStop() {
        throw new RuntimeException("Stub!");
    }
    
    @Deprecated
    public abstract boolean isAllowed(final char p0);
    
    @Deprecated
    public static class PasswordFilterGMail extends LoginFilter
    {
        @Deprecated
        public PasswordFilterGMail() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public PasswordFilterGMail(final boolean appendInvalid) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public boolean isAllowed(final char c) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class UsernameFilterGMail extends LoginFilter
    {
        @Deprecated
        public UsernameFilterGMail() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public UsernameFilterGMail(final boolean appendInvalid) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public boolean isAllowed(final char c) {
            throw new RuntimeException("Stub!");
        }
    }
    
    @Deprecated
    public static class UsernameFilterGeneric extends LoginFilter
    {
        @Deprecated
        public UsernameFilterGeneric() {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        public UsernameFilterGeneric(final boolean appendInvalid) {
            throw new RuntimeException("Stub!");
        }
        
        @Deprecated
        @Override
        public boolean isAllowed(final char c) {
            throw new RuntimeException("Stub!");
        }
    }
}
