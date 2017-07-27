package com.github.alexzelentsov.java8.utils.consumers;

/**
 * Represents an operation that accepts a 3 input arguments and returns no
 * result.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object, Object, Object)}.
 *
 * @param <T1> the type of the 1 input param
 * @param <T2> the type of the 2 input param
 * @param <T3> the type of the 3 input param

 *
 * Created by alexander.zelentsov on 24.07.2017.
 */
@FunctionalInterface
public interface Consumer3<T1, T2, T3> {
        /**
         * Performs this operation on the given arguments.
         *
         * @param arg1 the function 1 argument
         * @param arg2 the function 2 argument
         * @param arg3 the function 3 argument

         */
        void accept(T1 arg1, T2 arg2, T3 arg3);
}
