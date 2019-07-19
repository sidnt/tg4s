package tg4s.models

/**
  * Message
  * This object represents a message.
  *
  * @param	message_id	Unique message identifier inside this chat
  * @param	from	Optional. Sender, empty for messages sent to channels
  * @param	date	Date the message was sent in Unix time
  * @param	chat	Conversation the message belongs to
  * @param	forward_from	Optional. For forwarded messages, sender of the original message
  * @param	forward_from_chat	Optional. For messages forwarded from channels, information about the original channel
  * @param	forward_from_message_id	Optional. For messages forwarded from channels, identifier of the original message in the channel
  * @param	forward_signature	Optional. For messages forwarded from channels, signature of the post author if present
  * @param	forward_sender_name	Optional. Sender's name for messages forwarded from users who disallow adding a link to their account in forwarded messages
  * @param	forward_date	Optional. For forwarded messages, date the original message was sent in Unix time
  * @param	reply_to_message	Optional. For replies, the original message. Note that the Message object in this field will not contain further reply_to_message fields even if it itself is a reply.
  * @param	edit_date	Optional. Date the message was last edited in Unix time
  * @param	media_group_id	Optional. The unique identifier of a media message group this message belongs to
  * @param	author_signature	Optional. Signature of the post author for messages in channels
  * @param	text	Optional. For text messages, the actual UTF-8 text of the message, 0-4096 characters.
  * @param	entities	Optional. For text messages, special entities like usernames, URLs, bot commands, etc. that appear in the text
  * @param	caption_entities	Optional. For messages with a caption, special entities like usernames, URLs, bot commands, etc. that appear in the caption
  * @param	audio	Optional. Message is an audio file, information about the file
  * @param	document	Optional. Message is a general file, information about the file
  * @param	animation	Optional. Message is an animation, information about the animation. For backward compatibility, when this field is set, the document field will also be set
  * @param	game	Optional. Message is a game, information about the game. More about games »
  * @param	photo	Optional. Message is a photo, available sizes of the photo
  * @param	sticker	Optional. Message is a sticker, information about the sticker
  * @param	video	Optional. Message is a video, information about the video
  * @param	voice	Optional. Message is a voice message, information about the file
  * @param	video_note	Optional. Message is a video note, information about the video message
  * @param	caption	Optional. Caption for the animation, audio, document, photo, video or voice, 0-1024 characters
  * @param	contact	Optional. Message is a shared contact, information about the contact
  * @param	location	Optional. Message is a shared location, information about the location
  * @param	venue	Optional. Message is a venue, information about the venue
  * @param	poll	Optional. Message is a native poll, information about the poll
  * @param	new_chat_members	Optional. New members that were added to the group or supergroup and information about them (the bot itself may be one of these members)
  * @param	left_chat_member	Optional. A member was removed from the group, information about them (this member may be the bot itself)
  * @param	new_chat_title	Optional. A chat title was changed to this value
  * @param	new_chat_photo	Optional. A chat photo was change to this value
  * @param	delete_chat_photo	Optional. Service message: the chat photo was deleted
  * @param	group_chat_created	Optional. Service message: the group has been created
  * @param	supergroup_chat_created	Optional. Service message: the supergroup has been created. This field can‘t be received in a message coming through updates, because bot can’t be a member of a supergroup when it is created. It can only be found in reply_to_message if someone replies to a very first message in a directly created supergroup.
  * @param	channel_chat_created	Optional. Service message: the channel has been created. This field can‘t be received in a message coming through updates, because bot can’t be a member of a channel when it is created. It can only be found in reply_to_message if someone replies to a very first message in a channel.
  * @param	migrate_to_chat_id	Optional. The group has been migrated to a supergroup with the specified identifier. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
  * @param	migrate_from_chat_id	Optional. The supergroup has been migrated from a group with the specified identifier. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
  * @param	pinned_message	Optional. Specified message was pinned. Note that the Message object in this field will not contain further reply_to_message fields even if it is itself a reply.
  * @param	invoice	Optional. Message is an invoice for a payment, information about the invoice. More about payments »
  * @param	successful_payment	Optional. Message is a service message about a successful payment, information about the payment. More about payments »
  * @param	connected_website	Optional. The domain name of the website on which the user has logged in. More about Telegram Login »
  * @param	passport_data	Optional. Telegram Passport data
  * @param	reply_markup	Optional. Inline keyboard attached to the message. login_url buttons are represented as ordinary url buttons.
  *
  */

case class Message(
                    message_id: Int,
                    from: Option[User] = None,
                    date: Int,
                    chat: Chat,
                    forward_from: Option[User] = None,
                    forward_from_chat: Option[Chat] = None,
                    forward_from_message_id: Option[Int] = None,
                    forward_signature: Option[String] = None,
                    forward_sender_name: Option[String] = None,
                    forward_date: Option[Int] = None,
                    reply_to_message: Option[Message] = None,
                    edit_date: Option[Int] = None,
                    media_group_id: Option[String] = None,
                    author_signature: Option[String] = None,
                    text: Option[String] = None,
                    entities: Option[Seq[MessageEntity]] = None,
                    caption_entities: Option[Seq[MessageEntity]] = None,
                    audio: Option[Audio] = None,
                    document: Option[Document] = None,
                    animation: Option[Animation] = None,
                    game: Option[Game] = None,
                    photo: Option[Seq[PhotoSize]] = None,
                    sticker: Option[Sticker] = None,
                    video: Option[Video] = None,
                    voice: Option[Voice] = None,
                    video_note: Option[VideoNote] = None,
                    caption: Option[String] = None,
                    contact: Option[Contact] = None,
                    location: Option[Location] = None,
                    venue: Option[Venue] = None,
                    poll: Option[Poll] = None,
                    new_chat_members: Option[Seq[User]] = None,
                    left_chat_member: Option[User] = None,
                    new_chat_title: Option[String] = None,
                    new_chat_photo: Option[Seq[PhotoSize]] = None,
                    delete_chat_photo: Option[Boolean] = None,
                    group_chat_created: Option[Boolean] = None,
                    supergroup_chat_created: Option[Boolean] = None,
                    channel_chat_created: Option[Boolean] = None,
                    migrate_to_chat_id: Option[Int] = None,
                    migrate_from_chat_id: Option[Int] = None,
                    pinned_message: Option[Message] = None,
                    invoice: Option[Invoice] = None,
                    successful_payment: Option[SuccessfulPayment] = None,
                    connected_website: Option[String] = None,
                    passport_data: Option[PassportData] = None//,
                    //reply_markup: Option[InlineKeyboardMarkup] = None
                  )
