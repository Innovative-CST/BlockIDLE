package android.app.appsearch;

public abstract class Migrator
{
    public Migrator() {
        throw new RuntimeException("Stub!");
    }
    
    public abstract boolean shouldMigrate(final int p0, final int p1);
    
    @NonNull
    public abstract GenericDocument onUpgrade(final int p0, final int p1, @NonNull final GenericDocument p2);
    
    @NonNull
    public abstract GenericDocument onDowngrade(final int p0, final int p1, @NonNull final GenericDocument p2);
}
