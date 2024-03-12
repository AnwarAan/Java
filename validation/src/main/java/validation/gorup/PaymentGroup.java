package validation.gorup;

import jakarta.validation.GroupSequence;
import jakarta.validation.groups.Default;

@GroupSequence(value = { Default.class, CreditCardGroup.class, VirtualAccountGroup.class })

public interface PaymentGroup {

}
