package tg4s.models

/**
  * SuccessfulPayment
  * This object contains basic information about a successful payment.
  *
  * @param	currency	Three-letter ISO 4217 currency code
  * @param	total_amount	Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
  * @param	invoice_payload	Bot specified invoice payload
  * @param	shipping_option_id	Optional. Identifier of the shipping option chosen by the user
  * @param	order_info	Optional. Order info provided by the user
  * @param	telegram_payment_charge_id	Telegram payment identifier
  * @param	provider_payment_charge_id	Provider payment identifier
  *
  */

case class SuccessfulPayment(
                              currency: String,
                              total_amount: Int,
                              invoice_payload: String,
                              shipping_option_id: Option[String] = None,
                              order_info: Option[OrderInfo] = None,
                              telegram_payment_charge_id: String,
                              provider_payment_charge_id: String
                            )
