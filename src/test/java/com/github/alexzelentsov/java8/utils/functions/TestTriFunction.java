package com.github.alexzelentsov.java8.utils.functions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class TestTriFunction {

    @Test
    public void apply() {
        TriFunction<Integer, Integer, Integer, Integer> triFunction = (arg1, arg2, arg3) -> arg1 + arg2 + arg3;
        Integer result = triFunction.apply(1, 2, 3);
        assertThat(result, is(6));
    }

}