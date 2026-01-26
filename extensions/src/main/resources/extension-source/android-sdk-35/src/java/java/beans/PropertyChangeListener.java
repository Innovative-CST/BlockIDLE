package java.beans;

import java.util.EventListener;

public interface PropertyChangeListener extends EventListener {
	void propertyChange(final PropertyChangeEvent p0);
}
