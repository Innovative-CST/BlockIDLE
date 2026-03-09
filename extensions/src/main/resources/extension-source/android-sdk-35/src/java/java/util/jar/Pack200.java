package java.util.jar;

import java.beans.PropertyChangeListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.SortedMap;

public abstract class Pack200 {
	Pack200() {
		throw new RuntimeException("Stub!");
	}

	public static synchronized Packer newPacker() {
		throw new RuntimeException("Stub!");
	}

	public static Unpacker newUnpacker() {
		throw new RuntimeException("Stub!");
	}

	public interface Packer {
		String CLASS_ATTRIBUTE_PFX = "pack.class.attribute.";
		String CODE_ATTRIBUTE_PFX = "pack.code.attribute.";
		String DEFLATE_HINT = "pack.deflate.hint";
		String EFFORT = "pack.effort";
		String ERROR = "error";
		String FALSE = "false";
		String FIELD_ATTRIBUTE_PFX = "pack.field.attribute.";
		String KEEP = "keep";
		String KEEP_FILE_ORDER = "pack.keep.file.order";
		String LATEST = "latest";
		String METHOD_ATTRIBUTE_PFX = "pack.method.attribute.";
		String MODIFICATION_TIME = "pack.modification.time";
		String PASS = "pass";
		String PASS_FILE_PFX = "pack.pass.file.";
		String PROGRESS = "pack.progress";
		String SEGMENT_LIMIT = "pack.segment.limit";
		String STRIP = "strip";
		String TRUE = "true";
		String UNKNOWN_ATTRIBUTE = "pack.unknown.attribute";

		SortedMap<String, String> properties();

		void pack(final JarFile p0, final OutputStream p1) throws IOException;

		void pack(final JarInputStream p0, final OutputStream p1) throws IOException;

		@Deprecated
		default void addPropertyChangeListener(final PropertyChangeListener listener) {
			throw new RuntimeException("Stub!");
		}

		@Deprecated
		default void removePropertyChangeListener(final PropertyChangeListener listener) {
			throw new RuntimeException("Stub!");
		}
	}

	public interface Unpacker {
		String DEFLATE_HINT = "unpack.deflate.hint";
		String FALSE = "false";
		String KEEP = "keep";
		String PROGRESS = "unpack.progress";
		String TRUE = "true";

		SortedMap<String, String> properties();

		void unpack(final InputStream p0, final JarOutputStream p1) throws IOException;

		void unpack(final File p0, final JarOutputStream p1) throws IOException;

		@Deprecated
		default void addPropertyChangeListener(final PropertyChangeListener listener) {
			throw new RuntimeException("Stub!");
		}

		@Deprecated
		default void removePropertyChangeListener(final PropertyChangeListener listener) {
			throw new RuntimeException("Stub!");
		}
	}
}
