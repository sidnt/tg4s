package tg4s.models

/**
  * Audio
  * This object represents an audio file to be treated as music by the Telegram clients.
  *
  * @param	file_id	Unique identifier for this file
  * @param	duration	Duration of the audio in seconds as defined by sender
  * @param	performer	Optional. Performer of the audio as defined by sender or by audio tags
  * @param	title	Optional. Title of the audio as defined by sender or by audio tags
  * @param	mime_type	Optional. MIME type of the file as defined by sender
  * @param	file_size	Optional. File size
  * @param	thumb	Optional. Thumbnail of the album cover to which the music file belongs
  *
  */

case class Audio(
                  file_id: String,
                  duration: Int,
                  performer: Option[String] = None,
                  title: Option[String] = None,
                  mime_type: Option[String] = None,
                  file_size: Option[Int] = None,
                  thumb: Option[PhotoSize] = None
                )
