name := "macwire"
organization := "com.shawdubie"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "org.scalatestplus.play"   %% "scalatestplus-play" % "3.0.0-M3" % Test,
  "com.softwaremill.macwire" %% "macros"             % "2.3.0"    % Provided,
)
