package tg4s.models

/**
  * Venue
  * This object represents a venue.
  *
  * @param	location	Venue location
  * @param	title	Name of the venue
  * @param	address	Address of the venue
  * @param	foursquare_id	Optional. Foursquare identifier of the venue
  * @param	foursquare_type	Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
  *
  */

case class Venue(
                  location: Location,
                  title: String,
                  address: String,
                  foursquare_id: Option[String] = None,
                  foursquare_type: Option[String] = None
                )
