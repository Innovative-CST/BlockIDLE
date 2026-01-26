package org.xml.sax;

import java.io.IOException;

public interface EntityResolver
{
    InputSource resolveEntity(final String p0, final String p1) throws IOException, SAXException;
}
