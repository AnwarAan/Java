package validation.extrator;

import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.ValueExtractor;
import validation.container.Data;

public class DataValueExtrator implements ValueExtractor<Data<@ExtractedValue ?>> {

  @Override
  public void extractValues(Data<?> originalValue, ValueReceiver receiver) {
    Object data = originalValue.getData();
    receiver.value(null, data);
  }
}
