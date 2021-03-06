package FactorialExercise;

import com.opencsv.CSVWriter;

import java.io.FileWriter;
import java.util.List;

public class CSVWrite {

    public static void main(String[] args) throws Exception {

        List<Integer> ValueList = CSVRead.InputValues();
        long CalculationValue = 0;
        String line = "";
        String csv = "/Users/PiotrM/workspace/csv/results.csv";
        CSVWriter writer = new CSVWriter(new FileWriter(csv));

        for (int i : ValueList) {
            CalculationValue = FactorialCalculation.Factorial(i);

            if (CalculationValue > 0) {
                line = i + "! = " + CalculationValue;
            } else
                line = "N/A";
            writer.writeNext(new String[]{line});
        }
        writer.close();
    }
}
