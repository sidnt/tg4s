package tg4s.models

/**
  * OrderInfo
  * This object represents information about an order.
  *
  * @param	name	Optional. User name
  * @param	phone_number	Optional. User's phone number
  * @param	email	Optional. User email
  * @param	shipping_address	Optional. User shipping address
  *
  */

case class OrderInfo(
                      name: Option[String] = None,
                      phone_number: Option[String] = None,
                      email: Option[String] = None,
                      shipping_address: Option[ShippingAddress] = None
                    )
