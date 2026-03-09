package java.nio.file.attribute;

public interface DosFileAttributes extends BasicFileAttributes {
	boolean isReadOnly();

	boolean isHidden();

	boolean isArchive();

	boolean isSystem();
}
