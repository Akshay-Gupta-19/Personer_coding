package com.mycompany.mavenproject3;

import java.util.Comparator;

/**
 *
 * @author Pieter van den Hombergh {@code pieter.van.den.hombergh@gmail.com}
 */
public class CountingComparator<E> implements Comparator<E> {

    private final Comparator<E> wrapped;

    public CountingComparator( Comparator<E> wrapped ) {
        this.wrapped = wrapped;
    }

    private long count = 0L;

    @Override
    public int compare( E o1, E o2 ) {
        count++;
        return wrapped.compare( o1, o2 );
    }

    public long getCount() {
        return count;
    }
}
