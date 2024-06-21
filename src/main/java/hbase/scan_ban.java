package hbase;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

public class scan_ban {
    public static void main(String[] args) throws Exception {
        Configuration configuration = HBaseConfiguration.create();
        Connection connection = ConnectionFactory.createConnection(configuration);
        TableName tableName = TableName.valueOf("CLASS_SIGNIN_TABLE");
        Table table = connection.getTable(tableName);

        Scan scan = new Scan();
        scan.setRowPrefixFilter(Bytes.toBytes("5672"));

        ResultScanner scanner = table.getScanner(scan);
        for (Result result : scanner) {
            // Process the result
            System.out.println(result);
        }

        scanner.close();
        table.close();
        connection.close();
    }
}