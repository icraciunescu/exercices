package issues02.i101.designPrinciplesSOLID;

public class EmployeeReportFormatter extends ReportFormatter {

    public EmployeeReportFormatter(Employee employee, FormatType formatType) {
        super( employee, formatType );
    }

    public String getFormattedEmployee() {
        return getFormattedValue();
    }

}
