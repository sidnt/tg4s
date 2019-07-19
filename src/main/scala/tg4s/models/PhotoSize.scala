package tg4s.models

/**
  * PhotoSize
  * This object represents one size of a photo or a file / sticker thumbnail.
  *
  * @param	file_id	Unique identifier for this file
  * @param	width	Photo width
  * @param	height	Photo height
  * @param	file_size	Optional. File size
  *
  */

case class PhotoSize(
                      file_id: String,
                      width: Int,
                      height: Int,
                      file_size: Option[Int] = None
                    )

