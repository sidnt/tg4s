package tg4s.models

/**
  * Poll
  * This object contains information about a poll.
  *
  * @param	id	Unique poll identifier
  * @param	question	Poll question, 1-255 characters
  * @param	options	List of poll options
  * @param	is_closed	True, if the poll is closed
  *
  */

case class Poll(
                 id: String,
                 question: String,
                 options: Seq[PollOption],
                 is_closed: Boolean
               )
