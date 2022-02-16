package facades;

import entities.Employee;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IFacadeTest {
    IFacade facade = new Facade();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllEmployees() {
        System.out.println("Get all employees");
        int actual = facade.getAllEmployees().size();
        int expected = 6;
        assertEquals(expected,actual);
    }

    @Test
    void getHighestPaid() {
        System.out.println("Get highest paid");
        Employee expected = new Employee("Hallur", 19000);
        Employee actual = facade.getHighestPaid();
        assertEquals(expected,actual);
    }

    @Test
    void getAverageSalery() {
        System.out.println("Get average salery");
        Employee expected = new Employee();
        Employee actual = facade.getAverageSalery();
        assertEquals(expected,actual);
    }

    @Test
    void getAllBelowAverage() {
    }


    @Test
    void getWithMostEmployees() {
    }

    @Test
    void getMostExpensiveSalarySum() {
    }

    @Test
    void getDepartmentsWithEmpNamed() {
    }
}