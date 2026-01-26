package java.security.cert;

import java.util.Iterator;
import java.util.Set;

public interface PolicyNode {
	PolicyNode getParent();

	Iterator<? extends PolicyNode> getChildren();

	int getDepth();

	String getValidPolicy();

	Set<? extends PolicyQualifierInfo> getPolicyQualifiers();

	Set<String> getExpectedPolicies();

	boolean isCritical();
}
