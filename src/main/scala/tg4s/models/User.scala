package tg4s.models

/**
  * User
  * This object represents a Telegram user or bot.
  * @param	id	Unique identifier for this user or bot
  * @param	is_bot	True, if this user is a bot
  * @param	first_name	User‘s or bot’s first name
  * @param	last_name	Optional. User‘s or bot’s last name
  * @param	username	Optional. User‘s or bot’s username
  * @param	language_code	Optional. IETF language tag of the user's language
  */

case class User(
                 id: Int,
                 is_bot: Boolean,
                 first_name: String,
                 last_name: Option[String],
                 username: Option[String],
                 language_code: Option[String]
               )
