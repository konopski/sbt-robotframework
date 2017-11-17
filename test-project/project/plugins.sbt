// build root project
lazy val root = Project("plugins", file(".")) dependsOn(sbtRobotframeworkPlugin)

// depends on the robotframework project
lazy val sbtRobotframeworkPlugin = file("..").getAbsoluteFile.toURI