package org.w3c.dom;

public interface Node
{
    public static final short ATTRIBUTE_NODE = 2;
    public static final short CDATA_SECTION_NODE = 4;
    public static final short COMMENT_NODE = 8;
    public static final short DOCUMENT_FRAGMENT_NODE = 11;
    public static final short DOCUMENT_NODE = 9;
    public static final short DOCUMENT_POSITION_CONTAINED_BY = 16;
    public static final short DOCUMENT_POSITION_CONTAINS = 8;
    public static final short DOCUMENT_POSITION_DISCONNECTED = 1;
    public static final short DOCUMENT_POSITION_FOLLOWING = 4;
    public static final short DOCUMENT_POSITION_IMPLEMENTATION_SPECIFIC = 32;
    public static final short DOCUMENT_POSITION_PRECEDING = 2;
    public static final short DOCUMENT_TYPE_NODE = 10;
    public static final short ELEMENT_NODE = 1;
    public static final short ENTITY_NODE = 6;
    public static final short ENTITY_REFERENCE_NODE = 5;
    public static final short NOTATION_NODE = 12;
    public static final short PROCESSING_INSTRUCTION_NODE = 7;
    public static final short TEXT_NODE = 3;
    
    String getNodeName();
    
    String getNodeValue() throws DOMException;
    
    void setNodeValue(final String p0) throws DOMException;
    
    short getNodeType();
    
    Node getParentNode();
    
    NodeList getChildNodes();
    
    Node getFirstChild();
    
    Node getLastChild();
    
    Node getPreviousSibling();
    
    Node getNextSibling();
    
    NamedNodeMap getAttributes();
    
    Document getOwnerDocument();
    
    Node insertBefore(final Node p0, final Node p1) throws DOMException;
    
    Node replaceChild(final Node p0, final Node p1) throws DOMException;
    
    Node removeChild(final Node p0) throws DOMException;
    
    Node appendChild(final Node p0) throws DOMException;
    
    boolean hasChildNodes();
    
    Node cloneNode(final boolean p0);
    
    void normalize();
    
    boolean isSupported(final String p0, final String p1);
    
    String getNamespaceURI();
    
    String getPrefix();
    
    void setPrefix(final String p0) throws DOMException;
    
    String getLocalName();
    
    boolean hasAttributes();
    
    String getBaseURI();
    
    short compareDocumentPosition(final Node p0) throws DOMException;
    
    String getTextContent() throws DOMException;
    
    void setTextContent(final String p0) throws DOMException;
    
    boolean isSameNode(final Node p0);
    
    String lookupPrefix(final String p0);
    
    boolean isDefaultNamespace(final String p0);
    
    String lookupNamespaceURI(final String p0);
    
    boolean isEqualNode(final Node p0);
    
    Object getFeature(final String p0, final String p1);
    
    Object setUserData(final String p0, final Object p1, final UserDataHandler p2);
    
    Object getUserData(final String p0);
}
