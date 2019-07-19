package tg4s.models

/**
  * Document
  * This object represents a general file (as opposed to photos, voice messages and audio files).
  *
  * @param	file_id	Unique file identifier
  * @param	thumb	Optional. Document thumbnail as defined by sender
  * @param	file_name	Optional. Original filename as defined by sender
  * @param	mime_type	Optional. MIME type of the file as defined by sender
  * @param	file_size	Optional. File size
  *
  */

case class Document(
                     file_id: String,
                     thumb: Option[PhotoSize] = None,
                     file_name: Option[String] = None,
                     mime_type: Option[String] = None,
                     file_size: Option[Int] = None
                   )

