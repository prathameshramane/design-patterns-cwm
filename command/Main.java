package command;

import command.fx.Button;
import command.fx.Command;

public class Main {
    public static void main(String[] args) {
        // Standar command pattern implementation
        CustomerService service = new CustomerService();
        Command command = new AddCustomerCommand(service);
        Button button = new Button(command);

        button.setLabel("Add Customer");
        button.click();
    }
}
