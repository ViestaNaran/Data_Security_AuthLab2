import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PrinterServant extends UnicastRemoteObject implements PrinterService {

    protected PrinterServant() throws RemoteException {
        super();
    }

    @Override
    public String HelloTest(String input) throws RemoteException{
        return "From server: " + input;
    }

    @Override
    public String print(String filename, String printer) throws RemoteException {
        return "From server: Printing: " + filename + "at: " + printer;
    }

    @Override
    public String queue(String printer) throws RemoteException {
        return "From server: Que for printer: " + printer + "---";
    }

    @Override
    public String topQueue(String printer, int job) throws RemoteException {
        return "From server: Moved job at position: " + job + "to top of " + printer + " que";
    }

    @Override
    public String start() throws RemoteException {
        return "From server: Started print server";
    }

    @Override
    public String stop() throws RemoteException {
        return "From server: Stopped the print server";
    }

    @Override
    public String restart() throws RemoteException {
        return "From server: Restarted print server";
    }

    @Override
    public String status(String printer) throws RemoteException {
        return "From server: Status of printer: " + printer + "printer.status == FULL SPEED AHEAD";
    }

    @Override
    public String readConfig(String parameter) throws RemoteException {
        return "From server: Printer configured to: " + parameter;
    }

    @Override
    public String setConfig(String parameter, String value) throws RemoteException {
        return "From server: Printers config has been set to: " + parameter + "with value: " + value;
    }
}
