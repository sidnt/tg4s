package tg4s.models

/**
  * Contact
  * This object represents a phone contact.
  *
  * @param	phone_number	Contact's phone number
  * @param	first_name	Contact's first name
  * @param	last_name	Optional. Contact's last name
  * @param	user_id	Optional. Contact's user identifier in Telegram
  * @param	vcard	Optional. Additional data about the contact in the form of a vCard
  *
  */

case class Contact(
                    phone_number: String,
                    first_name: String,
                    last_name: Option[String] = None,
                    user_id: Option[Int] = None,
                    vcard: Option[String] = None
                  )
