package java.io;

public interface ObjectStreamConstants {
	int PROTOCOL_VERSION_1 = 1;
	int PROTOCOL_VERSION_2 = 2;
	byte SC_BLOCK_DATA = 8;
	byte SC_ENUM = 16;
	byte SC_EXTERNALIZABLE = 4;
	byte SC_SERIALIZABLE = 2;
	byte SC_WRITE_METHOD = 1;
	short STREAM_MAGIC = -21267;
	short STREAM_VERSION = 5;
	SerializablePermission SUBCLASS_IMPLEMENTATION_PERMISSION = null;
	SerializablePermission SUBSTITUTION_PERMISSION = null;
	byte TC_ARRAY = 117;
	byte TC_BASE = 112;
	byte TC_BLOCKDATA = 119;
	byte TC_BLOCKDATALONG = 122;
	byte TC_CLASS = 118;
	byte TC_CLASSDESC = 114;
	byte TC_ENDBLOCKDATA = 120;
	byte TC_ENUM = 126;
	byte TC_EXCEPTION = 123;
	byte TC_LONGSTRING = 124;
	byte TC_MAX = 126;
	byte TC_NULL = 112;
	byte TC_OBJECT = 115;
	byte TC_PROXYCLASSDESC = 125;
	byte TC_REFERENCE = 113;
	byte TC_RESET = 121;
	byte TC_STRING = 116;
	int baseWireHandle = 8257536;
}
