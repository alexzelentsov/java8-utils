package com.github.alexzelentsov.java8.utils.functions;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class TestFunction3 {

    @Test
    public void apply() {
        Function3<Integer, Integer, Integer, Integer> function3 = (arg1, arg2, arg3) -> arg1 + arg2 + arg3;
        Integer result = function3.apply(0, 1, 2);
        assertThat(result, is(3));
    }

}