package com.github.alexzelentsov.java8.utils.functions;


/**
 * Represents a function that accepts 3 arguments and produces a result.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #apply(Object, Object, Object)}.
 *
 * This interface is the same like {@link Function3}.
 * Created because this name is very popular in the internet.
 *
 * @param <T1> the type of the input to the function
 * @param <T2> the type of the input to the function
 * @param <T3> the type of the input to the function
 * @param <R> the type of the result of the function
 *
 * Created by alexander.zelentsov on 24.07.2017.
 */
@FunctionalInterface
public interface TriFunction<T1, T2, T3, R> {

        /**
         * Applies this function to the given argument.
         *
         * @param arg1 the function 1st argument
         * @param arg2 the function 2st argument
         * @param arg3 the function 3st argument
         * @return the function result
         */
        R apply(T1 arg1, T2 arg2, T3 arg3);
}
