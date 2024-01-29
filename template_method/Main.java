package template_method;

public class Main {
    public static void main(String[] args) {
        AuditTrail at = new AuditTrail();
        Task grt = new GenerateReportTask(at);
        Task tm = new TransferMoneyTask(at);

        grt.execute();
        tm.execute();
    }
}
