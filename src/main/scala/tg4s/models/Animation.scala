package tg4s.models

/**
  * Animation
  * This object represents an animation file (GIF or H.264/MPEG-4 AVC video without sound).
  *
  * @param	file_id	Unique file identifier
  * @param	width	Video width as defined by sender
  * @param	height	Video height as defined by sender
  * @param	duration	Duration of the video in seconds as defined by sender
  * @param	thumb	Optional. Animation thumbnail as defined by sender
  * @param	file_name	Optional. Original animation filename as defined by sender
  * @param	mime_type	Optional. MIME type of the file as defined by sender
  * @param	file_size	Optional. File size
  *
  */

case class Animation(
                      file_id: String,
                      width: Int,
                      height: Int,
                      duration: Int,
                      thumb: Option[PhotoSize] = None,
                      file_name: Option[String] = None,
                      mime_type: Option[String] = None,
                      file_size: Option[Int] = None
                    )
