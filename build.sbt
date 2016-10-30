import sbt.Keys._
import sbt._

name := "todos"

resolvers += Resolver.sonatypeRepo("public")
scalaVersion := "2.11.8"
assemblyJarName in assembly := "todos.jar"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-events" % "1.1.0",
  "com.amazonaws" % "aws-lambda-java-core" % "1.1.0",
  "com.github.seratch" %% "awscala" % "0.5.+",
  "org.json4s" %% "json4s-native" % "3.4.2"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Xfatal-warnings")
