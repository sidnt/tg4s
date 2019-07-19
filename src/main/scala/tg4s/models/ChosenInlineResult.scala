package tg4s.models

/**
  * ChosenInlineResult
  * Represents a result of an inline query that was chosen by the user and sent to their chat partner.
  * Note: It is necessary to enable inline feedback via @Botfather in order to receive these objects in updates.
  *
  * @param	result_id	The unique identifier for the result that was chosen
  * @param	from	The user that chose the result
  * @param	location	Optional. Sender location, only for bots that require user location
  * @param	inline_message_id	Optional. Identifier of the sent inline message. Available only if there is an inline keyboard attached to the message. Will be also received in callback queries and can be used to edit the message.
  * @param	query	The query that was used to obtain the result
  *
  */

case class ChosenInlineResult(
                               result_id: String,
                               from: User,
                               location: Option[Location] = None,
                               inline_message_id: Option[String] = None,
                               query: String
                             )
