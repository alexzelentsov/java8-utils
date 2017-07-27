package com.github.alexzelentsov.java8.utils.consumers;

import org.junit.Test;

/**
 * Created by alexander.zelentsov on 25.07.2017.
 */
public class TestConsumer10 {
    @Test
    public void accept() throws Exception {
        Consumer10<Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer, Integer> consumer10 = (arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10) -> {};
        consumer10.accept(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    }

}