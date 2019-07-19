package tg4s.models

/**
  * PassportFile
  * This object represents a file uploaded to Telegram Passport. Currently all Telegram Passport files are in JPEG format when decrypted and don't exceed 10MB.
  *
  * @param	file_id	Unique identifier for this file
  * @param	file_size	File size
  * @param	file_date	Unix time when the file was uploaded
  *
  */

case class PassportFile(
                         file_id: String,
                         file_size: Int,
                         file_date: Int
                       )
