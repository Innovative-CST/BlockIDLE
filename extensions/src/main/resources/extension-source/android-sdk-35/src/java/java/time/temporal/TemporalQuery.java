package java.time.temporal;

@FunctionalInterface
public interface TemporalQuery<R> {
	R queryFrom(final TemporalAccessor p0);
}
