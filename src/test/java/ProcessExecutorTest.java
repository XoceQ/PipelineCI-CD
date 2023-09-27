/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.processexecutor.ProcessExecutor;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Janus
 */
public class ProcessExecutorTest {

    private ProcessExecutor processExecutor;

    public ProcessExecutorTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        processExecutor = new ProcessExecutor();
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testExecute() {
        String testName = "John";

        // Capture the standard output
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        // Call the execute method with testName
        processExecutor.execute(testName);

        // Get the captured output
        String printedMessage = outputStream.toString();

        // Verify that the output contains the expected strings
        assertTrue(printedMessage.contains("Hello, I am " + testName));
    }
}
