package java.time.temporal;

@FunctionalInterface
public interface TemporalAdjuster {
	Temporal adjustInto(final Temporal p0);
}
