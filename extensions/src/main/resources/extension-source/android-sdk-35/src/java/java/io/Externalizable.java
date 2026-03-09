package java.io;

public interface Externalizable extends Serializable {
	void writeExternal(final ObjectOutput p0) throws IOException;

	void readExternal(final ObjectInput p0) throws ClassNotFoundException, IOException;
}
