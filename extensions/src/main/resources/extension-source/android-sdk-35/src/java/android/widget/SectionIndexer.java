package android.widget;

public interface SectionIndexer
{
    Object[] getSections();
    
    int getPositionForSection(final int p0);
    
    int getSectionForPosition(final int p0);
}
