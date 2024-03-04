package Week_6.Part_2;

class DepartmentHead implements RaiseHandler {
    private RaiseHandler nextHandler;

    @Override
    public void handleRequest(RaiseRequest request) {
        if (request.getAmount() <= 0.05) {
            System.out.println("Department head: Approved the raise request.");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(RaiseHandler handler) {
        nextHandler = handler;
    }
}