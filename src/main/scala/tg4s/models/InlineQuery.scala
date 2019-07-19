package tg4s.models

/**
  * InlineQuery
  * This object represents an incoming inline query. When the user sends an empty query, your bot could return some default or trending results.
  *
  * @param	id	Unique identifier for this query
  * @param	from	Sender
  * @param	location	Optional. Sender location, only for bots that request user location
  * @param	query	Text of the query (up to 512 characters)
  * @param	offset	Offset of the results to be returned, can be controlled by the bot
  *
  */

case class InlineQuery(
                        id: String,
                        from: User,
                        location: Option[Location] = None,
                        query: String,
                        offset: String
                      )
