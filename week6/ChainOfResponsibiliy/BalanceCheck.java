package week6.ChainOfResponsibiliy;

class BalanceCheck extends Handler {
    @Override
    public void handle(Request request) {
        if (request.getClientBalance() >= request.getRequiredBalance()) {
            System.out.println("Client balance is sufficient.");
            if (nextHandler != null) {
                nextHandler.handle(request);
            }
        } else {
            System.out.println("Insufficient balance.");
        }
    }
}
