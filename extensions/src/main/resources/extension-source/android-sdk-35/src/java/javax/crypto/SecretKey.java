package javax.crypto;

import javax.security.auth.Destroyable;
import java.security.Key;

public interface SecretKey extends Key, Destroyable
{
    public static final long serialVersionUID = -4795878709595146952L;
}
