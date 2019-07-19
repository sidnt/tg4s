package tg4s.models

/**
  * ShippingQuery
  * This object contains information about an incoming shipping query.
  *
  * @param	id	Unique query identifier
  * @param	from	User who sent the query
  * @param	invoice_payload	Bot specified invoice payload
  * @param	shipping_address	User specified shipping address
  *
  */

case class ShippingQuery(
                          id: String,
                          from: User,
                          invoice_payload: String,
                          shipping_address: ShippingAddress
                        )
