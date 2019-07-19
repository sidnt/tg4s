package tg4s.models

/**
  * Update
  * This object represents an incoming update.
  * At most one of the optional parameters can be present in any given update.
  *
  * @param	update_id	The update‘s unique identifier. Update identifiers start from a certain positive number and increase sequentially. This ID becomes especially handy if you’re using Webhooks, since it allows you to ignore repeated updates or to restore the correct update sequence, should they get out of order. If there are no new updates for at least a week, then identifier of the next update will be chosen randomly instead of sequentially.
  * @param	message	Optional. New incoming message of any kind — text, photo, sticker, etc.
  * @param	edited_message	Optional. New version of a message that is known to the bot and was edited
  * @param	channel_post	Optional. New incoming channel post of any kind — text, photo, sticker, etc.
  * @param	edited_channel_post	Optional. New version of a channel post that is known to the bot and was edited
  * @param	inline_query	Optional. New incoming inline query
  * @param	chosen_inline_result	Optional. The result of an inline query that was chosen by a user and sent to their chat partner. Please see our documentation on the feedback collecting for details on how to enable these updates for your bot.
  * @param	callback_query	Optional. New incoming callback query
  * @param	shipping_query	Optional. New incoming shipping query. Only for invoices with flexible price
  * @param	pre_checkout_query	Optional. New incoming pre-checkout query. Contains full information about checkout
  * @param	poll	Optional. New poll state. Bots receive only updates about stopped polls and polls, which are sent by the bot
  *
  */

case class Update(
                   update_id: Int,
                   message: Option[Message] = None,
                   edited_message: Option[Message] = None,
                   channel_post: Option[Message] = None,
                   edited_channel_post: Option[Message] = None,
                   inline_query: Option[InlineQuery] = None,
                   chosen_inline_result: Option[ChosenInlineResult] = None,
                   callback_query: Option[CallbackQuery] = None,
                   shipping_query: Option[ShippingQuery] = None,
                   pre_checkout_query: Option[PreCheckoutQuery] = None,
                   poll: Option[Poll] = None
                 ) {

  require(
    Seq[Option[_]](
      message,
      edited_message,
      channel_post,
      edited_channel_post,
      inline_query,
      chosen_inline_result,
      callback_query,
      shipping_query,
      pre_checkout_query,
      poll
    ).count(_.isDefined) == 1,
    "Exactly one of the optional fields should be used"
  )
}
