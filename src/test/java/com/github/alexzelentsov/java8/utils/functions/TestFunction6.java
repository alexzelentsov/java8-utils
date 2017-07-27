package com.github.alexzelentsov.java8.utils.functions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class TestFunction6 {

    @Test
    public void apply() {
        Function6<Integer, Integer, Integer, Integer, Integer, Integer, Integer> function6 = (arg1, arg2, arg3, arg4, arg5, arg6) -> arg1 + arg2 + arg3 + arg4 + arg5 + arg6;
        Integer result = function6.apply(0, 1, 2, 3, 4, 5);
        assertThat(result, is(15));
    }

}