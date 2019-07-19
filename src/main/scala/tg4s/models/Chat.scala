package tg4s.models

/**
  * Chat
  * This object represents a chat.
  *
  * @param	id	Unique identifier for this chat. This number may be greater than 32 bits and some programming languages may have difficulty/silent defects in interpreting it. But it is smaller than 52 bits, so a signed 64 bit integer or double-precision float type are safe for storing this identifier.
  * @param	type	Type of chat, can be either “private”, “group”, “supergroup” or “channel”
  * @param	title	Optional. Title, for supergroups, channels and group chats
  * @param	username	Optional. Username, for private chats, supergroups and channels if available
  * @param	first_name	Optional. First name of the other party in a private chat
  * @param	last_name	Optional. Last name of the other party in a private chat
  * @param	all_members_are_administrators	Optional. True if a group has ‘All Members Are Admins’ enabled.
  * @param	photo	Optional. Chat photo. Returned only in getChat.
  * @param	description	Optional. Description, for supergroups and channel chats. Returned only in getChat.
  * @param	invite_link	Optional. Chat invite link, for supergroups and channel chats. Each administrator in a chat generates their own invite links, so the bot must first generate the link using exportChatInviteLink. Returned only in getChat.
  * @param	pinned_message	Optional. Pinned message, for groups, supergroups and channels. Returned only in getChat.
  * @param	sticker_set_name	Optional. For supergroups, name of group sticker set. Returned only in getChat.
  * @param	can_set_sticker_set	Optional. True, if the bot can change the group sticker set. Returned only in getChat.
  *
  */

case class Chat(
                 id: Int,
                 `type`: String,
                 title: Option[String] = None,
                 username: Option[String] = None,
                 first_name: Option[String] = None,
                 last_name: Option[String] = None,
                 all_members_are_administrators: Option[Boolean] = None,
                 photo: Option[ChatPhoto] = None,
                 description: Option[String] = None,
                 invite_link: Option[String] = None,
                 pinned_message: Option[Message] = None,
                 sticker_set_name: Option[String] = None,
                 can_set_sticker_set: Option[Boolean] = None
               )
