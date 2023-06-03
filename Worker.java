package WorkerLambdaFunction;

public class Worker {
    OnTaskDoneListener callback;
    OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void doStuff() {
        for (int i = 0; i <= 10; i++) {
            if (i == 3) {
                errorCallback.onError("Can`t count to " + i + " :(");
                continue;
            }
            callback.onDone("Count to " + i + "!");
        }
    }
}

