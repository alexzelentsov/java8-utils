package com.github.alexzelentsov.java8.utils.creators;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by alexander.zelentsov on 25.07.2017.
 */
public class CommonClassCreator {
    public static final String N_TEMPLATE = "%N%";
    public static final String OBJECTS_TEMPLATE = "%Objects%";
    public static final String PARAMS_TEMPLATE = "%@params%";
    public static final String T_TEMPLATE = "%T%";
    public static final String PARAM_ARGS_TEMPLATE = "%@param args%";
    public static final String T_ARGS_TEMPLATE = "%T args%";
    public static final String INTEGER_TYPES_TEMPLATES = "%Integer%";
    public static final String ARGS_TEMPLATE = "%args%";
    public static final String RETURN_TEMPLATE = "%return%";
    public static final String TEST_PARAMS_TEMPLATE = "%test_params%";
    public static final String RESULT_TEMPLATE = "%result%";

    public static void createClass(int n, String templateName, String className) throws URISyntaxException, IOException {
        Path path = Paths.get(ClassLoader.getSystemResource(templateName).toURI());
        String content = new String(Files.readAllBytes(path));
        String replaced = content.replaceAll(N_TEMPLATE, String.valueOf(n))
                .replaceAll(OBJECTS_TEMPLATE, getObjectReplacement(n))
                .replaceAll(PARAMS_TEMPLATE, getParamsReplacement(n))
                .replaceAll(T_TEMPLATE, getTReplacement(n))
                .replaceAll(PARAM_ARGS_TEMPLATE, getParamsArgsReplacement(n))
                .replaceAll(T_ARGS_TEMPLATE, getTArgsReplacement(n));
        saveFile(n, replaced, className);
    }

    public static void createTestClass(int n, String templateName, String className) throws URISyntaxException, IOException {
        Path path = Paths.get(ClassLoader.getSystemResource(templateName).toURI());
        String content = new String(Files.readAllBytes(path));
        String replaced = content.replaceAll(N_TEMPLATE, String.valueOf(n))
                .replaceAll(INTEGER_TYPES_TEMPLATES, getIntegerTypesReplacement(n))
                .replaceAll(ARGS_TEMPLATE, getArgsReplacement(n))
                .replaceAll(RETURN_TEMPLATE, getReturnReplacement(n))
                .replaceAll(TEST_PARAMS_TEMPLATE, getTestParamsReplacement(n))
                .replaceAll(RESULT_TEMPLATE, getResultReplacement(n));
        saveFile(n, replaced, className);
    }

    private static String getParamsReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        String str = " * @param <T%n%> the type of the %n% input param\n";
        for (int i = 0; i < n; i++) {
            builder.append(str.replaceAll("%n%", String.valueOf(i + 1)));
        }
        return builder.toString();
    }

    private static String getObjectReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("Object, ");
        }
        builder.delete(builder.lastIndexOf(","), builder.length());
        return builder.toString();
    }

    private static String getTReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("T").append(i + 1).append(", ");
        }
        builder.delete(builder.lastIndexOf(","), builder.length());
        return builder.toString();
    }

    private static String getParamsArgsReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        String str = "         * @param arg%n% the function %n% argument\n";
        for (int i = 0; i < n; i++) {
            builder.append(str.replaceAll("%n%", String.valueOf(i + 1)));
        }
        return builder.toString();
    }

    private static String getTArgsReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("T")
                    .append(i + 1)
                    .append(" arg")
                    .append(i + 1)
                    .append(", ");
        }
        builder.delete(builder.lastIndexOf(","), builder.length());
        return builder.toString();
    }

    private static String getIntegerTypesReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("Integer, ");
        }
        builder.delete(builder.lastIndexOf(","), builder.length());
        return builder.toString();
    }

    private static String getArgsReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("arg").append(i + 1).append(", ");
        }
        builder.delete(builder.lastIndexOf(","), builder.length());
        return builder.toString();
    }

    private static String getReturnReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append("arg").append(i + 1).append(" + ");
        }
        builder.delete(builder.lastIndexOf(" +"), builder.length());
        return builder.toString();
    }

    private static String getTestParamsReplacement(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(i + ", ");
        }
        builder.delete(builder.lastIndexOf(","), builder.length());
        return builder.toString();
    }

    private static String getResultReplacement(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            result += i;
        }

        return String.valueOf(result);
    }

    private static void saveFile(int n, String replaced, String fileName) throws IOException {
        Path currentRelativePath = Paths.get("");
        String s = currentRelativePath.toAbsolutePath().toString();
        Files.write(Paths.get(s + "/" + fileName + n +".java"), replaced.getBytes());
    }
}
