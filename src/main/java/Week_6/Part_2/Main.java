package Week_6.Part_2;

public class Main {
    public static void main(String[] args) {
        // Create handlers
        RaiseHandler immediateSupervisor = new ImmediateSupervisor();
        RaiseHandler departmentHead = new DepartmentHead();
        RaiseHandler ceo = new CEO();

        // Set up the chain of responsibility
        immediateSupervisor.setNextHandler(departmentHead);
        departmentHead.setNextHandler(ceo);

        // Test the chain with different raise requests
        RaiseRequest request1 = new RaiseRequest(0.015); // Request within immediate supervisor's authority
        RaiseRequest request2 = new RaiseRequest(0.035); // Request beyond immediate supervisor's authority but within department head's authority
        RaiseRequest request3 = new RaiseRequest(0.06);  // Request beyond department head's authority

        // Process requests
        immediateSupervisor.handleRequest(request1);
        immediateSupervisor.handleRequest(request2);
        immediateSupervisor.handleRequest(request3);
    }
}
