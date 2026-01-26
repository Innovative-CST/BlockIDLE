package android.widget;

public interface HeterogeneousExpandableList
{
    int getGroupType(final int p0);
    
    int getChildType(final int p0, final int p1);
    
    int getGroupTypeCount();
    
    int getChildTypeCount();
}
