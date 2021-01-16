package ru.netology.Worker;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
