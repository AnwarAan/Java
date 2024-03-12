package validation.validation;

import org.hibernate.validator.constraints.LuhnCheck;
import org.hibernate.validator.constraints.Range;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.groups.ConvertGroup;
import jakarta.validation.groups.Default;
import validation.gorup.CreditCardGroup;
import validation.gorup.VirtualAccountGroup;
import validation.payload.EmailErrorPayload;

// public class Payment {
//   @NotBlank(groups = { Default.class, CreditCardGroup.class,
//       VirtualAccountGroup.class }, message = "{order.id.notblank}")
//   @Size(min = 1, max = 10, message = "{order.id.size}")
//   private String orderId;

//   @Range(groups = { Default.class, CreditCardGroup.class,
//       VirtualAccountGroup.class }, min = 10000, max = 100000000, message = "{order.amount.range}")
//   @NotNull(groups = { Default.class, CreditCardGroup.class, VirtualAccountGroup.class }, message = "Not Null")
//   private Long amount;

//   @NotBlank(groups = { Default.class, CreditCardGroup.class }, message = "Not Blank")
//   @LuhnCheck(groups = { Default.class, CreditCardGroup.class }, message = "Invalid credit card", payload = {
//       EmailErrorPayload.class })
//   private String creditCard;

//   @NotBlank(groups = { Default.class, VirtualAccountGroup.class }, message = "Not Blank")
//   private String VirtualAccount;

//   @Valid
//   @NotBlank(groups = { Default.class, VirtualAccountGroup.class, CreditCardGroup.class }, message = "Not Null")
//   @ConvertGroup(from = VirtualAccountGroup.class, to = Default.class)
//   @ConvertGroup(from = CreditCardGroup.class, to = Default.class)
//   private Customer customer;

//   public Payment() {
//   }

//   public Payment(@NotBlank(message = "Not Blank") String orderId,
//       @Range(min = 10000, max = 100000000) @NotNull(message = "Not Null") Long amount,
//       @NotBlank(message = "Not Blank") @LuhnCheck(message = "Invalid credit card") String creditCard) {
//     this.orderId = orderId;
//     this.amount = amount;
//     this.creditCard = creditCard;
//   }

//   public String getOrderId() {
//     return orderId;
//   }

//   public void setOrderId(String orderId) {
//     this.orderId = orderId;
//   }

//   public Long getAmount() {
//     return amount;
//   }

//   public void setAmount(Long amount) {
//     this.amount = amount;
//   }

//   public String getCreditCard() {
//     return creditCard;
//   }

//   public void setCreditCard(String creditCard) {
//     this.creditCard = creditCard;
//   }

//   public String getVirtualAccount() {
//     return VirtualAccount;
//   }

//   public void setVirtualAccount(String virtualAccount) {
//     VirtualAccount = virtualAccount;
//   }

//   public Customer getCustomer() {
//     return customer;
//   }

//   public void setCustomer(Customer customer) {
//     this.customer = customer;
//   }

//   @Override
//   public String toString() {
//     return "Payment [orderId=" + orderId + ", amount=" + amount + ", creditCard=" + creditCard + ", VirtualAccount="
//         + VirtualAccount + ", customer=" + customer + "]";
//   }

// }
public class Payment {

  // @CheckOrderId(groups = { CreditCardGroup.class,
  // VirtualAccountGroup.class }, message = "{order.id.invalid}")
  private String orderId;

  @Range(groups = { CreditCardGroup.class,
      VirtualAccountGroup.class }, min = 10_000L, max = 100_000_000L, message = "{order.amount.range}")
  @NotNull(groups = { CreditCardGroup.class, VirtualAccountGroup.class }, message = "amount can not null")
  private Long amount;

  @LuhnCheck(groups = { CreditCardGroup.class }, message = "invalid credit card number", payload = {
      EmailErrorPayload.class })
  @NotBlank(groups = { CreditCardGroup.class }, message = "credit card can not blank")
  private String creditCard;

  @NotBlank(groups = { VirtualAccountGroup.class }, message = "virtual account can not blank")
  private String virtualAccount;

  @Valid
  @NotNull(groups = { VirtualAccountGroup.class,
      CreditCardGroup.class }, message = "customer can not null")
  @ConvertGroup(from = VirtualAccountGroup.class, to = Default.class)
  @ConvertGroup(from = CreditCardGroup.class, to = Default.class)
  private Customer customer;

  @Override
  public String toString() {
    return "Payment{" +
        "orderId='" + orderId + '\'' +
        ", amount=" + amount +
        ", creditCard='" + creditCard + '\'' +
        ", virtualAccount='" + virtualAccount + '\'' +
        ", customer=" + customer +
        '}';
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public String getVirtualAccount() {
    return virtualAccount;
  }

  public void setVirtualAccount(String virtualAccount) {
    this.virtualAccount = virtualAccount;
  }

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public String getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(String creditCard) {
    this.creditCard = creditCard;
  }
}