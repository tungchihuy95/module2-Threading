package DemoSynchronization;

public class Table {
    void printTable(int n) {
        //method khong synchronized
        for (int i = 1; i <= 5; i++) {
            System.out.println(n);
        }
    }
}
