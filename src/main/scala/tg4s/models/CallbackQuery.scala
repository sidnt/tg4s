package tg4s.models

/**
  * CallbackQuery
  * This object represents an incoming callback query from a callback button in an inline keyboard. If the button that originated the query was attached to a message sent by the bot, the field message will be present. If the button was attached to a message sent via the bot (in inline mode), the field inline_message_id will be present. Exactly one of the fields data or game_short_name will be present.
  * NOTE: After the user presses a callback button, Telegram clients will display a progress bar until you call answerCallbackQuery. It is, therefore, necessary to react by calling answerCallbackQuery even if no notification to the user is needed (e.g., without specifying any of the optional parameters).
  *
  * @param	id	Unique identifier for this query
  * @param	from	Sender
  * @param	message	Optional. Message with the callback button that originated the query. Note that message content and message date will not be available if the message is too old
  * @param	inline_message_id	Optional. Identifier of the message sent via the bot in inline mode, that originated the query.
  * @param	chat_instance	Global identifier, uniquely corresponding to the chat to which the message with the callback button was sent. Useful for high scores in games.
  * @param	data	Optional. Data associated with the callback button. Be aware that a bad client can send arbitrary data in this field.
  * @param	game_short_name	Optional. Short name of a Game to be returned, serves as the unique identifier for the game
  *
  */

case class CallbackQuery(
                          id: String,
                          from: User,
                          message: Option[Message] = None,
                          inline_message_id: Option[String] = None,
                          chat_instance: String,
                          data: Option[String] = None,
                          game_short_name: Option[String] = None
                        )
