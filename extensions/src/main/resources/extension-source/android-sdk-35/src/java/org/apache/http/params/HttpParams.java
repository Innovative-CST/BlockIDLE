package org.apache.http.params;

@Deprecated
public interface HttpParams
{
    @Deprecated
    Object getParameter(final String p0);
    
    @Deprecated
    HttpParams setParameter(final String p0, final Object p1);
    
    @Deprecated
    HttpParams copy();
    
    @Deprecated
    boolean removeParameter(final String p0);
    
    @Deprecated
    long getLongParameter(final String p0, final long p1);
    
    @Deprecated
    HttpParams setLongParameter(final String p0, final long p1);
    
    @Deprecated
    int getIntParameter(final String p0, final int p1);
    
    @Deprecated
    HttpParams setIntParameter(final String p0, final int p1);
    
    @Deprecated
    double getDoubleParameter(final String p0, final double p1);
    
    @Deprecated
    HttpParams setDoubleParameter(final String p0, final double p1);
    
    @Deprecated
    boolean getBooleanParameter(final String p0, final boolean p1);
    
    @Deprecated
    HttpParams setBooleanParameter(final String p0, final boolean p1);
    
    @Deprecated
    boolean isParameterTrue(final String p0);
    
    @Deprecated
    boolean isParameterFalse(final String p0);
}
