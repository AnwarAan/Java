package unit_test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assumptions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.condition.DisabledForJreRange;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.DisabledIfSystemProperties;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnJre;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledForJreRange;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariables;
import org.junit.jupiter.api.condition.EnabledIfSystemProperties;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;
import org.opentest4j.TestAbortedException;

@DisplayNameGeneration(SimpleDisplayNameGenerator.class)
@Tag("unit-test")
public class CalculatorTest {

  private Calculator calculator = new Calculator();

  @BeforeAll
  public static void beforeAll() {
    System.out.println("Before Each");
  }

  @AfterAll
  public static void afterAll() {
    System.out.println("After Each");
  }

  @BeforeEach
  public void setUp() {
    System.out.println("Before Each");
  }

  @AfterEach
  public void shutDown() {
    System.out.println("After Each");
  }

  @Test
  // @DisplayName("Add")
  public void testAddSuccess() {
    var result = calculator.add(10, 10);
    assertEquals(20, result);
  }

  @Test
  // @DisplayName("Divide")
  public void testDivideSuccess() {
    assertThrows(IllegalArgumentException.class, () -> {
      calculator.divide(20, 0);
    });
  }

  @Test
  public void testAborted() {
    var profile = System.getenv("PORFILE");
    if (!"DEV".equals(profile)) {
      throw new TestAbortedException("Cancel Test");
    }
  }

  @Test
  public void testAssumption() {
    assumeTrue("DEV".equals(System.getenv("PROFILE")));
  }

  @Test
  @EnabledOnOs(value = { OS.WINDOWS })
  public void onlyRunOnWindows() {
    System.out.println("Enabled");
  }

  @Test
  @DisabledOnOs(value = { OS.WINDOWS })
  public void disableRunOnWindows() {
    System.out.println("Disabled");
  }

  @Test
  @EnabledOnJre(value = { JRE.JAVA_10 })
  public void onlyRunOnJava10() {
    System.out.println("Enabled");
  }

  @Test
  @DisabledOnJre(value = { JRE.JAVA_10 })
  public void disableRunOnJava10() {
    System.out.println("Disabled");
  }

  @Test
  @EnabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_14)
  public void onlyRunOnJava10ToJava12() {
    System.out.println("Enabled");
  }

  @Test
  @DisabledForJreRange(min = JRE.JAVA_10, max = JRE.JAVA_14)
  public void disableRunOnJava10ToJava14() {
    System.out.println("Disabled");
  }

  @Test
  @EnabledIfSystemProperties({ @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle") })
  public void onlyRunOnOracle() {
    System.out.println("Enabled");
  }

  @Test
  @DisabledIfSystemProperties({ @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle") })
  public void disableRunOnOracle() {
    System.out.println("Disabled");
  }

  @Test
  @EnabledIfEnvironmentVariables({ @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV") })
  public void onlyRunOnProfileDev() {
    System.out.println("Enabled");
  }

  @Test
  @DisabledIfEnvironmentVariables({ @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV") })
  public void disableRunOnProfileDev() {
    System.out.println("Disabled");
  }

  @Test
  @Disabled
  public void testComingSoon() {

  }

}

// mvn test -Dgroups=unit-test