package com.github.alexzelentsov.java8.utils.consumers;

import org.junit.Test;

/**
 * Created by alexander.zelentsov on 25.07.2017.
 */
public class TestConsumer6 {
    @Test
    public void accept() throws Exception {
        Consumer6<Integer, Integer, Integer, Integer, Integer, Integer> consumer6 = (arg1, arg2, arg3, arg4, arg5, arg6) -> {};
        consumer6.accept(0, 1, 2, 3, 4, 5);
    }

}