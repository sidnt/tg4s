package tg4s.models

/**
  * VideoNote
  * This object represents a video message (available in Telegram apps as of v.4.0).
  *
  * @param	file_id	Unique identifier for this file
  * @param	length	Video width and height (diameter of the video message) as defined by sender
  * @param	duration	Duration of the video in seconds as defined by sender
  * @param	thumb	Optional. Video thumbnail
  * @param	file_size	Optional. File size
  *
  */

case class VideoNote(
                      file_id: String,
                      length: Int,
                      duration: Int,
                      thumb: Option[PhotoSize] = None,
                      file_size: Option[Int] = None
                    )
