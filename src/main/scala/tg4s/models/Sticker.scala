package tg4s.models

/**
  * Sticker
  * This object represents a sticker.
  *
  * @param	file_id	Unique identifier for this file
  * @param	width	Sticker width
  * @param	height	Sticker height
  * @param	thumb	Optional. Sticker thumbnail in the .webp or .jpg format
  * @param	emoji	Optional. Emoji associated with the sticker
  * @param	set_name	Optional. Name of the sticker set to which the sticker belongs
  * @param	mask_position	Optional. For mask stickers, the position where the mask should be placed
  * @param	file_size	Optional. File size
  *
  */

case class Sticker(
                    file_id: String,
                    width: Int,
                    height: Int,
                    thumb: Option[PhotoSize] = None,
                    emoji: Option[String] = None,
                    set_name: Option[String] = None,
                    mask_position: Option[MaskPosition] = None,
                    file_size: Option[Int] = None
                  )
