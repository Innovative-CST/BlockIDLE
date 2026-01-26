package java.util;

public interface SequencedSet<E> extends SequencedCollection<E>, Set<E> {
	SequencedSet<E> reversed();
}
