package week6.ChainOfResponsibiliy;

abstract class Handler {
    protected Handler nextHandler;
    public Handler setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
        return nextHandler;
    }
    public abstract void handle(Request request);
}
