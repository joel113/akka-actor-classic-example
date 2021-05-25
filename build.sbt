name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.13.1"

lazy val akkaVersion = "2.6.14"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-classic" % akkaVersion,
  "com.typesafe.akka" %% "akka-actor-testkit-classic" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.1.0" % Test
)
