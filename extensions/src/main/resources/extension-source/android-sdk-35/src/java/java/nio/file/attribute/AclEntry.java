package java.nio.file.attribute;

import java.util.Set;

public final class AclEntry {
	AclEntry() {
		throw new RuntimeException("Stub!");
	}

	public static Builder newBuilder() {
		throw new RuntimeException("Stub!");
	}

	public static Builder newBuilder(final AclEntry entry) {
		throw new RuntimeException("Stub!");
	}

	public AclEntryType type() {
		throw new RuntimeException("Stub!");
	}

	public UserPrincipal principal() {
		throw new RuntimeException("Stub!");
	}

	public Set<AclEntryPermission> permissions() {
		throw new RuntimeException("Stub!");
	}

	public Set<AclEntryFlag> flags() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public boolean equals(final Object ob) {
		throw new RuntimeException("Stub!");
	}

	@Override
	public int hashCode() {
		throw new RuntimeException("Stub!");
	}

	@Override
	public String toString() {
		throw new RuntimeException("Stub!");
	}

	public static final class Builder {
		Builder() {
			throw new RuntimeException("Stub!");
		}

		public AclEntry build() {
			throw new RuntimeException("Stub!");
		}

		public Builder setType(final AclEntryType type) {
			throw new RuntimeException("Stub!");
		}

		public Builder setPrincipal(final UserPrincipal who) {
			throw new RuntimeException("Stub!");
		}

		public Builder setPermissions(final Set<AclEntryPermission> perms) {
			throw new RuntimeException("Stub!");
		}

		public Builder setPermissions(final AclEntryPermission... perms) {
			throw new RuntimeException("Stub!");
		}

		public Builder setFlags(final Set<AclEntryFlag> flags) {
			throw new RuntimeException("Stub!");
		}

		public Builder setFlags(final AclEntryFlag... flags) {
			throw new RuntimeException("Stub!");
		}
	}
}
