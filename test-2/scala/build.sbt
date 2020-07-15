import Dependencies._

ThisBuild / scalaVersion := "2.13.1"
ThisBuild / version := "0.1.0"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(name := "scala-test-2", libraryDependencies += scalaTest % Test)

libraryDependencies += "com.lihaoyi" %% "pprint" % "0.5.6"
