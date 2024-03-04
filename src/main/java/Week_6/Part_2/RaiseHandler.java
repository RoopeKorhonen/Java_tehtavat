package Week_6.Part_2;

interface RaiseHandler {
    void handleRequest(RaiseRequest request);
    void setNextHandler(RaiseHandler handler);
}