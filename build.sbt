import Dependencies._

ThisBuild / scalaVersion     := "2.12.8"
ThisBuild / version          := "0.0.1"

lazy val root = (project in file("."))
  .settings(
    name := "tg4s",
    libraryDependencies ++= Seq(
      tapirCore,
      tapirJsonCirce
    )
  )
