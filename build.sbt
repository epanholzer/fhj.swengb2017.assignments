import sbt._
import Dependencies._
import BuildConstants._

// ------------------------------------------------------
// main project
lazy val assignments = (project in file(".")).
  settings(
    organization := org,
    scalaVersion := scalaVer,
    version := buildVer,
    name := "assignments",
    libraryDependencies += scalaTest
  )

// ------------------------------------------------------
// common
lazy val tutorial = (project in file("tutorial/")).
  settings(
    organization := org,
    scalaVersion := scalaVer,
    version := buildVer,
    name := "tutorial",
    libraryDependencies += scalaTest,
    fork := true
  )



lazy val functional = (project in file("functional/")).
 settings(
    organization := org,
    scalaVersion := scalaVer,
    version := buildVer,
    name := "functional",
    libraryDependencies += scalaTest,
    fork := true
  )

