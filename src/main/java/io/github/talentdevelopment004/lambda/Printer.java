package io.github.talentdevelopment004.lambda;

@FunctionalInterface
public interface Printer {
    String print(String content, String path);
}