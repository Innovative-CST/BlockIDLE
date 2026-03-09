package java.util.zip;

import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;

public class ZipEntry implements Cloneable {
	public static final int CENATT = 36;
	public static final int CENATX = 38;
	public static final int CENCOM = 32;
	public static final int CENCRC = 16;
	public static final int CENDSK = 34;
	public static final int CENEXT = 30;
	public static final int CENFLG = 8;
	public static final int CENHDR = 46;
	public static final int CENHOW = 10;
	public static final int CENLEN = 24;
	public static final int CENNAM = 28;
	public static final int CENOFF = 42;
	public static final long CENSIG = 33639248L;
	public static final int CENSIZ = 20;
	public static final int CENTIM = 12;
	public static final int CENVEM = 4;
	public static final int CENVER = 6;
	public static final int DEFLATED = 8;
	public static final int ENDCOM = 20;
	public static final int ENDHDR = 22;
	public static final int ENDOFF = 16;
	public static final long ENDSIG = 101010256L;
	public static final int ENDSIZ = 12;
	public static final int ENDSUB = 8;
	public static final int ENDTOT = 10;
	public static final int EXTCRC = 4;
	public static final int EXTHDR = 16;
	public static final int EXTLEN = 12;
	public static final long EXTSIG = 134695760L;
	public static final int EXTSIZ = 8;
	public static final int LOCCRC = 14;
	public static final int LOCEXT = 28;
	public static final int LOCFLG = 6;
	public static final int LOCHDR = 30;
	public static final int LOCHOW = 8;
	public static final int LOCLEN = 22;
	public static final int LOCNAM = 26;
	public static final long LOCSIG = 67324752L;
	public static final int LOCSIZ = 18;
	public static final int LOCTIM = 10;
	public static final int LOCVER = 4;
	public static final int STORED = 0;

	public ZipEntry(final String name) {
		throw new RuntimeException("Stub!");
	}

	public ZipEntry(final ZipEntry e) {
		throw new RuntimeException("Stub!");
	}

	public String getName() {
		throw new RuntimeException("Stub!");
	}

	public void setTime(final long time) {
		throw new RuntimeException("Stub!");
	}

	public long getTime() {
		throw new RuntimeException("Stub!");
	}

	public void setTimeLocal(final LocalDateTime time) {
		throw new RuntimeException("Stub!");
	}

	public LocalDateTime getTimeLocal() {
		throw new RuntimeException("Stub!");
	}

	public ZipEntry setLastModifiedTime(final FileTime time) {
		throw new RuntimeException("Stub!");
	}

	public FileTime getLastModifiedTime() {
		throw new RuntimeException("Stub!");
	}

	public ZipEntry setLastAccessTime(final FileTime time) {
		throw new RuntimeException("Stub!");
	}

	public FileTime getLastAccessTime() {
		throw new RuntimeException("Stub!");
	}

	public ZipEntry setCreationTime(final FileTime time) {
		throw new RuntimeException("Stub!");
	}

	public FileTime getCreationTime() {
		throw new RuntimeException("Stub!");
	}

	public void setSize(final long size) {
		throw new RuntimeException("Stub!");
	}

	public long getSize() {
		throw new RuntimeException("Stub!");
	}

	public long getCompressedSize() {
		throw new RuntimeException("Stub!");
	}

	public void setCompressedSize(final long csize) {
		throw new RuntimeException("Stub!");
	}

	public void setCrc(final long crc) {
		throw new RuntimeException("Stub!");
	}

	public long getCrc() {
		throw new RuntimeException("Stub!");
	}

	public void setMethod(final int method) {
		throw new RuntimeException("Stub!");
	}

	public int getMethod() {
		throw new RuntimeException("Stub!");
	}

	public void setExtra(final byte[] extra) {
		throw new RuntimeException("Stub!");
	}

	public byte[] getExtra() {
		throw new RuntimeException("Stub!");
	}

	public void setComment(final String comment) {
		throw new RuntimeException("Stub!");
	}

	public String getComment() {
		throw new RuntimeException("Stub!");
	}

	public boolean isDirectory() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	public Object clone() {
		throw new RuntimeException("Stub!");
	}
}
