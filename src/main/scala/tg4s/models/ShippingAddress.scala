package tg4s.models

/**
  * ShippingAddress
  * This object represents a shipping address.
  *
  * @param	country_code	ISO 3166-1 alpha-2 country code
  * @param	state	State, if applicable
  * @param	city	City
  * @param	street_line1	First line for the address
  * @param	street_line2	Second line for the address
  * @param	post_code	Address post code
  *
  */

case class ShippingAddress(
                            country_code: String,
                            state: String,
                            city: String,
                            street_line1: String,
                            street_line2: String,
                            post_code: String
                          )
