package com.github.alexzelentsov.java8.utils.consumers;

import org.junit.Test;

/**
 * Created by alexander.zelentsov on 25.07.2017.
 */
public class TestConsumer9 {
    @Test
    public void accept() throws Exception {
        Consumer9<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> consumer9 = (arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9) -> {};
        consumer9.accept(0, 1, 2, 3, 4, 5, 6, 7, 8);
    }

}