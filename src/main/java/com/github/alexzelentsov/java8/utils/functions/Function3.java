package com.github.alexzelentsov.java8.utils.functions;


/**
 * Represents a function that accepts 3 arguments and produces a result.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose fu`nctional method is {@link #apply(Object, Object, Object)}.
 *
 * @param <T1> the type of the 1st input param
 * @param <T2> the type of the 2nd input param
 * @param <T3> the type of the 3rd to the function
 * @param <R> the type of the result of the function
 *
 * This interface is the same like {@link TriFunction}.
 *
 * Created by alexander.zelentsov on 24.07.2017.
 */
@FunctionalInterface
public interface Function3<T1, T2, T3, R> {

        /**
         * Applies this function to the given argument.
         *
         * @param arg1 the function 1st argument
         * @param arg2 the function 2nd argument
         * @param arg3 the function 3rd argument
         * @return the function result
         */
        R apply(T1 arg1, T2 arg2, T3 arg3);
}
