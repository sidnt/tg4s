package tg4s.models

/**
  * ChatPhoto
  * This object represents a chat photo.
  *
  * @param	small_file_id	Unique file identifier of small (160x160) chat photo. This file_id can be used only for photo download.
  * @param	big_file_id	Unique file identifier of big (640x640) chat photo. This file_id can be used only for photo download.
  *
  */

case class ChatPhoto(
                      small_file_id: String,
                      big_file_id: String
                    )
