package tg4s.models

/**
  * PollOption
  * This object contains information about one answer option in a poll.
  *
  * @param	text	Option text, 1-100 characters
  * @param	voter_count	Number of users that voted for this option
  *
  */

case class PollOption(
                       text: String,
                       voter_count: Int
                     )
