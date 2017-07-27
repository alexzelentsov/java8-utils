package com.github.alexzelentsov.java8.utils.creators;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Class for creation Function with N args.
 *
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class ConsumerNClassCreator {

    public static final String CONSUMER_TEMPLATE_FILE_NAME = "consumer_template";
    public static final String CONSUMER_TEST_TEMPLATE_FILE_NAME = "consumer_test_template";

    public static void createClassesForConsumerN(int i) throws URISyntaxException, IOException {
        CommonClassCreator.createClass(i, CONSUMER_TEMPLATE_FILE_NAME, "Consumer");
        CommonClassCreator.createTestClass(i,CONSUMER_TEST_TEMPLATE_FILE_NAME, "TestConsumer");
    }

}
