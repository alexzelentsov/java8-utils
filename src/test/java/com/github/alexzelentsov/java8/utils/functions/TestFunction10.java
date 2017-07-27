package com.github.alexzelentsov.java8.utils.functions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class TestFunction10 {

    @Test
    public void apply() {
        Function10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> function10 = (arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) -> arg1 + arg2 + arg3 + arg4 + arg5 + arg6 + arg7 + arg8 + arg9 + arg10;
        Integer result = function10.apply(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertThat(result, is(45));
    }

}