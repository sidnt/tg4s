package example

import tapir._
import tapir.json.circe._
import io.circe.generic.auto._

import tg4s.models._

object endpoints {

  val ep1 = endpoint
    .post
    .in("ep1")
    .in(jsonBody[Message])
    .errorOut(stringBody)

  val ep2 = endpoint
    .post
    .in("ep2")
    .in(jsonBody[User])
    .errorOut(stringBody)

  val ep3 = endpoint
    .post
    .in("ep3")
    .in(jsonBody[Chat])
    .errorOut(stringBody)

  val ep4 = endpoint
    .post
    .in("ep4")
    .in(jsonBody[CallbackQuery])
    .errorOut(stringBody)

  val ep5 = endpoint
    .post
    .in("ep5")
    .in(jsonBody[Update])
    .errorOut(stringBody)

  val ep6 = endpoint
    .post
    .in("ep6")
    .in(jsonBody[TestPet])
    .errorOut(stringBody)

}
