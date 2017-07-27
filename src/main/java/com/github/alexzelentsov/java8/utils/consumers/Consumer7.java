package com.github.alexzelentsov.java8.utils.consumers;

/**
 * Represents an operation that accepts a 7 input arguments and returns no
 * result.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #accept(Object, Object, Object, Object, Object, Object, Object)}.
 *
 * @param <T1> the type of the 1 input param
 * @param <T2> the type of the 2 input param
 * @param <T3> the type of the 3 input param
 * @param <T4> the type of the 4 input param
 * @param <T5> the type of the 5 input param
 * @param <T6> the type of the 6 input param
 * @param <T7> the type of the 7 input param

 *
 * Created by alexander.zelentsov on 24.07.2017.
 */
@FunctionalInterface
public interface Consumer7<T1, T2, T3, T4, T5, T6, T7> {
        /**
         * Performs this operation on the given arguments.
         *
         * @param arg1 the function 1 argument
         * @param arg2 the function 2 argument
         * @param arg3 the function 3 argument
         * @param arg4 the function 4 argument
         * @param arg5 the function 5 argument
         * @param arg6 the function 6 argument
         * @param arg7 the function 7 argument

         */
        void accept(T1 arg1, T2 arg2, T3 arg3, T4 arg4, T5 arg5, T6 arg6, T7 arg7);
}
