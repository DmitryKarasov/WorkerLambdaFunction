package WorkerLambdaFunction;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
