package tg4s.models

/**
  * MessageEntity
  * This object represents one special entity in a text message. For example, hashtags, usernames, URLs, etc.
  *
  * @param	type	Type of the entity. Can be mention (@username), hashtag, cashtag, bot_command, url, email, phone_number, bold (bold text), italic (italic text), code (monowidth string), pre (monowidth block), text_link (for clickable text URLs), text_mention (for users without usernames)
  * @param	offset	Offset in UTF-16 code units to the start of the entity
  * @param	length	Length of the entity in UTF-16 code units
  * @param	url	Optional. For “text_link” only, url that will be opened after user taps on the text
  * @param	user	Optional. For “text_mention” only, the mentioned user
  *
  */

case class MessageEntity(
                          `type`: String,
                          offset: Int,
                          length: Int,
                          url: Option[String] = None,
                          user: Option[User] = None
                        )
