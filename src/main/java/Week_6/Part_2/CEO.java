package Week_6.Part_2;

class CEO implements RaiseHandler {
    @Override
    public void handleRequest(RaiseRequest request) {
        System.out.println("CEO: Approved the raise request.");
    }

    @Override
    public void setNextHandler(RaiseHandler handler) {
        // CEO is the last in the chain, no next handler
    }
}