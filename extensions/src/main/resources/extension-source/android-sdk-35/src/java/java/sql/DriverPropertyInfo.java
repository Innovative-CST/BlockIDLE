package java.sql;

public class DriverPropertyInfo {
	public String[] choices;
	public String description;
	public String name;
	public boolean required;
	public String value;

	public DriverPropertyInfo(final String name, final String value) {
		this.required = false;
		throw new RuntimeException("Stub!");
	}
}
