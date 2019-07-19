package tg4s.models

/**
  * Video
  * This object represents a video file.
  *
  * @param	file_id	Unique identifier for this file
  * @param	width	Video width as defined by sender
  * @param	height	Video height as defined by sender
  * @param	duration	Duration of the video in seconds as defined by sender
  * @param	thumb	Optional. Video thumbnail
  * @param	mime_type	Optional. Mime type of a file as defined by sender
  * @param	file_size	Optional. File size
  *
  */

case class Video(
                  file_id: String,
                  width: Int,
                  height: Int,
                  duration: Int,
                  thumb: Option[PhotoSize] = None,
                  mime_type: Option[String] = None,
                  file_size: Option[Int] = None
                )
