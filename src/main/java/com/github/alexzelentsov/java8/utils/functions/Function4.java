package com.github.alexzelentsov.java8.utils.functions;


/**
 * Represents a function that accepts 4 arguments and produces a result.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(Object, Object, Object, Object)}.
 *
 * @param <T1> the type of the 1 input param
 * @param <T2> the type of the 2 input param
 * @param <T3> the type of the 3 input param
 * @param <T4> the type of the 4 input param

 * @param <R> the type of the result of the function
 *
 *
 * Created by alexander.zelentsov on 24.07.2017.
 */
@FunctionalInterface
public interface Function4<T1, T2, T3, T4, R> {

        /**
         * Applies this function to the given argument.
         *
         * @param arg1 the function 1 argument
         * @param arg2 the function 2 argument
         * @param arg3 the function 3 argument
         * @param arg4 the function 4 argument

         * @return the function result
         */
        R apply(T1 arg1, T2 arg2, T3 arg3, T4 arg4);
}
