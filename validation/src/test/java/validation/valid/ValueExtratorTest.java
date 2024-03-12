package validation.valid;

import org.junit.jupiter.api.Test;

import validation.container.Data;
import validation.container.DataInteger;
import validation.validation.SampleData;
import validation.validation.SampleDataInteger;
import validation.validation.SampleEntry;
import validation.container.Entry;

public class ValueExtratorTest extends AbstractValidatorTest {
  @Test
  void testSampleData() {

    SampleData data = new SampleData();
    data.setData(new Data<>());
    data.getData().setData("   ");

    validate(data);

  }

  @Test
  void testSampleEntry() {

    SampleEntry sampleEntry = new SampleEntry();
    sampleEntry.setEntry(new Entry<>());
    sampleEntry.getEntry().setKey("");
    sampleEntry.getEntry().setValue("");

    validate(sampleEntry);

  }

  @Test
  void testSampleDataInteger() {

    SampleDataInteger sampleDataInteger = new SampleDataInteger();
    sampleDataInteger.setData(new DataInteger());
    sampleDataInteger.getData().setData(0);

    validate(sampleDataInteger);

  }
}
