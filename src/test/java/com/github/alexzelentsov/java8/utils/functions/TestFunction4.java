package com.github.alexzelentsov.java8.utils.functions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class TestFunction4 {

    @Test
    public void apply() {
        Function4<Integer, Integer, Integer, Integer, Integer> function4 = (arg1, arg2, arg3, arg4) -> arg1 + arg2 + arg3 + arg4;
        Integer result = function4.apply(0, 1, 2, 3);
        assertThat(result, is(6));
    }

}