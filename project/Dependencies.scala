import sbt._

object Dependencies {

  lazy val tapirV = "0.9.0"
  lazy val tapirJsonCirceV = "0.9.0"

  lazy val tapirCore = "com.softwaremill.tapir" %% "tapir-core" % tapirV
  lazy val tapirJsonCirce = "com.softwaremill.tapir" %% "tapir-json-circe" % tapirJsonCirceV

}
