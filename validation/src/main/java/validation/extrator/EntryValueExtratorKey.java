package validation.extrator;

import jakarta.validation.valueextraction.ExtractedValue;
import jakarta.validation.valueextraction.ValueExtractor;
import jakarta.validation.valueextraction.ValueExtractor.ValueReceiver;
import validation.container.Entry;

public class EntryValueExtratorKey implements ValueExtractor<Entry<@ExtractedValue ?, ?>> {
  @Override
  public void extractValues(Entry<?, ?> originalValue, ValueReceiver receiver) {
    receiver.keyedValue(null, "key", originalValue.getKey());
  }
}
