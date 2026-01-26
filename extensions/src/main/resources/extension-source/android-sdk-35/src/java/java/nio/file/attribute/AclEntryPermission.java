package java.nio.file.attribute;

public enum AclEntryPermission {
	READ_DATA, WRITE_DATA, APPEND_DATA, READ_NAMED_ATTRS, WRITE_NAMED_ATTRS, EXECUTE, DELETE_CHILD, READ_ATTRIBUTES, WRITE_ATTRIBUTES, DELETE, READ_ACL, WRITE_ACL, WRITE_OWNER, SYNCHRONIZE;

	public static final AclEntryPermission ADD_FILE;
	public static final AclEntryPermission ADD_SUBDIRECTORY;
	public static final AclEntryPermission LIST_DIRECTORY;

	static {
		ADD_FILE = null;
		ADD_SUBDIRECTORY = null;
		LIST_DIRECTORY = null;
	}
}
