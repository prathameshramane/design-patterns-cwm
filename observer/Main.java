package observer;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DataSource();
        SpreedSheet spreedSheet = new SpreedSheet(dataSource);
        PieChart pieChart = new PieChart(dataSource);

        dataSource.addObserver(spreedSheet);
        dataSource.addObserver(pieChart);

        dataSource.setValue(10);

        System.out.println("Spreedsheet: " + spreedSheet.getValue());
        System.out.println("Pie Chart: " + pieChart.getValue());
    }
}
