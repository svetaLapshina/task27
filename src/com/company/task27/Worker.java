package com.company.task27;

public class Worker {

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    private int taskId;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback, int taskId) {
        this.callback = callback;
        this.errorCallback = errorCallback;
        this.taskId = taskId;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == taskId) {
                errorCallback.onError("Task " + i + " has ERROR");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
