package com.github.alexzelentsov.java8.utils.functions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class TestFunction8 {

    @Test
    public void apply() {
        Function8<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> function8 = (arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8) -> arg1 + arg2 + arg3 + arg4 + arg5 + arg6 + arg7 + arg8;
        Integer result = function8.apply(0, 1, 2, 3, 4, 5, 6, 7);
        assertThat(result, is(28));
    }

}