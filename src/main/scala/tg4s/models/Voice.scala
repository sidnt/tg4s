package tg4s.models

/**
  * Voice
  * This object represents a voice note.
  *
  * @param	file_id	Unique identifier for this file
  * @param	duration	Duration of the audio in seconds as defined by sender
  * @param	mime_type	Optional. MIME type of the file as defined by sender
  * @param	file_size	Optional. File size
  *
  */

case class Voice(
                  file_id: String,
                  duration: Int,
                  mime_type: Option[String] = None,
                  file_size: Option[Int] = None
                )
