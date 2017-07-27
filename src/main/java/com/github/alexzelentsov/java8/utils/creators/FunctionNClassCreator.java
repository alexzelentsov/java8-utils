package com.github.alexzelentsov.java8.utils.creators;

import java.io.IOException;
import java.net.URISyntaxException;

/**
 * Class for creation Function with N args.
 *
 * Created by alexander.zelentsov on 24.07.2017.
 */
public class FunctionNClassCreator {

    public static final String FUNCTION_TEMPLATE_FILE_NAME = "function_template";
    public static final String FUNCTION_TEST_TEMPLATE_FILE_NAME = "function_test_template";

    private static void createClassesForFunctionN(int i) throws URISyntaxException, IOException {
        CommonClassCreator.createClass(i, FUNCTION_TEMPLATE_FILE_NAME, "Function");
        CommonClassCreator.createTestClass(i,FUNCTION_TEST_TEMPLATE_FILE_NAME, "TestFunction");
    }


}
