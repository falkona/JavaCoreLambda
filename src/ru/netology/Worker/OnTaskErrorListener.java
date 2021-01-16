package ru.netology.Worker;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
