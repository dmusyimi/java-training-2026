package io.github.talentdevelopment004.lambda;

@FunctionalInterface
public interface Export {
    void export(String a);

    default void print(String content) {

    }

    static void countPages() {

    }

    private void showInfo() {

    }
}
