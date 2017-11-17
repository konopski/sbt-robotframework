organization := "eu.konopski"

name := "sbt-robotframework"

description := "Sbt plugin to launch robotframework"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.6"

sbtPlugin := true

libraryDependencies ++= Seq( "org.robotframework" % "robotframework" % "3.0.2" )

