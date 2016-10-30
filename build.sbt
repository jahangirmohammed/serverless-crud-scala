import sbt.Keys._
import sbt._
import sbtrelease.Version

name := "todos"

resolvers += Resolver.sonatypeRepo("public")
scalaVersion := "2.11.8"
assemblyJarName in assembly := "todos.jar"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-lambda-java-events" % "1.1.0",
  "com.amazonaws" % "aws-lambda-java-core" % "1.1.0",
  "com.amazonaws" % "aws-java-sdk-dynamodb" % "1.11.48"
)

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-feature",
  "-Xfatal-warnings")
