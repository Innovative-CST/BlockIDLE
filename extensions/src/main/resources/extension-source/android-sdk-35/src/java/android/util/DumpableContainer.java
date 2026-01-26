package android.util;

public interface DumpableContainer
{
    boolean addDumpable(@NonNull final Dumpable p0);
    
    boolean removeDumpable(@NonNull final Dumpable p0);
}
