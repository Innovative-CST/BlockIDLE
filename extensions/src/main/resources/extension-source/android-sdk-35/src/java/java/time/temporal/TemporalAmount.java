package java.time.temporal;

import java.util.List;

public interface TemporalAmount {
	long get(final TemporalUnit p0);

	List<TemporalUnit> getUnits();

	Temporal addTo(final Temporal p0);

	Temporal subtractFrom(final Temporal p0);
}
