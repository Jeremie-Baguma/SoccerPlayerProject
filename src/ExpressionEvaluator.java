//Read expression from file and execute it
//Task:create txt file with your name exp: Huseyin.txt
//inside of Huseyin.txt write some expression.
//Huseyin.txt
//15 - 22 + 25 - 18 + 19
//Note: Just + and - operators.
//Note: it may be too many numbers.

import java.io.*;
import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;

public class ExpressionEvaluator {

    public static void main(String[] args) {
        try {
            // Path to your file
            File file = new File("Jeremie.txt");

            // Read the file content
            BufferedReader br = new BufferedReader(new FileReader(file));
            String expression = br.readLine();
            br.close();

            // Use the JavaScript engine to evaluate the expression
            ScriptEngineManager manager = new ScriptEngineManager();
            ScriptEngine engine = manager.getEngineByName("JavaScript");

            // Evaluate the expression
            Object result = engine.eval(expression);
            System.out.println("Result: " + result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
