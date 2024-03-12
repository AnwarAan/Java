package validation.extrator;

import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.UnwrapByDefault;
import jakarta.validation.valueextraction.ValueExtractor;
import jakarta.validation.valueextraction.ValueExtractor.ValueReceiver;
import validation.container.Data;
import validation.container.DataInteger;

@UnwrapByDefault
public class DataIntegerValueExtrator implements ValueExtractor<@ExtractedValue(type = Integer.class) DataInteger> {

  @Override
  public void extractValues(DataInteger originalValue, ValueReceiver receiver) {
    receiver.value(null, originalValue.getData());
  }
}
