package java.lang.invoke;

import java.util.List;

public interface TypeDescriptor {
	String descriptorString();

	interface OfMethod<F extends OfField<F>, M extends OfMethod<F, M>> extends TypeDescriptor {
		int parameterCount();

		F parameterType(final int p0);

		F returnType();

		F[] parameterArray();

		List<F> parameterList();

		M changeReturnType(final F p0);

		M changeParameterType(final int p0, final F p1);

		M dropParameterTypes(final int p0, final int p1);

		M insertParameterTypes(final int p0, final F... p1);
	}

	interface OfField<F extends OfField<F>> extends TypeDescriptor {
		boolean isArray();

		boolean isPrimitive();

		F componentType();

		F arrayType();
	}
}
